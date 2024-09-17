package com.pablocru.springcore.qualifiers.common;

import org.springframework.stereotype.Component;

// Marks the class as Spring bean that makes it available for dependency injection
@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

}
