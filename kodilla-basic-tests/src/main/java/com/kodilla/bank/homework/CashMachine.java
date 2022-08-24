package com.kodilla.bank.homework;

public class CashMachine {
    private int[] completedTransactions;

    private double balance;
    private int numberOfTransaction;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.completedTransactions = new int[0];
    }

    public double atmBalance() {
        return balance;
    }

    public int Transactions() {
        return numberOfTransaction;
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
    public double getAveragePayMent() {
        double sum = 0;
        for (int i = 0; i > completedTransactions[i]; i++) {
            sum += completedTransactions[i];
        }
        return sum/completedTransactions.length;
    }
    public double getAveragePayCheck() {
        double sum = 0;
        for (int i = 0;i < completedTransactions[i]; i++) {
            sum += completedTransactions[i];
        }
        return sum/ completedTransactions.length;
    }
}



