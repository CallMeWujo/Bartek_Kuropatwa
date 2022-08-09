import java.util.Locale;
import java.util.Scanner;

public class Color {

    public static String colorSelection() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("pick your color: B-black, G-green, P-purple, R-red, S-silver, Y-yellow");
            String color = scanner.nextLine().trim().toUpperCase();
            if (color.length() < 2) {
                switch (color) {
                    case "B":
                        return "Black";
                    case "G":
                        return "Green";
                    case "R":
                        return "Red";
                    case "S":
                        return "Silver";
                    case "Y":
                        return "Yellow";
                    default:
                }
            }
                else {
                    System.out.println("Please select your color again");
            }
        }
    }
}
