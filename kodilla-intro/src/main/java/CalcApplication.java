public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println("Area of the Circle with radius 10 equals: " + area);

        double perimeter = calculator.circlePerimeter(10);
        System.out.println("circle perimeter is: " + perimeter);

        double sum = calculator.add(2.5, 7.5);
        System.out.println("sum of numbers a and b is: " + sum);

        double subtract = calculator.sub(2.5, 7.5);
        System.out.println("subtract of numbers a and b is: " + subtract);

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equal to " + p);

        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.counter);
    }
}
