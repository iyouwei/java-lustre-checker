package jkind.lustre.parsing;

import lombok.Getter;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;

@Getter
public class SyntaxError extends RecognitionException {

    private final String errorMessage;

    public SyntaxError(String message, RecognitionException e, String errorMessage) {
        super(message, e.getRecognizer(), e.getInputStream(), (ParserRuleContext) e.getCtx());
        this.setOffendingToken(e.getOffendingToken());
        this.initCause(e);
        this.errorMessage = errorMessage;
    }

    public SyntaxError(String message) {
        super(message, null, null, null);
        this.errorMessage = message;
    }

}