package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Car ford = new Ford(100);
        System.out.println(ford.getSpeed());
        doRace(ford);

        Car opel = new Opel(100);
        System.out.println(opel.getSpeed());
        doRace(opel);

        Car bmw = new Bmw(100);
        System.out.println(bmw.getSpeed());
        doRace(bmw);


    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());

    }
}
