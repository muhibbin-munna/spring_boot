package com.example.SpringBoot.car;

import org.springframework.beans.factory.annotation.Value;

public class Engine {
    private final String type;

    public Engine(@Value("Default Engine") String type) {
        this.type = type;
        System.out.println(type + " Engine created");
    }

    public String getType() {
        return type;
    }
}