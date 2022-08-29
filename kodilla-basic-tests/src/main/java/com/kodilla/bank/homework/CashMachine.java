package com.kodilla.bank.homework;

public class CashMachine {
    private int[] completedTransactions;

    private int size;

    public CashMachine() {
        this.size = 0;
        this.completedTransactions = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(completedTransactions, 0, newTab, 0, completedTransactions.length);
        newTab[this.size - 1] = value;
        this.completedTransactions = newTab;
    }

    public int[] getCompletedTransactions() {
        return completedTransactions;
    }

    public int getNumberOfWithdrawalFromATM(){   // ilosc wyplat z bankomatu (-)
        int sum = 0;
        for (int i = 0; i < completedTransactions.length; i++){
            if (completedTransactions[i] > 0)
                continue;
            sum++;
        }
        return sum;
    }

    public int getNumberOfDepositToAtm() {   // ilosc wplat do bankomatu (+)
        int sum = 0;
        for (int i = 0;i < completedTransactions.length; i++) {
            if (completedTransactions[i] < 0)
                continue;
            sum++;
        }
        return sum;
    }

    public int getSumOfAllPayments() {   // suma wszystkich wplat do bankomatu (+)
        int sumOfAllPayments = 0;
        for (int i = 0; i < completedTransactions[i]; i++) {
            if (completedTransactions[i] < 0)
                continue;
                sumOfAllPayments += completedTransactions[i];
        }
        return sumOfAllPayments;
    }

    public int getSumOfAllPaycheck() {   //suma wszystkich wyplat z bankomatu (-)
        int sumOfAllPaycheck = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            if (completedTransactions[i] > 0)
                continue;
                sumOfAllPaycheck += completedTransactions[i];
        }
        return sumOfAllPaycheck;
    }

    public double getAveragePaymentNumber() {        //srednia kwota wpłaty (+) poprawne
        if (this.getNumberOfDepositToAtm() == 0) {
            return 0;
        }
        return this.getSumOfAllPayments() / this.getNumberOfDepositToAtm();
    }

    public double getAveragePaycheckNumber() {      //srednia kwota wyplaty (-) poprawne
        if (this.getNumberOfWithdrawalFromATM() == 0) {
            return 0;
        }
        return this.getSumOfAllPaycheck() / this.getNumberOfWithdrawalFromATM();
    }

    public double getAveragePayment() {   // srednia kwota wplacana (+)
        double sum = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            if (completedTransactions[i] < 0)
                continue;
            sum += completedTransactions[i];
        }
        return sum;
    }
    public double getAveragePaycheck() {    // srednia kwota wyplacana (-)
        double sum = 0;
        for (int i = 0;i < completedTransactions[i]; i++) {
            if (completedTransactions[i] > 0)
                continue;
            sum += completedTransactions[i];
        }
        return sum;
    }

    public int getAtmBalance() {    // stan konta bankomatu
        int balance = 0;
        for (int i = 0; i < completedTransactions.length; i++) {
            balance += completedTransactions[i];
        }
        return balance;
    }


}



