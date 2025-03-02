package com.example.SpringBoot.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Engine v6Engine() {
        return new Engine("V6 Engine");
    }

    @Bean
    public Engine v8Engine() {
        return new Engine("V8 Engine");
    }
}
