package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    private int speed;

    public Ford(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 40;


    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 18;

    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }
}
