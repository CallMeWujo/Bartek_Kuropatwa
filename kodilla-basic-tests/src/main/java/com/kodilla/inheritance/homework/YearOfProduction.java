package com.kodilla.inheritance.homework;

public class YearOfProduction {
    public static void main(String[] args) {

        OperatingSystem directorTape = new OperatingSystem(8, 3, 1955);
        System.out.println("Director Tape year of production is :");
        directorTape.yearOfProduction();

        Windows windows = new Windows(20, 10, 1985);
        windows.yearOfProduction();

        Windows10 windows10 = new Windows10(29, 7, 2015);
        windows10.yearOfProduction();
    }
}