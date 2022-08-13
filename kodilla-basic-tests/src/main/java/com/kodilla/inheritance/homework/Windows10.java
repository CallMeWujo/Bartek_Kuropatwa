package com.kodilla.inheritance.homework;

public class Windows10 extends Windows {

    public Windows10(int day, int month, int year) {
        super(day, month, year);
        System.out.println("Windows 10 year of production is :");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning On Windows 10");
    }
}
