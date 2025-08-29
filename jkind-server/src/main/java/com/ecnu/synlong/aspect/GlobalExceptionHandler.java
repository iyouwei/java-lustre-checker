package com.ecnu.synlong.aspect;

import com.ecnu.synlong.common.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public BaseResponse<String> handleException(Exception e) {
        log.error("捕获到异常: ", e);
        return BaseResponse.error(e.getMessage());
    }
}
