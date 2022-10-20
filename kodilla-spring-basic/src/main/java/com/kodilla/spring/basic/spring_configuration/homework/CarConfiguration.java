package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.MonthDay;

@Configuration
public class CarConfiguration {

    @Bean
    public Car getCar() {
        Car car;
        MonthDay date = MonthDay.now();
        if (date.isAfter(MonthDay.of(6,21)) && date.isBefore(MonthDay.of(9,24))) {
            car = new Cabrio();
        } else if (date.isAfter(MonthDay.of(12,21)) && date.isBefore(MonthDay.of(3,21))) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;

    }
}
