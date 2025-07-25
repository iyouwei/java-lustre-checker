package com.ecnu.synlong.controller;

import com.ecnu.synlong.common.CheckResult;
import com.ecnu.synlong.request.LustreFileParameter;
import com.ecnu.synlong.common.BaseResponse;
import com.ecnu.synlong.common.CheckStatus;
import com.ecnu.synlong.service.LustreService;
import com.ecnu.synlong.parser.convert.SynlongConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lustre")
public class LustreController {

    @Autowired
    private LustreService lustreService;

    /**
     * 使用JKind进行Lustre模型的验证。新接口，直接返回给前端。
     *
     * @param lustreFileParameter 包含Lustre模型的请求参数
     * @return 验证结果
     */
    @PostMapping(value = "/check")
    public BaseResponse<CheckResult> checkLustre(@RequestBody LustreFileParameter lustreFileParameter) {

        // lustre模型, 包含约束条件
        String program = lustreFileParameter.getFile();

        // 判断是否为Synlong自动机代码
        if (program != null && program.contains("automaton")) {
            program = SynlongConverter.convert(program);
        }

        // 用program单独作为参数
        String[] args = new String[]{program};
        CheckResult result = lustreService.check(args);

        if (result.getStatus() != CheckStatus.SUCCESS) {
            return BaseResponse.error(result.getResult());
        }

        return BaseResponse.success(result);
    }
}
