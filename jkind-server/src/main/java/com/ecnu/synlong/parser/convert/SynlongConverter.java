package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.parser.synlong.gen.SynlongLexer;
import com.ecnu.synlong.parser.synlong.gen.SynlongParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class SynlongConverter {
    /**
     * 将Synlong代码转换为Lustre代码
     * @param synlongCode Synlong代码字符串
     * @return Lustre代码字符串
     */
    public static String convert(String synlongCode) {
        try {
            ParseTree tree = parse(synlongCode);
            SynlongToLustreContext context = new SynlongToLustreContext();
            SynlongToLustreVisitor visitor = new SynlongToLustreVisitor(context);
            return visitor.visit(tree);
        } catch (Exception e) {
            throw new SynlongToLustreException(e.getMessage());
        }
    }

    /**
     * 用ANTLR4解析Synlong代码，返回AST
     */
    private static ParseTree parse(String synlongCode) {
        CharStream input = CharStreams.fromString(synlongCode);
        SynlongLexer lexer = new SynlongLexer(input);
        // 使用自定义错误监听器
        lexer.removeErrorListeners();
        lexer.addErrorListener(new SynlongErrorListener());
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SynlongParser parser = new SynlongParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new SynlongErrorListener());
        return parser.program();
    }
}
