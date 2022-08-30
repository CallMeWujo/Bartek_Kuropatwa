package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] atmList;
    private int size;

    public Bank() {
        this.size = 0;
        this.atmList = new CashMachine[0];
    }

    public void add(CashMachine atm) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(atmList, 0, newTab, 0, atmList.length);
        newTab[this.size - 1] = atm;
        this.atmList = newTab;
    }
    public CashMachine[] getAtmList() {
        return atmList;
    }


    public int getBalanceOfAllATMs() {  // stan konta wszystkich bankowatów
        int sum = 0;
        for (int i = 0; i < atmList.length; i++) {
            sum += atmList[i].getAtmBalance();
        }
        return sum;
    }

    public int getNumberOfAllWithdrawals() { // suma operacji wypłacania (-)
        int sum = 0;
        for (int i = 0; i < atmList.length; i++) {
            sum += atmList[i].getNumberOfWithdrawalFromATM();
        }
        return  sum;
    }
    public int getNumberOfAllDeposits() { // suma operacji wpłacania (+)
        int sum = 0;
        for (int i = 0;i < atmList.length; i++) {
            sum += atmList[i].getNumberOfDepositToAtm();
        }
        return sum;
    }
    public int getValueOfAllPaychecks() { // suma wypłat ze wszystkich bankomatów
        int sum = 0;
        for (int i =0; i < atmList.length; i++) {
            if (atmList[i].getSumOfAllPaycheck() > 0)
                continue;
            sum += atmList[i].getSumOfAllPaycheck();
        }
        return sum;
    }
    public int getValueOfAllPayments() { //suma wpłat do wszystkich bankomatów
        int sum = 0;
        for (int i =0; i < atmList.length; i++) {
            if (atmList[i].getSumOfAllPayments() < 0)
                continue;
            sum += atmList[i].getSumOfAllPayments();
        }
        return sum;
    }
    public int getAverageValueOfPaychecks() {  //srednia ze wszystkich wypłat
        if (this.getNumberOfAllWithdrawals() ==0) {
            return 0;
        }
        return this.getValueOfAllPaychecks() / this.getNumberOfAllWithdrawals();
    }
    public int getAverageValueOfAllPayments() {   //srednia ze wszystkich wpłat
        if (this.getNumberOfAllDeposits() == 0) {
            return 0;
        }
        return this.getValueOfAllPayments() / this.getNumberOfAllDeposits();
    }
}
