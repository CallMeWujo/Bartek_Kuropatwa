import java.util.Random;

public class RandomNumbers {
    public static int randomNumber(int max) {
        Random random = new Random();
        int minRoll = 30;
        int maxRoll = 0;
        int result = 0;
        int sum = 0;
        while (sum <= max) {
            int temp = random.nextInt(30);
            if (temp < minRoll) {
                minRoll = temp;
            }
            if (temp > maxRoll) {
                maxRoll = temp;
            }
            sum = sum + temp;
            result++;

        }
        System.out.println(minRoll);

        return result;


    }

    public static void main(String[] args) {
        int randomNumbers = randomNumber(5000);
        System.out.println("liczba losowan to " + randomNumbers);

    }
}
