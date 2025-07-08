package com.ecnu.synlong.parser.convert;

public class SynlongToLustreUtils {
    /**
     * 格式化Lustre变量名
     */
    public static String formatLustreVar(String varName) {
        // 这里只做简单处理，实际可根据需要扩展
        return varName.replace("-", "_");
    }

    /**
     * 转义Lustre字符串
     */
    public static String escapeLustreString(String str) {
        return str.replace("\"", "\\\"");
    }

    /**
     * Synlong类型名映射到Lustre类型名
     */
    public static String mapTypeName(String synlongType) {
        switch (synlongType) {
            case "bool": return "bool";
            case "char": return "int"; // Lustre无char，映射为int
            case "byte": return "int";
            case "ubyte": return "int";
            case "short": return "int";
            case "ushort": return "int";
            case "int": return "int";
            case "uint": return "int";
            case "long": return "int";
            case "ulong": return "int";
            case "float": return "real";
            case "real": return "real";
            default: return synlongType;
        }
    }

    /**
     * 格式化表达式（可扩展）
     */
    public static String formatExpr(String expr) {
        return expr.trim();
    }
}
