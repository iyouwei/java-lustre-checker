package com.ecnu.synlong.controller;

import com.ecnu.synlong.request.VerifyParameter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VerifyController {

    @PostMapping(value = "/verify")
    public ResponseEntity<String> check(@RequestBody VerifyParameter verifyParameter) {
        // TODO: 根据go代码改写
        return null;
    }
}
