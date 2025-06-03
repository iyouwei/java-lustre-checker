package com.ecnu.synlong.controller;

import com.ecnu.synlong.request.AutomatonParameter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/model")
public class AutomatonController {

    @PostMapping(value = "/convert")
    public ResponseEntity<String> check(@RequestBody AutomatonParameter automatonParameter) {
        // TODO: 根据go代码改写
        return null;
    }
}
