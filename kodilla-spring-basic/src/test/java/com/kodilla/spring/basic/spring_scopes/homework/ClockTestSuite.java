package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTestSuite {


    @Test
    void Test() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        Clock first = context.getBean(Clock.class);
        Clock second = context.getBean(Clock.class);
        Clock third = context.getBean(Clock.class);

        Assertions.assertNotEquals(first,second);
        Assertions.assertNotEquals(second, third);
        Assertions.assertNotEquals(first,third);
    }

}