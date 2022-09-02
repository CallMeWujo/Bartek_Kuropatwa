package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }



    public static Car drawCar() {
        Random random = new Random();
        int drawCarKind = RANDOM.nextInt(3);
        int speed = getRandomSpeed();
        if (drawCarKind == 0)
            return new Ford(speed);
        else if (drawCarKind == 1)
            return new Opel(speed);
        else
            return new Bmw(speed);

        }

    private static int getRandomSpeed() {
        return RANDOM.nextInt(200) +1 ;
    }
}
