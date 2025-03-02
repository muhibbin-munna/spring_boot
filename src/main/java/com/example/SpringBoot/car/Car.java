package com.example.SpringBoot.car;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Engine engine;

    public Car(@Qualifier("v8Engine") Engine engine) {
        this.engine = engine;
        System.out.println("Car created with an engine" + engine);
    }

    public void start() {
        System.out.println("Car started with engine: " + engine.getType());
    }
}