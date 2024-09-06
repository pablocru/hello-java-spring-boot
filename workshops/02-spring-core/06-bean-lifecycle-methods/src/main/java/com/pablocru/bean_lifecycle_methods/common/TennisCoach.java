package com.pablocru.bean_lifecycle_methods.common;

import org.springframework.stereotype.Component;

// Marks the class as Spring bean that makes it available for dependency injection
@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }

}
