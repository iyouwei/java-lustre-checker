package com.ecnu.synlong.controller;

import com.ecnu.synlong.common.BaseResponse;
import com.ecnu.synlong.request.AutomatonParameter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class AutomatonController {

    @PostMapping(value = "/convert")
    public BaseResponse<Integer> check(@RequestBody AutomatonParameter automatonParameter) {
        String jsonStm = automatonParameter.getFile();
        // 判断是否为JSON格式
        if (jsonStm == null || jsonStm.isEmpty()) {
            return BaseResponse.error("输入不能为空");
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readTree(jsonStm);
            return BaseResponse.success(1);
        } catch (JsonProcessingException e) {
            return BaseResponse.error("JSON 格式错误: " + e.getMessage());
        }
    }
}
