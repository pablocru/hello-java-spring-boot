package com.pablocru.springcore.qualifiers.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablocru.springcore.qualifiers.common.Coach;

@RestController
public class DemoController {

    // Define a private field for the dependency
    private Coach myCoach;

    // Define a constructor for dependency injection
    /*
     * Using the `@Qualifier` annotation you can specify which Coach implementation
     * will be used.
     *
     * Another strategy is using the `@Primary` annotation in one of the
     * implementations:
     *
     * @Component
     * @Primary
     * public class BaseballCoach implements Coach { ... }
     *
     * However, `@Qualifier` has preference over `@Primary`. Thats why Chad Darby
     * recommends to use `@Qualifier`.
     */

    public DemoController(@Qualifier("baseballCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    // expose `/daily-workout` that returns a workout statement
    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
