package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"회원가입 API"})
@RestController
public class TestController {

    @ApiOperation(value = "회원가입")
    @GetMapping("/example")
    public String test() {
        System.out.println("hello world");
        return "hello world";
    }

}
