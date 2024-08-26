package com.example.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    Animal animal;

//    Constructor Injection
    
//    public Pet(Cat cat) {
//        this.cat = cat;
//    }

//    Setter injection

//    @Autowired
//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public void manage(){
        animal.sound();
        System.out.println("I am your pet");
    }
}
