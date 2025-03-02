package com.example.SpringBoot.animal;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
