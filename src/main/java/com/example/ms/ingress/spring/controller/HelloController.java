package com.example.ms.ingress.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @GetMapping(path = "/sayHello")
    public String sayHello() {
        return "Hello World!";
    }

}