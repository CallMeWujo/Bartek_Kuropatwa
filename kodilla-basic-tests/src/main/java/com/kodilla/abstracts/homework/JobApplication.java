package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {

        Job busDriver = new BusDriver();
        Person filip = new Person("filip", 27, busDriver);
        filip.returnResponsibilities();

        Job banker = new Banker();
        Person marcin = new Person("marcin", 30, banker);
        marcin.returnResponsibilities();

    }
}