package com.pablocru.springcore.javaconfigbean.common;

import org.springframework.stereotype.Component;

// Marks the class as Spring bean that makes it available for dependency injection
@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice!";
    }

}
