package com.ecnu.synlong.parser.convert;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class SynlongErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        // 自定义错误处理逻辑
        String errMessage = "语法错误: 行 " + line + ":" + charPositionInLine + " " + msg;
        System.err.println(errMessage);
        throw new RuntimeException(errMessage);
    }
}
