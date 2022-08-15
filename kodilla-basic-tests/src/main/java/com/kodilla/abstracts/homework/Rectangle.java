package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle(int surfaceArea, int circuit) {
        super(surfaceArea, circuit);
    }

    @Override
    public int SurfaceArea() {
        int a = 5;
        int b = 8;
        int result = a*b;
        return result;
    }

    @Override
    public int Circuit() {
        int a = 5;
        int b = 8;
        int result = 2*a + 2*b;
        return result;
    }
}
