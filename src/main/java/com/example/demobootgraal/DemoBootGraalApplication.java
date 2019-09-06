package com.example.demobootgraal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(proxyBeanMethods = false)
@RestController
public class DemoBootGraalApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoBootGraalApplication.class, args);
    }

    @GetMapping("/")
    public String greet() {
        return "Hello World!";
    }
}
