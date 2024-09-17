package com.pablocru.springcore.beanscopes.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Marks the class as Spring bean that makes it available for dependency injection
@Component
// `SCOPE_PROTOTYPE` annotation will end in a new object instance for each
// injection
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice!";
    }

}
