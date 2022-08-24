package com.kodilla.bank.homework;

public class Bank {

    private CashMachine ATM1;
    private CashMachine ATM2;
    private CashMachine ATM3;

    private int[] numberOfATM;

    public Bank() {
        this.numberOfATM = new int[0];

        this.ATM1 = new CashMachine();
        this.ATM2 = new CashMachine();
        this.ATM3 = new CashMachine();
    }


}
