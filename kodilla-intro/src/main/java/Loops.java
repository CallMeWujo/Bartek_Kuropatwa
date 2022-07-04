public class Loops {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            System.out.println(i);
        }
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
        int numberOfElements = names.length;
        for (int i=0; i< names.length; i++) {
            System.out.println(names[i]);
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
    public int sumNumber(int[] numbers) {
        int result = 0;
        int numbersOfElements = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }
}
