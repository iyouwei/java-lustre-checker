package com.ecnu.synlong.constant;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertConstant {
    public static final String StmResult;
    public static final String CarResult;
    public static final String NuclearResult;

    static {
        try {
            StmResult = readResourceFile("StmResult.json");
            CarResult = readResourceFile("CarResult.json");
            NuclearResult = readResourceFile("NuclearResult.json");
        } catch (Exception e) {
            throw new RuntimeException("初始化失败，请检查资源文件是否存在或格式是否正确", e);
        }
    }

    private static String readResourceFile(String filename) throws Exception {
        // 通过类加载器获取资源路径
        Path path = Paths.get(ConvertConstant.class.getClassLoader()
                .getResource("result/" + filename)
                .toURI());
        return String.join("\n", Files.readAllLines(path, StandardCharsets.UTF_8));
    }
}