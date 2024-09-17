package com.pablocru.overview.customproperties.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
