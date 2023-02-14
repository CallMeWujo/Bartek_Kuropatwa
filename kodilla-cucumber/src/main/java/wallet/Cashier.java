package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (wallet.getBalance() >= amount) {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        }
        else {
            System.out.println("There is not enough money on your account");
        }
    }
}
