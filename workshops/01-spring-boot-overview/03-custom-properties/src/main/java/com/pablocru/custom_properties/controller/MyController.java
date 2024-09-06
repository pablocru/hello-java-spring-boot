package com.pablocru.custom_properties.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {

    // Inject properties from `application.properties`
    @Value("${project.author}")
    private String projectAuthor;

    // expose "/" that returns the project author
    @GetMapping("/")
    public String getAuthor() {
        return "Project author: " + this.projectAuthor;
    }

}
