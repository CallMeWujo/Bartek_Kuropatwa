public class UserNames {
    public static void main(String[] args) {
        User Bartek = new User("Bartek", 26);
        User Pawel = new User("Pawel", 31);
        User Marcin = new User("Marcin", 29);
        User Iwona = new User("Iwona", 60);

        String[] users = {Bartek.getName(), Pawel.getName(), Marcin.getName(), Iwona.getName()};
        double[] age = {Bartek.getAge(), Pawel.getAge(), Marcin.getAge(), Iwona.getAge()};

        int numberOfUsers = users.length;
        System.out.println(numberOfUsers);

        double sum = 0.0;

        for (int i = 0; i < age.length; i++) {
            sum = sum + age[i];
            System.out.println(sum);

        }
        double averageAgeOfUsers = sum / users.length;
        System.out.println(averageAgeOfUsers);

        for (int i=0; i < users.length; i++) {
            if (age[i] < averageAgeOfUsers) {
                System.out.println(users[i]);
            }
        }
    }
}
