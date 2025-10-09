package com.ecnu.synlong.constant;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertConstant {
    public static final String StmResult;
    public static final String CarResult;
    public static final String NuclearResult;

    // 静态初始化块（类加载时执行），只读一次
    static {
        String stm = "";
        String car = "";
        String nuclear = "";
        try {
            String basePath = "jkind-server/src/main/java/com/ecnu/synlong/constant/";

            // 使用Paths.get()的多个参数形式，避免手动拼接路径；适配windows路径
            stm = String.join("\n", Files.readAllLines(Paths.get(basePath, "StmResult.json")));
            car = String.join("\n", Files.readAllLines(Paths.get(basePath, "CarResult.json")));
            nuclear = String.join("\n", Files.readAllLines(Paths.get(basePath, "NuclearResult.json")));
        } catch (IOException e) {
            // 文件不存在或读取失败时保持为空字符串
            throw new RuntimeException("文件读取失败：", e);
        }

        StmResult = stm;
        CarResult = car;
        NuclearResult = nuclear;
    }
}
