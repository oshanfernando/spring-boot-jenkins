package com.example.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String testEndpoint() {
        return "This is a test message from /hello";
    }

    @GetMapping("/gitlabtest")
    public String tesgitlabtEndpoint() {
        return "This is a test message from /gitlabtest";
    }
}
