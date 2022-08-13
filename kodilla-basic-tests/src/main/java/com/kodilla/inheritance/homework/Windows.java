package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int day, int month, int year) {
        super(day, month, year);
        System.out.println("Windows year of production is : ");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning On Windows");
    }
}
