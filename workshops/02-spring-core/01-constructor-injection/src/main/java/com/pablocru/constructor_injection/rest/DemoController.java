package com.pablocru.constructor_injection.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.pablocru.constructor_injection.common.Coach;

@RestController
public class DemoController {

    // Define a private field for the dependency
    private Coach myCoach;

    // Define a constructor for dependency injection
    // `@Autowired` annotation is optional when there is only 1 constructor
    // To avoid the `yellow warning` I rather comment it.
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    // expose `/daily-workout` that returns a workout statement
    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
