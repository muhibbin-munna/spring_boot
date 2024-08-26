package com.example.SpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
