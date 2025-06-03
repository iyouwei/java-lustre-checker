package jkind.writers;

import jkind.engines.MiniJKind;
import jkind.engines.ivcs.AllIVCs;
import jkind.engines.messages.ValidMessage;
import jkind.lustre.Expr;
import jkind.results.Counterexample;
import jkind.results.layout.Layout;
import jkind.util.Util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class StringWriter extends Writer {
	private final Layout layout;
	private MiniJKind miniJkind;

	private StringBuilder output = new StringBuilder();

	public StringWriter(Layout layout) {
		super();
		this.layout = layout;
	}

	public StringWriter(Layout layout, MiniJKind miniJkind) {
		this(layout);
		this.miniJkind = miniJkind;
	}

	@Override
	public void begin() {
	}

	@Override
	public void end() {
	}

	private void writeLine() {
//		output.append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
	}

	@Override
	public void writeValid(List<String> props, String source, int k, double proofTime, double runtime,
			List<Expr> invariants, Set<String> ivc, List<AllIVCs> allIvcs,
			boolean mivcTimedOut) {
		if (miniJkind != null) {
			miniJkind.setRuntime(runtime);
			miniJkind.setValidMessage(
					new ValidMessage(source, props.get(0), k, proofTime, invariants, ivc, null, null, mivcTimedOut));
		} else {
			writeLine();
			output.append("通过的性质: " + props + " || " + source + " || K = " + k + " || Time = "
					+ Util.secondsToTime(runtime) + "\n");
			if (!invariants.isEmpty()) {
				output.append("INVARIANTS:\n");
				List<String> stringInvariants = invariants.stream().map(Object::toString).collect(toList());
				for (String invariant : Util.safeStringSortedSet(stringInvariants)) {
					output.append("  " + invariant + "\n");
				}
			}
			if (!allIvcs.isEmpty()) {
				int counter = 1;
				output.append("\nINDUCTIVE VALIDITY CORES:\n");
				if (!ivc.isEmpty()) {
					if (ivc.contains("::AIVCtimedoutLoop::")) {
						ivc.remove("::AIVCtimedoutLoop::");
						output.append("...................................................................\n");
						output.append(
								"A timeout occured during checking a property. Thus, the produced MIVCs might not be minimal.\n");
						output.append("...................................................................\n");
					}
					output.append("MUST ELEMENTS FOR THE PROPERTY:");
					for (String e : Util.safeStringSortedSet(ivc)) {
						output.append("  " + e + "\n");
					}
				}
				output.append("\n" + allIvcs.size() + " INDUCTIVE VALIDITY CORES WERE FOUND:" + "\n");
				output.append("============================\n");
				for (AllIVCs t : allIvcs) {
					output.append("IVC  #" + counter + ":\n");
					counter++;
					output.append("INVARIANTS:\n");
					for (String inv : t.getAllIVCList()) {
						output.append("  " + inv + "\n");
					}
					output.append("INDUCTIVE VALIDITY CORE:\n");
					for (String core : t.getAllIVCSet()) {
						output.append("  " + core + "\n");
					}
					output.append("============================\n");
				}
			} else if (!ivc.isEmpty()) {
				output.append("INDUCTIVE VALIDITY CORE:\n");
				for (String e : Util.safeStringSortedSet(ivc)) {
					output.append("  " + e + "\n");
				}
			}
			writeLine();
			output.append("\n");
		}
	}

	@Override
	public void writeInvalid(String prop, String source, Counterexample cex, List<String> conflicts, double runtime) {
		if (miniJkind != null) {
			miniJkind.setRuntime(runtime);
			miniJkind.setInvalid(cex);
		} else {
			writeLine();
			output.append("不通过的性质: " + prop + " || " + source + " || K = " + cex.getLength()
					+ " || Time = " + Util.secondsToTime(runtime) + "\n");
			output.append(cex.toString(layout));
			writeLine();
			output.append("\n");
		}
	}

	@Override
	public void writeUnknown(List<String> props, int trueFor, Map<String, Counterexample> inductiveCounterexamples,
			double runtime) {
		if (miniJkind != null) {
			miniJkind.setRuntime(runtime);
			miniJkind.setUnknown();
		} else {
			writeLine();
			output.append("未知的性质: " + props + " || True for " + trueFor + " steps" + " || Time = "
					+ Util.secondsToTime(runtime) + "\n");
			writeLine();
			output.append("\n");
			for (String prop : props) {
				Counterexample cex = inductiveCounterexamples.get(prop);
				if (cex != null) {
					writeLine();
					output.append("INDUCTIVE COUNTEREXAMPLE: " + prop + " || K = " + cex.getLength() + "\n");
					output.append(cex.toString(layout));
					writeLine();
					output.append("\n");
				}
			}
		}
	}

	@Override
	public void writeBaseStep(List<String> props, int k) {
	}

	@Override
	public void writeInconsistent(String prop, String source, int k, double runtime) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return output.toString();
	}
}
