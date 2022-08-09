import java.util.Random;

public class RandomNumbers {
    public static int randomNumber(int max) {
        Random random = new Random();
        int minRoll = 0;
        int maxRoll = 30;
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
        return maxRoll;


    }

    public static void main(String[] args) {
        int randomNumbers = randomNumber(5000);
        System.out.println("liczba losowan to " + randomNumbers);
    }
}
