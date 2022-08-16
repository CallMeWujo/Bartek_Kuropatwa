package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(5,8);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator1 = new Calculator();
        int subResult = calculator.sub(5,8);
        boolean correct1 = ResultChecker.assertEquals(-3, subResult);

        if (correct1) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator2 = new Calculator();
        int mulResult = calculator.mul(5);
        boolean correct2 = ResultChecker.assertEquals(25,mulResult);

        if (correct2) {
            System.out.println("Metoda mul działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda mul nie działa poprawnie dla liczby " + a);
        }
    }
}
