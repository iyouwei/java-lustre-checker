package com.ecnu.synlong.parser.convert;

import com.ecnu.synlong.parser.synlong.gen.SynlongLexer;
import com.ecnu.synlong.parser.synlong.gen.SynlongParser;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;

@Slf4j
public class SynlongConverter {
    /**
     * 将Synlong代码转换为Lustre代码
     * @param synlongCode Synlong代码字符串
     * @return Lustre代码字符串
     */
    public static String convert(String synlongCode) {
        try {
            CharStream input = CharStreams.fromString(synlongCode);
            SynlongLexer lexer = new SynlongLexer(input);
            // 使用自定义错误监听器
            lexer.removeErrorListeners();
            lexer.addErrorListener(new SynlongErrorListener());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SynlongParser parser = new SynlongParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new SynlongErrorListener());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
            ParseTree tree = parser.program();

            SynlongToLustreContext context = new SynlongToLustreContext();
            SynlongToLustreVisitor visitor = new SynlongToLustreVisitor(context);
            return visitor.visit(tree);
        } catch (Exception e) {
            log.error("Synlong转换Lustre失败: ", e);
            throw new SynlongToLustreException(e.getMessage());
        }
    }

}
