package com.pablocru.springcore.beanlifecyclemethods.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablocru.springcore.beanlifecyclemethods.common.Coach;

@RestController
public class DemoController {

    // Define a private field for the dependencies
    private Coach myCoach;

    // Define a constructor for dependency injection
    public DemoController(@Qualifier("baseballCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    // Expose `/daily-workout` that returns a workout statement
    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
