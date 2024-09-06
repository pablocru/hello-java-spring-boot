package com.pablocru.component_scanning.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablocru.utils.Coach;

@RestController
public class DemoController {

    private Coach myCoach;

    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
