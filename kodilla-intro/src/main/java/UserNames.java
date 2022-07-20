public class UserNames {
    public static void main(String[] args) {
        User Bartek = new User("Bartek", 26);
        User Pawel = new User("Pawel", 31);
        User Marcin = new User("Marcin", 29);
        User Iwona = new User("Iwona", 60);

        String[] User = new String[4];
        User[0] = Bartek.getName() + Bartek.getAge();
        User[1] = Pawel.getName() + Pawel.getAge();
        User[2] = Marcin.getName() + Marcin.getAge();
        User[3] = Iwona.getName() + Iwona.getAge();

        int numberOfElements = User.length;
        System.out.println(numberOfElements);

    }
}
