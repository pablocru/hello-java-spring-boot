package com.pablocru.bean_scopes.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablocru.bean_scopes.common.Coach;

@RestController
public class DemoController {

    // Define a private field for the dependencies
    private Coach myCoach;
    private Coach myAnotherCoach;

    // Define a constructor for dependency injection
    public DemoController(
            @Qualifier("baseballCoach") Coach theCoach,
            @Qualifier("baseballCoach") Coach theAnotherCoach) {
        myCoach = theCoach;
        myAnotherCoach = theAnotherCoach;
    }

    // Expose `/daily-workout` that returns a workout statement
    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    // Expose `/check` to verify if Spring is pointing to the same memory address
    // for this 2 `Coach` beans
    @GetMapping("/check")
    public String check() {
        return ("Comparing beans: myCoach == myAnotherCoach, " +
                (myCoach == myAnotherCoach));
    }

}
