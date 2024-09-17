package com.pablocru.springcore.constructorinjection.rest;

import com.pablocru.springcore.constructorinjection.common.Coach;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
