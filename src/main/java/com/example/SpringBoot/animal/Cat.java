package com.example.SpringBoot.animal;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Cat implements Animal{

    public void sound (){
        System.out.println("Mew");
    }
}
