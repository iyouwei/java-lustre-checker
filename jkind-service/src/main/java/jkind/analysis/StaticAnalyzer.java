package jkind.analysis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jkind.ExitCodes;
import jkind.JKindSettings;
import jkind.Settings;
import jkind.SolverOption;
import jkind.analysis.evaluation.DivisionChecker;
import jkind.lustre.Constant;
import jkind.lustre.EnumType;
import jkind.lustre.Equation;
import jkind.lustre.Expr;
import jkind.lustre.Function;
import jkind.lustre.IdExpr;
import jkind.lustre.NamedType;
import jkind.lustre.Node;
import jkind.lustre.Program;
import jkind.lustre.Type;
import jkind.lustre.TypeDef;
import jkind.lustre.VarDecl;
import jkind.util.Util;

public class StaticAnalyzer {
	
	private final ErrorCollector collector = new ErrorCollector();

	public void throwIfErrors() {
		if (!collector.getErrors().isEmpty()) {
			StringBuilder errorMsg = new StringBuilder();
			for (String error : collector.getErrors()) {
				errorMsg.append(error).append("\n");
			}
			throw new RuntimeException("语法错误:\n" + errorMsg);
		}
	}

	public void check(Program program, SolverOption solver) {
		check(program, solver, new Settings());
	}

	public void check(Program program, SolverOption solver, Settings settings) {
		checkErrors(program, solver, settings);
		checkSolverLimitations(program, solver);
		checkWarnings(program, solver);
	}

	private void checkErrors(Program program, SolverOption solver, Settings settings) {
		boolean valid = true;
		valid = valid && hasMainNode(program);
		valid = valid && typesUnique(program);
		valid = valid && TypesDefined.check(program);
		valid = valid && TypeDependencyChecker.check(program);
		valid = valid && enumsAndConstantsUnique(program);
		valid = valid && ConstantDependencyChecker.check(program);
		valid = valid && nodesAndFunctionsUnique(program);
		valid = valid && functionsHaveUnconstrainedOutputTypes(program);
		valid = valid && variablesUnique(program);
		valid = valid && TypeChecker.check(program);
		valid = valid && SubrangesNonempty.check(program);
		valid = valid && ArraysNonempty.check(program);
		valid = valid && constantsConstant(program);
		valid = valid && DivisionChecker.check(program);
		valid = valid && NodeDependencyChecker.check(program);
		valid = valid && assignmentsSound(program);
		valid = valid && ConstantArrayAccessBounded.check(program);
		valid = valid && propertiesUnique(program);
		valid = valid && propertiesExist(program);
		valid = valid && propertiesBoolean(program);
		valid = valid && ivcUnique(program);
		valid = valid && ivcLocalOrOutput(program);

		switch (solver) {
			case Z3:
				break;

			case YICES2:
				if (settings instanceof JKindSettings) {
					JKindSettings jKindSettings = (JKindSettings) settings;
					if (jKindSettings.reduceIvc && !LinearChecker.check(program, Level.IGNORE)) {
						collector.warning(jKindSettings.solver
								+ " does not support unsat-cores for nonlinear logic so IVC reduction will be slow");
					}
				}
				break;

			default:
				valid = valid && LinearChecker.check(program, Level.ERROR);
				break;
		}

		if (!valid) {
			throwIfErrors();
		}
	}

	private void checkSolverLimitations(Program program, SolverOption solver) {
		if (solver == SolverOption.MATHSAT) {
			if (!MathSatFeatureChecker.check(program)) {
				throw new RuntimeException("语法错误:" + ExitCodes.UNSUPPORTED_FEATURE);
			}
		}
	}

	private void checkWarnings(Program program, SolverOption solver) {
		warnUnusedAsserts(program);
		warnAlgebraicLoops(program);
		WarnUnguardedPreVisitor.check(program);
		if (solver == SolverOption.Z3) {
			LinearChecker.check(program, Level.WARNING);
		}
	}

	private boolean hasMainNode(Program program) {
		if (program.getMainNode() == null) {
			collector.error("no main node");
			return false;
		}
		return true;
	}

	private boolean typesUnique(Program program) {
		boolean unique = true;
		Set<String> seen = new HashSet<>();
		for (TypeDef def : program.types) {
			if (!seen.add(def.id)) {
				collector.error(def.location, "type " + def.id + " already defined");
				unique = false;
			}
		}
		return unique;
	}

	private boolean enumsAndConstantsUnique(Program program) {
		boolean unique = true;
		Set<String> seen = new HashSet<>();

		for (EnumType et : Util.getEnumTypes(program.types)) {
			for (String value : et.values) {
				if (!seen.add(value)) {
					collector.error(et.location, value + " defined multiple times");
					unique = false;
				}
			}
		}

		for (Constant c : program.constants) {
			if (!seen.add(c.id)) {
				collector.error(c.location, c.id + " defined multiple times");
				unique = false;
			}
		}

		for (Node node : program.nodes) {
			for (VarDecl vd : Util.getVarDecls(node)) {
				if (seen.contains(vd.id)) {
					collector.error(vd.location, vd.id + " already defined globally");
					unique = false;
				}
			}
		}

		return unique;
	}

	private boolean nodesAndFunctionsUnique(Program program) {
		boolean unique = true;
		Set<String> seen = new HashSet<>();

		for (Function function : program.functions) {
			if (!seen.add(function.id)) {
				collector.error(function.location, "function or node " + function.id + " already defined");
				unique = false;
			}
		}

		for (Node node : program.nodes) {
			if (!seen.add(node.id)) {
				collector.error(node.location, "function or node " + node.id + " already defined");
				unique = false;
			}
		}

		return unique;
	}

	private boolean functionsHaveUnconstrainedOutputTypes(Program program) {
		boolean valid = true;
		Map<String, Type> typeTable = Util.createResolvedTypeTable(program.types);
		for (Function function : program.functions) {
			for (VarDecl output : function.outputs) {
				if (ContainsConstrainedType.check(output.type, typeTable)) {
					collector.error(output.type.location, "function " + function.id
							+ " may not use constrained output type (subrange or enumeration)");
					valid = false;
				}
			}
		}
		return valid;
	}

	private boolean variablesUnique(Program program) {
		boolean unique = true;
		for (Function function : program.functions) {
			unique = variablesUnique(Util.getVarDecls(function)) && unique;
		}
		for (Node node : program.nodes) {
			unique = variablesUnique(Util.getVarDecls(node)) && unique;
		}
		return unique;
	}

	private boolean variablesUnique(List<VarDecl> varDecls) {
		boolean unique = true;
		Set<String> seen = new HashSet<>();
		for (VarDecl decl : varDecls) {
			if (!seen.add(decl.id)) {
				collector.error(decl.location, "variable " + decl.id + " already declared");
				unique = false;
			}
		}
		return unique;
	}

	private boolean constantsConstant(Program program) {
		boolean constant = true;
		ConstantAnalyzer constantAnalyzer = new ConstantAnalyzer(program);
		for (Constant c : program.constants) {
			if (!c.expr.accept(constantAnalyzer)) {
				collector.error(c.location, "constant " + c.id + " does not have a constant value");
				constant = false;
			}
		}
		return constant;
	}

	private boolean assignmentsSound(Program program) {
		boolean sound = true;
		for (Node node : program.nodes) {
			sound = assignmentsSound(node) && sound;
		}
		return sound;
	}

	private boolean assignmentsSound(Node node) {
		Set<String> toAssign = new HashSet<>();
		toAssign.addAll(Util.getIds(node.outputs));
		toAssign.addAll(Util.getIds(node.locals));
		Set<String> assigned = new HashSet<>();
		boolean sound = true;

		for (Equation eq : node.equations) {
			for (IdExpr idExpr : eq.lhs) {
				if (toAssign.contains(idExpr.id)) {
					toAssign.remove(idExpr.id);
					assigned.add(idExpr.id);
				} else if (assigned.contains(idExpr.id)) {
					collector.error(idExpr.location, "variable '" + idExpr.id + "' cannot be reassigned");
					sound = false;
				} else {
					collector.error(idExpr.location, "variable '" + idExpr.id + "' cannot be assigned");
					sound = false;
				}
			}
		}

		if (!toAssign.isEmpty()) {
			collector.error("in node '" + node.id + "' variables must be assigned: " + toAssign);
			sound = false;
		}

		return sound;
	}

	private boolean propertiesUnique(Program program) {
		boolean unique = true;

		for (Node node : program.nodes) {
			Set<String> seen = new HashSet<>();
			for (String prop : node.properties) {
				if (!seen.add(prop)) {
					collector.error("in node '" + node.id + "' property '" + prop + "' declared multiple times");
					unique = false;
				}
			}
		}

		return unique;
	}

	private boolean propertiesExist(Program program) {
		boolean exist = true;

		for (Node node : program.nodes) {
			Set<String> variables = new HashSet<>(Util.getIds(Util.getVarDecls(node)));
			for (String prop : node.properties) {
				if (!variables.contains(prop)) {
					collector.error("in node '" + node.id + "' property '" + prop + "' does not exist");
					exist = false;
				}
			}
		}

		return exist;
	}

	private boolean propertiesBoolean(Program program) {
		boolean allBoolean = true;

		for (Node node : program.nodes) {
			Set<String> booleans = getBooleans(node);
			for (String prop : node.properties) {
				if (!booleans.contains(prop)) {
					collector.error("in node '" + node.id + "' property '" + prop + "' does not have type bool");
					allBoolean = false;
				}
			}
		}

		return allBoolean;
	}

	private Set<String> getBooleans(Node node) {
		Set<String> booleans = new HashSet<>();
		for (VarDecl varDecl : Util.getVarDecls(node)) {
			if (varDecl.type == NamedType.BOOL) {
				booleans.add(varDecl.id);
			}
		}
		return booleans;
	}

	private void warnUnusedAsserts(Program program) {
		for (Node node : program.nodes) {
			if (node.id.equals(program.main)) {
				continue;
			}

			for (Expr expr : node.assertions) {
				collector.warning(expr.location, "assertion in subnode ignored");
			}
		}
	}

	private void warnAlgebraicLoops(Program program) {
		for (Node node : program.nodes) {
			Map<String, Set<String>> directDepends = Util.getDirectDependencies(node);

			Set<String> covered = new HashSet<>();
			for (Equation eq : node.equations) {
				List<String> stack = new ArrayList<>();
				for (IdExpr idExpr : eq.lhs) {
					checkAlgebraicLoops(node.id, idExpr.id, stack, covered, directDepends);
				}
			}
		}
	}

	private boolean checkAlgebraicLoops(String node, String id, List<String> stack, Set<String> covered,
			Map<String, Set<String>> directDepends) {
		if (stack.contains(id)) {
			StringBuilder text = new StringBuilder();
			text.append("in node '" + node + "' possible algebraic loop: ");
			for (String s : stack.subList(stack.indexOf(id), stack.size())) {
				text.append(s + " -> ");
			}
			text.append(id);
			collector.warning(text.toString());
			return true;
		}

		if (!covered.add(id)) {
			return false;
		}

		if (directDepends.containsKey(id)) {
			stack.add(id);
			for (String next : directDepends.get(id)) {
				if (checkAlgebraicLoops(node, next, stack, covered, directDepends)) {
					return true;
				}
			}
			stack.remove(stack.size() - 1);
		}

		return false;
	}

	private boolean ivcUnique(Program program) {
		boolean unique = true;

		for (Node node : program.nodes) {
			Set<String> seen = new HashSet<>();
			for (String e : node.ivc) {
				if (!seen.add(e)) {
					collector.error("in node '" + node.id + "' IVC element '" + e + "' declared multiple times");
					unique = false;
				}
			}
		}

		return unique;
	}

	private boolean ivcLocalOrOutput(Program program) {
		boolean passed = true;

		for (Node node : program.nodes) {
			Set<String> assigned = new HashSet<>();
			assigned.addAll(Util.getIds(node.outputs));
			assigned.addAll(Util.getIds(node.locals));

			for (String e : node.ivc) {
				if (!assigned.contains(e)) {
					collector.error("in node '" + node.id + "' IVC element '" + e + "' must be a local or output");
					passed = false;
				}
			}
		}

		return passed;
	}
}
