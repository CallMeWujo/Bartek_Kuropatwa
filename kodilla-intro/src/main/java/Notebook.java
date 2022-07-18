import java.sql.SQLSyntaxErrorException;

public class Notebook {
   int weight;
   int price;
   int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("this notebook is cheap, ");
        } else if (this.price > 599 && this.price < 1001){
            System.out.println("this price is good, ");
        } else {
            System.out.println("this notebook is expensive");
        }
    }
    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("this notebook is quite light, ");
        } else if (this.weight > 1000 && this.weight < 1700) {
            System.out.print("this notebook is quite heavy, ");
        } else {
            System.out.print("this notebook is very heavy, ");
        }
    }
    public void checkYear() {
        if (this.year > 2020) {
            System.out.println("this notebook is almost brand new, ");
        } else if (this.year < 2020 && this.year > 2009) {
            System.out.println("this notebook is a bit old, ");
        } else {
            System.out.print("this notebook is very old, ");
        }
    }
    public void checkYearAndCheckPrice() {
        if (this.price > 900 && this.year > 2020) {
            System.out.println("this notebook is cheap and very good, ");
        } else if (this.price > 1400 && this.year < 2020) {
            System.out.println("this notebook is old but still pretty good, ");
        } else {
            System.out.println("this notebook is old and hopeless");
        }
    }
}
