package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    void success() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        String shipmentData = shippingCenter.sendPackage("Bolesława Chrobrego 15",17);
        Assertions.assertEquals("Package delivered to: Bolesława Chrobrego 15",shipmentData);
    }
    @Test
    void fail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        String shipmentData = shippingCenter.sendPackage("Bolesława Chrobrego 11", 34);
        Assertions.assertEquals("Package not delivered to: Bolesława Chrobrego 11",shipmentData);
    }
}