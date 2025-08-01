package jkind.engines.ivcs;

import static java.util.stream.Collectors.toList;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jkind.ExitCodes;
import jkind.JKindException;
import jkind.JKindSettings;
import jkind.SolverOption;
import jkind.StdErr;
import jkind.engines.Director;
import jkind.engines.MiniJKind;
import jkind.engines.SolverBasedEngine;
import jkind.engines.SolverUtil;
import jkind.engines.messages.BaseStepMessage;
import jkind.engines.messages.EngineType;
import jkind.engines.messages.InductiveCounterexampleMessage;
import jkind.engines.messages.InvalidMessage;
import jkind.engines.messages.InvariantMessage;
import jkind.engines.messages.Itinerary;
import jkind.engines.messages.UnknownMessage;
import jkind.engines.messages.ValidMessage;
import jkind.lustre.Expr;
import jkind.lustre.NamedType;
import jkind.lustre.Program;
import jkind.lustre.VarDecl;
import jkind.sexp.Cons;
import jkind.sexp.Sexp;
import jkind.sexp.Symbol;
import jkind.solvers.Model;
import jkind.solvers.Result;
import jkind.solvers.SatResult;
import jkind.solvers.Solver;
import jkind.solvers.UnknownResult;
import jkind.solvers.UnsatResult;
import jkind.solvers.z3.Z3Solver;
import jkind.translation.Lustre2Sexp;
import jkind.translation.Specification;
import jkind.util.ExceptionUtil;
import jkind.util.LinkedBiMap;
import jkind.util.SexpUtil;

public class AllIvcsExtractorEngine extends SolverBasedEngine {
	public static final String NAME = "all-ivc-computer";
	private final LinkedBiMap<String, Symbol> ivcMap;
	private Sexp map;
	private List<SeedPair> shrinkingPool = new ArrayList<SeedPair>();
	private List<List<Symbol>> growingPool = new ArrayList<List<Symbol>>();

	private Z3Solver z3Solver;
	private Set<String> mustElements = new HashSet<>();
	private Set<String> mayElements = new HashSet<>();
	Set<AllIVCs> allIvcs = new HashSet<>();
	private int TIMEOUT;
	private boolean timedoutLoop = false;
	private double runtime;

	private class SeedPair {
		public List<Symbol> properties;
		public List<String> invariants;

		public SeedPair(List<Symbol> p, List<String> i) {
			properties = new ArrayList<Symbol>(p);
			invariants = new ArrayList<String>(i);
		}

		public SeedPair(List<Symbol> p) {
			properties = new ArrayList<Symbol>(p);
			invariants = new ArrayList<String>();
		}
	}

	public AllIvcsExtractorEngine(Specification spec, JKindSettings settings, Director director) {
		super(NAME, spec, settings, director);
		ivcMap = Lustre2Sexp.createIvcMap(spec.node.ivc);
	}

	@Override
	protected Solver getSolver() {
		return SolverUtil.getSolver(SolverOption.Z3, getScratchBase(), spec.node);
	}

	@Override
	protected void initializeSolver() {
		solver = getSolver();
		solver.initialize();
		z3Solver = (Z3Solver) solver;

		for (Symbol e : ivcMap.values()) {
			solver.define(new VarDecl(e.str, NamedType.BOOL));
		}
	}

	@Override
	public void main() {
		processMessagesAndWaitUntil(() -> properties.isEmpty());
	}

	private void reduce(ValidMessage vm) {
		runtime = System.currentTimeMillis();
		for (String property : vm.valid) {
			mayElements.clear();
			mustElements.clear();
			if (spec.node.ivc.isEmpty()) {
				StdErr.warning(NAME + ": --%IVC option has no argument for property  " + property.toString());
				sendValid(property.toString(), vm);
				return;
			}

			if (vm.ivc.isEmpty()) {
				System.out.println("The high level property " + property
						+ " can be proved without using any of the --%IVC annotated low level properties.");
				sendValid(property.toString(), vm);
				return;
			}
			System.out.println("Proving the high level property " + property
					+ " might require to use some of the --%IVC annotated low level properties.");
			if (properties.remove(property)) {
				switch (settings.allIvcsAlgorithm) {
				case OFFLINE_MIVC_ENUM_ALG: // offline MIVC enumeration
					System.out.println("Starting MIVC enumeration using the offline enumeration algorithm.");
					computeAllIvcs(IvcUtil.getInvariantByName(property, vm.invariants), vm);
					break;
				case ONLINE_MIVC_ENUM_ALG: // online MIVC enumeration
					System.out.println("Starting MIVC enumeration using the online enumeration algorithm.");
					computeAllIvcsOnline(IvcUtil.getInvariantByName(property, vm.invariants), vm);
					break;
				}
				allIvcs.clear();
			}

		}
	}

	/**
	 * offline MIVC enumeration algorithm as described in the FMCAD 2017 paper
	 **/
	private void computeAllIvcs(Expr property, ValidMessage vm) {
		TIMEOUT = (settings.allIvcsJkindTimeout < 0) ? (30 + (int) (vm.proofTime * 5)) : settings.allIvcsJkindTimeout;
		List<Symbol> seed = new ArrayList<Symbol>();
		Set<String> mustChckList = new HashSet<>();
		Set<String> resultOfIvcFinder = new HashSet<>();
		List<String> inv = vm.invariants.stream().map(Object::toString).collect(toList());
		allIvcs.add(new AllIVCs(vm.ivc, inv));
		seed.addAll(IvcUtil.getIvcLiterals(ivcMap, new ArrayList<>(vm.ivc)));
		map = blockUp(seed);

		mustElements.add(property.toString());
		if (ivcMap.containsKey(property.toString())) {
			map = new Cons("and", map, ivcMap.get(property.toString()));
		}
		z3Solver.push();
		while (checkMapSatisfiability(seed, mustChckList, true)) {
			resultOfIvcFinder.clear();
			if (ivcFinder(seed, resultOfIvcFinder, mustChckList, property.toString())) {
				map = new Cons("and", map, blockUp(IvcUtil.getIvcLiterals(ivcMap, resultOfIvcFinder)));
			} else {
				map = new Cons("and", map, blockDown(IvcUtil.getIvcLiterals(ivcMap, resultOfIvcFinder)));
			}
		}

		// it is possible that the resultant MIVC is empty (not a bug! this is expected behavior)
		if (allIvcs.size() == 1 && allIvcs.iterator().next().getAllIVCSet().size() == 0) {
			System.out.println("The high level property " + property
					+ " can be proved without using any of the --%IVC annotated low level properties.");
			allIvcs.clear();
		}
		System.out.println("MIVC enumeration completed.");
		z3Solver.pop();
		sendValid(property.toString(), vm);
	}

	/**
	 * JB, online MIVC enumeration algorithm as described in the SEFM 2018 paper
	 **/
	private void computeAllIvcsOnline(Expr property, ValidMessage vm) {
		TIMEOUT = (settings.allIvcsJkindTimeout < 0) ? (30 + (int) (vm.proofTime * 5)) : settings.allIvcsJkindTimeout;
		List<Symbol> seed = new ArrayList<Symbol>();
		seed.addAll(IvcUtil.getIvcLiterals(ivcMap, new ArrayList<>(vm.ivc)));
		map = blockUp(seed);
		List<String> inv = vm.invariants.stream().map(Object::toString).collect(toList());
		shrinkingPool.add(new SeedPair(new ArrayList<Symbol>(seed), inv));

		mustElements.add(property.toString());
		if (ivcMap.containsKey(property.toString())) {
			map = new Cons("and", map, ivcMap.get(property.toString()));
		}
		z3Solver.push();

		seed = getMaximalUnexplored(new ArrayList<Symbol>());
		while (!seed.isEmpty()) {
			SeedPair seedPair = new SeedPair(seed);
			if (ivcFinderSimple(seedPair, property.toString(), true)) {
				mapShrink(seedPair, property.toString());
			} else {
				map = new Cons("and", map, blockDownComplement(seed));
			}
			while (!shrinkingPool.isEmpty()) {
				SeedPair ivc = shrinkingPool.get(0);
				shrinkingPool.remove(0);
				mapShrink(ivc, property.toString());
			}
			seed = getMaximalUnexplored(new ArrayList<Symbol>());
		}

		// it is possible that the resultant MIVC is empty (not a bug! this is expected behavior)
		if (allIvcs.size() == 1 && allIvcs.iterator().next().getAllIVCSet().size() == 0) {
			System.out.println("The high level property " + property
					+ " can be proved without using any of the --%IVC annotated low level properties.");
			allIvcs.clear();
		}
		System.out.println("MIVC enumeration completed.");
		z3Solver.pop();
		sendValid(property.toString(), vm);

	}

	private boolean ivcFinder(List<Symbol> seed, Set<String> resultOfIvcFinder, Set<String> mustChckList,
			String property) {
		JKindSettings js = new JKindSettings();
		js.reduceIvc = true;
		js.timeout = TIMEOUT;
		js.solver = settings.solver;
		js.slicing = true;
		js.pdrMax = settings.pdrMax;
		js.boundedModelChecking = settings.boundedModelChecking;
		js.miniJkind = true;
		js.readAdvice = settings.readAdvice;
		js.writeAdvice = settings.writeAdvice;
		Set<String> wantedElem = IvcUtil.getIvcNames(ivcMap, new ArrayList<>(seed));
		List<String> deactivate = new ArrayList<>();
		deactivate.addAll(ivcMap.keyList());
		deactivate.removeAll(wantedElem);

		Program nodeSpec = new Program(IvcUtil.unassign(spec.node, deactivate, property));
		Specification newSpec = new Specification(nodeSpec, js.slicing);
		if (settings.scratch) {
			comment("Sending a request for a new IVC while deactivating " + IvcUtil.getIvcLiterals(ivcMap, deactivate));
		}
		MiniJKind miniJkind = new MiniJKind(nodeSpec, newSpec, js);
		miniJkind.verify();

		if (miniJkind.getPropertyStatus().equals(MiniJKind.UNKNOWN)) {
			timedoutLoop = true;
		}
		if (miniJkind.getPropertyStatus().equals(MiniJKind.UNKNOWN_WITH_EXCEPTION)) {
			js.pdrMax = 0;
			return retryVerification(nodeSpec, newSpec, property, js, resultOfIvcFinder, mustChckList, deactivate);
		} else if (miniJkind.getPropertyStatus().equals(MiniJKind.VALID)) {
			mayElements.addAll(deactivate);
			mustChckList.removeAll(deactivate);

			resultOfIvcFinder.addAll(miniJkind.getPropertyIvc());
			Set<String> newIvc = resultOfIvcFinder;

			if (settings.scratch) {
				comment("New IVC set found: " + IvcUtil.getIvcLiterals(ivcMap, resultOfIvcFinder));
			}

			Set<AllIVCs> temp = new HashSet<>();

			for (AllIVCs curr : allIvcs) {
				Set<String> trimmed = curr.getAllIVCSet();
				if (trimmed.containsAll(newIvc)) {
					temp.add(curr);
				}
				// the else part can only happen
				// while processing mustChckList after finding all IVC sets
				// if we have different instances of a node in the Lustre file
				else if (newIvc.containsAll(trimmed)) {
					return true;
				}
			}
			if (temp.isEmpty()) {
				allIvcs.add(new AllIVCs(miniJkind.getPropertyIvc(),
						miniJkind.getPropertyInvariants()));
			} else {
				allIvcs.removeAll(temp);
				allIvcs.add(new AllIVCs(miniJkind.getPropertyIvc(),
						miniJkind.getPropertyInvariants()));
			}
			return true;
		} else {
			resultOfIvcFinder.addAll(deactivate);
			if (settings.scratch) {
				comment("Property got violated. Adding back the elements");
			}

			if (deactivate.size() == 1) {
				mustElements.addAll(deactivate);
				mustChckList.removeAll(deactivate);
				if (settings.scratch) {
					comment("One MUST element was found: " + IvcUtil.getIvcLiterals(ivcMap, deactivate));
				}
			} else {
				deactivate.removeAll(mustElements);
				deactivate.removeAll(mayElements);
				if (settings.scratch) {
					comment(IvcUtil.getIvcLiterals(ivcMap, deactivate)
							+ " could be MUST elements; added to the check list...");
				}

				mustChckList.addAll(deactivate);
			}
			return false;
		}
	}

	private boolean ivcFinderSimple(SeedPair seed, String property, boolean reduceSeed) {
		JKindSettings js = new JKindSettings();
		js.reduceIvc = true;
		js.timeout = TIMEOUT;
		js.solver = settings.solver;
		js.slicing = true;
		js.pdrMax = settings.pdrMax;
		js.boundedModelChecking = settings.boundedModelChecking;
		js.miniJkind = true;
		js.readAdvice = settings.readAdvice;
		js.writeAdvice = settings.writeAdvice;
		Set<String> wantedElem = IvcUtil.getIvcNames(ivcMap, new ArrayList<>(seed.properties));
		List<String> deactivate = new ArrayList<>();
		deactivate.addAll(ivcMap.keyList());
		deactivate.removeAll(wantedElem);

		Program nodeSpec = new Program(IvcUtil.unassign(spec.node, deactivate, property));
		Specification newSpec = new Specification(nodeSpec, js.slicing);

		MiniJKind miniJkind = new MiniJKind(nodeSpec, newSpec, js);
		miniJkind.verify();

		if (miniJkind.getPropertyStatus().equals(MiniJKind.UNKNOWN)) {
			timedoutLoop = true;
		}
		if (miniJkind.getPropertyStatus().equals(MiniJKind.UNKNOWN_WITH_EXCEPTION)) {
			js.pdrMax = 0;
		}
		if (miniJkind.getPropertyStatus().equals(MiniJKind.VALID)) {
			seed.invariants = miniJkind.getPropertyInvariants();
			if (reduceSeed) {
				seed.properties = IvcUtil.getIvcLiterals(ivcMap, miniJkind.getPropertyIvc());
			}
			return true;
		} else {
			if (deactivate.size() == 1) {
				mustElements.addAll(deactivate);
			}
			return false;
		}
	}

	private boolean Grow(List<Symbol> seed, String property) {
		List<Symbol> top = getMaximalUnexplored(seed);
		SeedPair approx = new SeedPair(top);
		List<Symbol> added = new ArrayList<Symbol>(top);
		added.removeAll(seed);

		while (ivcFinderSimple(approx, property.toString(), true)) {
			List<SeedPair> toRemove = new ArrayList<SeedPair>();
			for (SeedPair s : shrinkingPool) {
				if (s.properties.containsAll(approx.properties)) {
					toRemove.add(s);
				}
			}
			shrinkingPool.removeAll(toRemove);
			map = new Cons("and", map, blockUp(approx.properties));
			shrinkingPool.add(approx);

			boolean reduced = false;
			for (Symbol s : approx.properties) {
				if (added.contains(s)) {
					added.remove(s);
					top.remove(s);
					reduced = true;
					break;
				}
			}
			if (!reduced) {
				break;
			}
			approx = new SeedPair(top);
		}
		map = new Cons("and", map, blockDownComplement(top));
		return true;
	}

	private boolean isUnexplored(List<Symbol> seed) {
		z3Solver.push();
		List<Symbol> positiveLits = new ArrayList<Symbol>(seed);
		List<Symbol> negatedLits = new ArrayList<>(ivcMap.valueList());
		negatedLits.removeAll(seed);

		for (Symbol s : negatedLits) {
			if (mustElements.contains(s.toString())) {
				return false;
			}
		}

		solver.assertSexp(map);

		Result result = z3Solver.checkValuation(positiveLits, negatedLits, false);
		z3Solver.pop();
		if (result instanceof UnsatResult) {
			return false;
		} else if (result instanceof UnknownResult) {
			throw new JKindException("Unknown result in solving map");
		}

		return true;
	}

	private boolean mapShrink(SeedPair seed, String property) {
		List<Symbol> candidates = new ArrayList<Symbol>(seed.properties);
		for (Symbol c : candidates) {
			seed.properties.remove(c);
			if (mustElements.contains(c.toString()) || !isUnexplored(seed.properties)) {
				seed.properties.add(c);
				continue;
			}

			if (!ivcFinderSimple(seed, property, false)) {
				ArrayList<Symbol> copy = new ArrayList<Symbol>(seed.properties);
				growingPool.add(copy);
				seed.properties.add(c);
			}
		}
		map = new Cons("and", map, blockUp(seed.properties));
		markMIVC(seed);

		List<SeedPair> toRemove = new ArrayList<SeedPair>();
		for (SeedPair s : shrinkingPool) {
			if (s.properties.containsAll(seed.properties)) {
				toRemove.add(s);
			}
		}
		shrinkingPool.removeAll(toRemove);

		int remainingGrows = settings.allIvcsMaxGrows;
		while (!growingPool.isEmpty()) {
			List<Symbol> is = growingPool.get(0);
			growingPool.remove(0);

			if (remainingGrows > 0) {
				remainingGrows--;
				Grow(is, property.toString());
			} else {
				map = new Cons("and", map, blockDownComplement(is));
			}
		}
		return true;
	}

	private void markMIVC(SeedPair mivc) {
		Set<String> mivc_set = IvcUtil.getIvcNames(ivcMap, mivc.properties);
		allIvcs.add(new AllIVCs(mivc_set, mivc.invariants));
		double time = (System.currentTimeMillis() - runtime) / 1000.0;
		writeToXmlAllIvcs(new HashSet<String>(), mivc_set, time, true);
	}

	private boolean retryVerification(Program program, Specification newSpec, String prop, JKindSettings js,
			Set<String> resultOfIvcFinder, Set<String> mustChckList, List<String> deactivate) {
		if (settings.scratch) {
			comment("Result was UNKNOWN; Resend the request with pdrMax = 0 ...");
		}
		MiniJKind miniJkind = new MiniJKind(program, newSpec, js);
		miniJkind.verify();
		if (miniJkind.getPropertyStatus().equals(MiniJKind.UNKNOWN)) {
			timedoutLoop = true;
		}
		if (miniJkind.getPropertyStatus().equals(MiniJKind.VALID)) {
			mayElements.addAll(deactivate);
			mustChckList.removeAll(deactivate);

			resultOfIvcFinder.addAll(miniJkind.getPropertyIvc());
			Set<String> newIvc = resultOfIvcFinder;

			if (settings.scratch) {
				comment("New IVC set found: " + IvcUtil.getIvcLiterals(ivcMap, resultOfIvcFinder));
			}

			Set<AllIVCs> temp = new HashSet<>();
			for (AllIVCs curr : allIvcs) {
				Set<String> trimmed = curr.getAllIVCSet();
				if (trimmed.containsAll(newIvc)) {
					temp.add(curr);
				} else if (newIvc.containsAll(trimmed)) {
					return true;
				}
			}

			if (temp.isEmpty()) {
				allIvcs.add(new AllIVCs(miniJkind.getPropertyIvc(),
						miniJkind.getPropertyInvariants()));
			} else {
				allIvcs.removeAll(temp);
				allIvcs.add(new AllIVCs(miniJkind.getPropertyIvc(),
						miniJkind.getPropertyInvariants()));
			}

			return true;
		} else {
			resultOfIvcFinder.addAll(deactivate);
			if (settings.scratch) {
				comment("Property got violated. Adding back the elements");
			}

			if (deactivate.size() == 1) {
				mustElements.addAll(deactivate);
				mustChckList.removeAll(deactivate);
				if (settings.scratch) {
					comment("One MUST element was found: " + IvcUtil.getIvcLiterals(ivcMap, deactivate));
				}
			} else {
				deactivate.removeAll(mustElements);
				deactivate.removeAll(mayElements);
				if (settings.scratch) {
					comment(IvcUtil.getIvcLiterals(ivcMap, deactivate)
							+ " could be MUST elements; added to the check list...");
				}

				mustChckList.addAll(deactivate);
			}
			return false;
		}
	}

	private Sexp blockUp(Collection<Symbol> list) {
		List<Sexp> ret = new ArrayList<>();
		for (Symbol literal : list) {
			ret.add(new Cons("not", literal));
		}
		return SexpUtil.disjoin(ret);
	}

	private Sexp blockDown(Collection<Symbol> list) {
		List<Sexp> ret = new ArrayList<>();
		for (Symbol literal : list) {
			ret.add(literal);
		}
		return SexpUtil.disjoin(ret);
	}

	private Sexp blockDownComplement(Collection<Symbol> list) {
		List<Sexp> temp = new ArrayList<>(ivcMap.valueList());
		temp.removeAll(list);
		return SexpUtil.disjoin(temp);
	}

	private boolean checkMapSatisfiability(List<Symbol> seed, Set<String> mustChckList, boolean maximal) {
		z3Solver.push();
		solver.assertSexp(map);
		Result result = z3Solver.checkSat(new ArrayList<>(), true, false);
		if (result instanceof UnsatResult) {
			return false;
		} else if (result instanceof UnknownResult) {
			throw new JKindException("Unknown result in solving map");
		}

		seed.clear();
		if (maximal) {
			seed.addAll(maximizeSat(((SatResult) result), mustChckList));
		} else {
			SatResult sat = (SatResult) result;
			seed.addAll(getActiveLiteralsFromModel(sat.getModel(), "true"));
		}
		z3Solver.pop();
		return true;
	}

	private List<Symbol> getMaximalUnexplored(List<Symbol> seed) {
		z3Solver.push();
		solver.assertSexp(map);
		if (!seed.isEmpty()) {
			solver.assertSexp(new Cons("and", map, SexpUtil.conjoin(seed)));
		}
		Result result = z3Solver.checkMaximal();
		z3Solver.pop();

		if (result instanceof SatResult) {
			SatResult sat = (SatResult) result;
			List<Symbol> top = getCompletePositiveModel(sat.getModel());
			return new ArrayList<Symbol>(top);
		}
		return new ArrayList<Symbol>();
	}

	private List<Symbol> getCompletePositiveModel(Model model) {
		Set<Symbol> negative_literals = getActiveLiteralsFromModel(model, "false");
		List<Symbol> top = new ArrayList<>(ivcMap.valueList());
		top.removeAll(negative_literals);
		return top;
	}

	/**
	 * in case of sat result we would like to get a maximum sat subset of activation literals
	 **/
	private List<Symbol> maximizeSat(SatResult result, Set<String> mustChckList) {
		Set<Symbol> seed = getActiveLiteralsFromModel(result.getModel(), "true");
		Set<Symbol> falseLiterals = getActiveLiteralsFromModel(result.getModel(), "false");
		Set<Symbol> temp = new HashSet<>();
		temp.addAll(ivcMap.valueList());
		List<Symbol> literalList = IvcUtil.getIvcLiterals(ivcMap, new ArrayList<>(mustChckList));
		temp.removeAll(literalList);
		temp.removeAll(falseLiterals);
		temp.removeAll(seed);

		for (Symbol literal : literalList) {
			if (!seed.contains(literal)) {
				seed.add(literal);
				if (z3Solver.quickCheckSat(new ArrayList<>(seed)) instanceof UnsatResult) {
					seed.remove(literal);
				}
			}
		}
		for (Symbol literal : falseLiterals) {
			if (!seed.contains(literal)) {
				seed.add(literal);
				if (z3Solver.quickCheckSat(new ArrayList<>(seed)) instanceof UnsatResult) {
					seed.remove(literal);
				}
			}
		}
		for (Symbol literal : temp) {
			seed.add(literal);
			if (z3Solver.quickCheckSat(new ArrayList<>(seed)) instanceof UnsatResult) {
				seed.remove(literal);
			}
		}
		return new ArrayList<>(seed);
	}

	private Set<Symbol> getActiveLiteralsFromModel(Model model, String val) {
		Set<Symbol> seed = new HashSet<>();
		for (String var : model.getVariableNames()) {
			if (model.getValue(var).toString() == val) {
				seed.add(new Symbol(var));
			}
		}
		return seed;
	}

	private void sendValid(String valid, ValidMessage vm) {
		boolean mivcTimedOut = false;
		Itinerary itinerary = vm.getNextItinerary();
		if (timedoutLoop) {
			mustElements.add("::AIVCtimedoutLoop::");
			mivcTimedOut = true;
		}

		// In the all ivc elements, if any of the inner loops times out, the timeout information is encoded in the must elements
		// and passed to the ivc field of the ValidMessage object, sending it out to the writers
		director.broadcast(new ValidMessage(vm.source, valid, vm.k, vm.proofTime, null, mustElements, itinerary,
				allIvcs, mivcTimedOut));
	}

	@Override
	protected void handleMessage(BaseStepMessage bsm) {
	}

	@Override
	protected void handleMessage(InductiveCounterexampleMessage icm) {
	}

	@Override
	protected void handleMessage(InvalidMessage im) {
		properties.removeAll(im.invalid);
	}

	@Override
	protected void handleMessage(InvariantMessage im) {
	}

	@Override
	protected void handleMessage(UnknownMessage um) {
		properties.removeAll(um.unknown);
	}

	@Override
	protected void handleMessage(ValidMessage vm) {
		if (vm.getNextDestination() == EngineType.IVC_REDUCTION_ALL) {
			reduce(vm);
		}
	}

	/*
	 * recording (minimal) IVCs found during the computation
	 **/
	private void writeToXmlAllIvcs(Set<String> trimmed, Set<String> untrimmed, double d, boolean isNew) {
		String xmlFilename = settings.filename + "_alg" + settings.allIvcsAlgorithm + "_all_uc_minijkind.xml";

		try (PrintWriter out = new PrintWriter(new FileOutputStream(new File(xmlFilename), true))) {
			out.println("<Results>");
			out.println("   <NewSet>" + isNew + "</NewSet>");
			out.println("   <Time unit=\"sec\">" + d + "</Time>");
			for (String s : untrimmed) {
				out.println("   <IVC>" + s + "</IVC>");
			}
			for (String s : trimmed) {
				out.println("   <TRIVC>" + s + "</TRIVC>");
			}
			out.println("</Results>");
			out.flush();
			out.close();
		} catch (Throwable t) {
			t.printStackTrace();
			ExceptionUtil.error("语法错误:" + ExitCodes.UNCAUGHT_EXCEPTION);
		}

	}

}