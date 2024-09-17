package com.pablocru.springcore.javaconfigbean.common;

// @Component
// In this case the `@Component` is commented on purpose in order to configure the Bean
// using Java Code
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("\nIn constructor: " + getClass().getSimpleName() + '\n');
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters as a warm up!";
    }

    // The `@Bean` annotation allows us to make an existing third-party class
    // available to Spring Framework
}
