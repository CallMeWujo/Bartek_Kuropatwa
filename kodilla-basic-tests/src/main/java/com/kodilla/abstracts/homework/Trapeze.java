package com.kodilla.abstracts.homework;

public class Trapeze extends Shape{
    public Trapeze(int surfaceArea, int circuit) {
        super(surfaceArea, circuit);
    }

    @Override
    public int SurfaceArea() {
        int a = 9;
        int b = 3;
        int h = 3;
        int result = (a+b)*h/2;
        return result;
    }

    @Override
    public int Circuit() {
        int a = 9;
        double b = 3.5;
        int c = 3;
        int d = 5;
        double result = a + b + c + d;
        return (int) result;
    }
}
