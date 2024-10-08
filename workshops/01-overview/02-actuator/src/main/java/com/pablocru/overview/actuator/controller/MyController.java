package com.pablocru.overview.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // Expose "/" that return "Hello, Actuator!"
    @GetMapping("/")
    public String greet() {
        return "Hello, Actuator!";
    }

}
