package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/cse")
    public String cse() {
        return "Welcome to CSE";
    }

    @GetMapping("/ece")
    public String ece() {
        return "Welcome to ECE";
    }
}
