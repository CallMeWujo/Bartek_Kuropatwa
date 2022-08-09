import java.util.Random;

public class losowanie {
    public static int getCountOfRandomNumber() {
        Random random = new Random();
        int minRoll = 0;
        int maxRoll = 30;
        int result = 0;
        int sum = 0;
        while (sum <= 5000) {
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
        int randomNumbers = getCountOfRandomNumber();
                System.out.println(randomNumbers);
    }
}

