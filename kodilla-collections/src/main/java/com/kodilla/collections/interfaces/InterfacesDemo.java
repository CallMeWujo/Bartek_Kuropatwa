package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Shape square =new Square(10);
        showShapeDetails(square);

        Shape circle = new Circle(7);
        showShapeDetails(circle);

        Shape triangle = new Triangle(6.0,4.0,7.211);
        showShapeDetails(triangle);
    }
    private static void showShapeDetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
