package com.ecnu.synlong.parser.convert;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 自动机转换器测试类
 */
public class AutomatonConverterTest {
    
    @Test
    public void testConvertCarAutomaton() {
        // 测试用例：Car自动机
        String lustreCode = "node speed_up(v: int) returns (vt: int)\n" +
            "let\n" +
            "    vt = v + 10;\n" +
            "tel\n\n" +
            "node speed_down(v: int) returns (vt: int)\n" +
            "let\n" +
            "    vt = v - 10;\n" +
            "tel\n\n" +
            "node keep(v: int) returns (vt: int)\n" +
            "let\n" +
            "    vt = v;\n" +
            "tel\n\n" +
            "node N(v: int) returns ()\n" +
            "let\n" +
            "    automaton Car\n" +
            "        initial state Keep\n" +
            "        unless\n" +
            "            if v >= 100 restart SpeedDown;\n" +
            "            if v <= 100 restart SpeedUp;\n" +
            "        var limit: int;\n" +
            "        let v = keep(v); limit = 200; tel\n" +
            "        until \n" +
            "            if v >= limit restart Keep;\n" +
            "    state SpeedDown\n" +
            "        unless \n" +
            "            if v <= 150 and v >= 50 restart Keep;\n" +
            "            if v <= 100 restart SpeedUp;\n" +
            "        var limit: int; \n" +
            "        let v = speed_down(v); limit = 50; tel\n" +
            "        until if v <= limit restart SpeedDown;\n" +
            "    state SpeedUp\n" +
            "        unless \n" +
            "            if v >= 150 restart SpeedDown;\n" +
            "            if v <= 150 and v >= 50 restart Keep;\n" +
            "        var limit: int;\n" +
            "        let v = speed_up(v); limit = 150; tel\n" +
            "        until if v <= limit restart SpeedUp;\n" +
            "    returns v;\n" +
            "tel;";
        
        try {
            String result = AutomatonConverter.convertToAutomaton(lustreCode);
            
            // 验证结果不为空
            assertNotNull(result);
            assertFalse(result.trim().isEmpty());
            
            // 验证结果包含预期的自动机名称
            assertTrue(result.contains("\"name\":\"N\""));
            
            // 验证结果包含状态
            assertTrue(result.contains("\"name\":\"Keep\""));
            assertTrue(result.contains("\"name\":\"SpeedDown\""));
            assertTrue(result.contains("\"name\":\"SpeedUp\""));
            
            System.out.println("转换结果:");
            System.out.println(result);
            
        } catch (Exception e) {
            fail("转换失败: " + e.getMessage());
        }
    }
    
    @Test
    public void testConvertSimpleAutomaton() {
        // 测试用例：简单自动机
        String lustreCode = "node simple() returns (result: bool)\n" +
            "let\n" +
            "    automaton Simple\n" +
            "        initial state State1\n" +
            "        unless\n" +
            "            if true restart State2;\n" +
            "        let result = true; tel\n" +
            "    state State2\n" +
            "        unless\n" +
            "            if true restart State1;\n" +
            "        let result = false; tel\n" +
            "    returns result;\n" +
            "tel;";
        
        try {
            String result = AutomatonConverter.convertToAutomaton(lustreCode);
            
            // 验证结果不为空
            assertNotNull(result);
            assertFalse(result.trim().isEmpty());
            
            // 验证结果包含预期的自动机名称
            assertTrue(result.contains("\"name\":\"simple\""));
            
            // 验证结果包含状态
            assertTrue(result.contains("\"name\":\"State1\""));
            assertTrue(result.contains("\"name\":\"State2\""));
            
            System.out.println("简单自动机转换结果:");
            System.out.println(result);
            
        } catch (Exception e) {
            fail("转换失败: " + e.getMessage());
        }
    }
}
