package com.pablocru.setter_injection.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.pablocru.setter_injection.common.Coach;

@RestController
public class DemoController {

    // Define a private field for the dependency
    private Coach myCoach;

    // Define a setter for dependency injection
    // It isn't mandatory to use `set-` prefix in the method name
    // If the method has te `@Autowired` annotation, then Spring will use it to
    // inject the dependencies
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }

    // expose `/daily-workout` that returns a workout statement
    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
