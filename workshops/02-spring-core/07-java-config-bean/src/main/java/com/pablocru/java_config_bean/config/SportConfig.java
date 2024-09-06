package com.pablocru.java_config_bean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pablocru.java_config_bean.common.Coach;
import com.pablocru.java_config_bean.common.SwimCoach;

// It'is `@Configuration` not `@Configurable
@Configuration
public class SportConfig {

    /*
     * The method name will be the Bean Id by default. It is used in
     * `DemoController.java` to specify the default `Coach` implementation:
     *
     * public DemoController(@Qualifier("swimCoach") Coach theCoach) {
     * myCoach = theCoach;
     * }
     *
     * The `@Bean` annotation accepts a parameter to specify a custom Bean Id.
     */
    @Bean("aquatic")
    Coach swimCoach() {
        return new SwimCoach();
    }

}
