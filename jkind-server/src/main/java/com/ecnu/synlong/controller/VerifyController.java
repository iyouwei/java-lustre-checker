package com.ecnu.synlong.controller;

import com.ecnu.synlong.common.BaseResponse;
import com.ecnu.synlong.common.CheckResult;
import com.ecnu.synlong.request.VerifyParameter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

@RestController
public class VerifyController {

    // 缓存已计算的结果，key 格式：id:property
    private static final Map<String, String> propertyResultMap = new ConcurrentHashMap<>();

    @PostMapping(value = "/verify")
    public BaseResponse<CheckResult> check(@RequestBody VerifyParameter verifyParameter) {
        // 校验参数
        int id = verifyParameter.getId();
        String property = verifyParameter.getProperty();
        if (id < 0 && property == null || property.trim().isEmpty()) {
            return BaseResponse.error("id或property不能为空");
        }

        property = property.trim();
        // 简单的前缀校验（与原 Go 逻辑一致）
        if (!(property.startsWith("A[]") || property.startsWith("E[]") || property.startsWith("A<>") || property.startsWith("E<>"))) {
            return BaseResponse.error("property必须以 'A[]'、'E[]'、'A<>' 或 'E<>' 开头");
        }

        // 特例处理 "A[] not deadlock"
        if (property.equals("A[] not deadlock")) {
            return BaseResponse.success(CheckResult.success("true"));
        }

        String key = id + ":" + property;
        // 若缓存中已有结果，直接返回
        if (propertyResultMap.containsKey(key)) {
            return BaseResponse.success(CheckResult.success(propertyResultMap.get(key)));
        }

        // 生成随机区间，模拟验证结果
        double a = ThreadLocalRandom.current().nextDouble();
        double minBound = Math.max(0.0, a - 0.1);
        double maxBound = Math.min(1.0, a + 0.1);
        double b = minBound + ThreadLocalRandom.current().nextDouble() * (maxBound - minBound);

        double min = Math.min(a, b);
        double max = Math.max(a, b);
        String result = String.format("[%.6f, %.6f]", min, max);

        propertyResultMap.put(key, result);
        return BaseResponse.success(CheckResult.success(result));
    }
}
