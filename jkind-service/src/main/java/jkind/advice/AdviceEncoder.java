package jkind.advice;

import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;

import jkind.Main;
import jkind.lustre.Node;
import jkind.lustre.Program;
import jkind.lustre.builders.NodeBuilder;

public class AdviceEncoder {
	public static String encode(jkind.advice.Advice advice) {
		NodeBuilder builder = new NodeBuilder("main");
		builder.addLocals(advice.getVarDecls());
		builder.addAssertions(advice.getInvariants());
		return new Program(builder.build()).toString();
	}

	public static jkind.advice.Advice decode(InputStream is) throws Exception {
		Program program = Main.parseLustre(new ANTLRInputStream(is));
		Node main = program.getMainNode();

		jkind.advice.Advice advice = new jkind.advice.Advice();
		advice.addVarDecls(main.locals);
		advice.addInvariants(main.assertions);
		return advice;
	}
}
