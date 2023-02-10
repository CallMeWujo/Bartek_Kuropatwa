package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private  Wallet wallet = new Wallet();
    private  CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        Given("I have deposited $200 in my wallet", () -> {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance",200,wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });

        Then("$30 should be dispensed", () -> {
        Assert.assertEquals(30,cashSlot.getContents());
        });



        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance",100,wallet.getBalance());
        });

        When("I request $100", () -> {
            Cashier cashier =new Cashier(cashSlot);
            cashier.withdraw(wallet,100);
        });

        Then("$100 should be dispensed", () -> {
            Assert.assertEquals(100,cashSlot.getContents());
        });



        Given("I have deposited $50 in my wallet", () -> {
            wallet.deposit(50);
            Assert.assertEquals("Incorrect wallet balance",50,wallet.getBalance());
        });

        When("I request $0", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,0);
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0,cashSlot.getContents());
        });



        Given("I have deposited $150 in my wallet", () -> {
            wallet.deposit(150);
            Assert.assertEquals(150,wallet.getBalance());
        });

        When("I request $170", () -> {
           Cashier cashier = new Cashier(cashSlot);
           cashier.withdraw(wallet,170);

        });

        Then("Nothing should be dispensed", () -> {
            Assert.assertEquals(0,cashSlot.getContents());
        });

        Then("I should be told that I don't have enough money in my wallet", () -> {
            Assert.assertEquals("not enough money in your wallet", "not enough money in your wallet");
        });




    }
}
