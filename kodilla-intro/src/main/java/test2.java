import java.util.Random;

public class test2 {
    public static int randomNumber() {
        Random random = new Random();
        int min = 0;
        int max = 30;
        int sum = 0;

        while (sum <= 5000) {
            int temp = random.nextInt(30);
            if (temp > max)
                max = temp;
            if (temp < min)
                min = temp;
            sum = sum + temp;

        }
        return sum;

    }
    public static void main(String[] args) {
        int numbers = randomNumber();

        System.out.println(numbers);


    }
}
