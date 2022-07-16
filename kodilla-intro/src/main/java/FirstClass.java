public class FirstClass {

        public static void main(String[] args) {

            Notebook notebook = new Notebook(600, 1000, 2022);
            System.out.println(notebook.weight + "g " + notebook.price + "zl " + notebook.year + "y");
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.checkYear();
            notebook.checkYearAndCheckPrice();

            Notebook heavyNotebook = new Notebook(2000, 1500, 2010);
            System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price + "zl " + heavyNotebook.year + "y");
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();
            heavyNotebook.checkYear();
            heavyNotebook.checkYearAndCheckPrice();

            Notebook oldNotebook = new Notebook(1600, 500, 2000);
            System.out.println(oldNotebook.weight + "g " + oldNotebook.price + "zl " + oldNotebook.year + "y");
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();
            oldNotebook.checkYear();
            oldNotebook.checkYearAndCheckPrice();

        }
}

