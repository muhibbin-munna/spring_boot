package com.example.SpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{

    public void sound (){
        System.out.println("Mew");
    }
}
