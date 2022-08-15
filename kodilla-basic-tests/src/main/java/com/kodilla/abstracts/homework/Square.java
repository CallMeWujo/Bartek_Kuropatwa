package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(int surfaceArea, int circuit) {
        super(surfaceArea, circuit);
    }

    @Override
    public int SurfaceArea() {
        int a = 5;
        int result = a*a;
        return result;
    }

    @Override
    public int Circuit() {
        int a = 5;
        int result = a * a * a * a;
        return result;

    }
}
