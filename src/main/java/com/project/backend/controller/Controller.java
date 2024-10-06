package com.project.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api/test")
    public String hello() {
        return "테스트 입니다.";
    }
}
