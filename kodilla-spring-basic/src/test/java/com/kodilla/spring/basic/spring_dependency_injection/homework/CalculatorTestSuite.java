package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CalculatorTestSuite {
@Test
    void addTest () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(7.2,11.3);
        Assertions.assertEquals(18.5,value);
    }
    @Test
    void subtractTest () {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);
    double value = bean.subtract(2.4,3.4);
    Assertions.assertEquals(-1,value);
    }
    @Test
    void multiplyTest() {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);
    double value = bean.multiply(2.5, 3.0);
    Assertions.assertEquals(7.5,value);
    }
    @Test
    void divideTest() {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    Calculator bean = context.getBean(Calculator.class);
    double value = bean.divide(2.0,10.0);
    Assertions.assertEquals(0.2,value);
    }

}