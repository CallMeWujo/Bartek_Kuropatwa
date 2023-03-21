package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootTest
class CarConfigurationTestSuite {



    @Test
    void checkCar(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCar");

        Assertions.assertEquals("Sedan", car.getCarType());

    }
    @Test
    void checkLights() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCar");

        Assertions.assertTrue(car.hasHeadlightsTurnedOn());
    }




}