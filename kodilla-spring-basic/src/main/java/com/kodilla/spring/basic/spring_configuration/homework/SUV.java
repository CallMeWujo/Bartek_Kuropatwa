package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(6,00)) && time.isBefore(LocalTime.of(20,00))) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
