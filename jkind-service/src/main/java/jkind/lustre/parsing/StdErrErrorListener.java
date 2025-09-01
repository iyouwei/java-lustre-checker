package jkind.lustre.parsing;

import jkind.StdErr;
import jkind.lustre.Location;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class StdErrErrorListener extends BaseErrorListener {
	private final List<SyntaxError> errors = new ArrayList<>();

	public List<SyntaxError> getErrors() {
		return errors;
	}

	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
			String msg, RecognitionException e) {
		String errorMessage = "在第" + line + "行-第" + charPositionInLine + "列存在语法错误，具体信息：" + msg;
		this.errors.add(new SyntaxError(msg, e, errorMessage));
//		StdErr.println(errorMessage);
//		StdErr.showLocation(new Location(line, charPositionInLine));
	}

}
