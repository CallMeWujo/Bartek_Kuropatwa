package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int surfaceArea;
    private int circuit;

    public Shape(int surfaceArea, int circuit){
        this.surfaceArea = surfaceArea;
        this.circuit = circuit;

    }

    public abstract int SurfaceArea();
    public abstract int Circuit();
}
