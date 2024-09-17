package com.pablocru.springcore.componentscanning;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication(scanBasePackages = { "com.pablocru.springcore.componentscanning",
        "com.pablocru.springcore.utils"
})
public class ComponentScanningApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComponentScanningApplication.class, args);
    }

}
