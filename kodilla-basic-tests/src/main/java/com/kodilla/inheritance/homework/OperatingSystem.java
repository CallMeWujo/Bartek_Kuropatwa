package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int day;
    private int month;
    private int year;

    public OperatingSystem(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void turnOn(){
        System.out.println("Turning On operating system");
    }

    public void turnOff(){
        System.out.println("Turning Off operating system");
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void yearOfProduction() {
        System.out.println(day + "." + month +"." + year);
    }
}
