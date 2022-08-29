package com.kodilla.bank.homework;

public class Bank {
    public CashMachine[] atmList;

    public int getBalanceOfAllATMs() {
        int sum = 0;
        for (int i = 0; i < atmList.length; i++) {
            sum += atmList[i].getAtmBalance();
        }
        return sum;
    }

    public int getNumberOfAllWithdrawals() {
        int sum = 0;
        for (int i = 0; i < atmList.length; i++) {
            sum += atmList[i].getAtmBalance();
        }
        return  sum;
    }
}
