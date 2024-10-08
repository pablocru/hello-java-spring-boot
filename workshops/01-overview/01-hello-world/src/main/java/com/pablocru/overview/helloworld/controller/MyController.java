package com.pablocru.overview.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // Expose "/" that return "Hello, World!"
    @GetMapping("/")
    public String greet() {
        return "Hello, World!";
    }

}
