package com.example.SpringBoot;

import com.example.SpringBoot.animal.Pet;
import com.example.SpringBoot.car.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.manage();

		Car car = applicationContext.getBean(Car.class);
		car.start();
	}

}
