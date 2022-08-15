package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(0,0);
        System.out.println("the area of the square is: " + square.SurfaceArea());
        System.out.println("the perimeter of the square is: " + square.Circuit());

        Rectangle rectangle = new Rectangle(0,0);
        System.out.println("the area of the rectangle is: " + rectangle.SurfaceArea());
        System.out.println("the perimeter of the rectangle is: " + rectangle.Circuit());

        Trapeze trapeze = new Trapeze(0,0);
        System.out.println("the area of the trapeze is: " + trapeze.SurfaceArea());
        System.out.println("the perimeter of the trapeze is: " + trapeze.Circuit());
    }



}
