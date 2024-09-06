package com.pablocru.component_scanning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.pablocru.component_scanning",
        "com.pablocru.utils"
})
public class ComponentScanningApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComponentScanningApplication.class, args);
    }

}
