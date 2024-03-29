package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("----------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car speed: " + car.getSpeed());

    }

    public static String getCarName(Car car) {
     if (car instanceof Ford)
         return "Ford";
     else if (car instanceof Opel)
             return "Opel";
     else if (car instanceof Bmw)
         return "Bmw";
     else
         return "Unknown Car Name";

     }

}

