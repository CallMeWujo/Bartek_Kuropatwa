package com.kodilla.BankHomework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldAddThreeATMs() { // dodaje 3 bankomaty
        Bank bank = new Bank();
        CashMachine atm = new CashMachine();
        bank.add(atm);
        CashMachine atm1 = new CashMachine();
        bank.add(atm1);
        CashMachine atm2 = new CashMachine();
        bank.add(atm2);
        CashMachine[] atmList = bank.getAtmList();
        assertEquals(3,atmList.length);
    }
    @Test
    public void shouldCalculateBalanceOfAllATMs() {  //stan konta ze wszystkich bankomatów
        Bank bank = new Bank();
        CashMachine atm = new CashMachine();
        bank.add(atm);
        atm.add(4000);
        atm.add(2700);
        atm.add(-1500);

        CashMachine atm1 = new CashMachine();
        bank.add(atm1);
        atm1.add(12300);
        atm1.add(-6200);
        atm1.add(-2100);

        CashMachine atm2 = new CashMachine();
        bank.add(atm2);
        atm2.add(6900);
        atm2.add(-4100);
        atm2.add(-3700);
        atm2.add(-600);

        int atmList = bank.getBalanceOfAllATMs();
        assertEquals(7700, atmList);
    }
    @Test
    public void shouldCalculateNumberOfPaymentTransactions() { // liczy wszytkie wpłaty do bankomatu (+)
        Bank bank = new Bank();
        CashMachine atm = new CashMachine();
        bank.add(atm);
        atm.add(2100);
        atm.add(3600);
        atm.add(-700);

        CashMachine atm1 = new CashMachine();
        bank.add(atm1);
        atm1.add(15000);
        atm1.add(7500);
        atm1.add(0);                   // nie liczy sie jako transakcja

        CashMachine atm2 = new CashMachine();
        bank.add(atm2);
        atm2.add(-900);
        atm2.add(-14400);
        atm2.add(500);

        int payment = bank.getNumberOfAllDeposits();
        assertEquals(5,payment);
    }
    @Test
    public void shouldCalculateNumberOfPaycheckTransaction() { // liczy wszystkie wypłaty z bankomatu
        Bank bank =new Bank();
        CashMachine atm =new CashMachine();
        bank.add(atm);
        atm.add(-200);
        atm.add(-1000);
        atm.add(1000);
        atm.add(0);

        CashMachine atm1 = new CashMachine();
        bank.add(atm1);
        atm1.add(-1200);
        atm1.add(2100);
        atm1.add(-700);

        CashMachine atm2 = new CashMachine();
        bank.add(atm2);
        atm2.add(500);
        atm2.add(-1700);
        atm2.add(-200);

        int paycheck = bank.getNumberOfAllWithdrawals();
        assertEquals(6,paycheck);
    }

    @Test
    public void shouldCalculateAverageOfAllPayments() {  //srednia kwota wpłaty do wszystkich bankomatów
        Bank bank = new Bank();
        CashMachine atm = new CashMachine();
        bank.add(atm);
        atm.add(400);
        atm.add(1200);
        atm.add(700);
        atm.add(0);

        CashMachine atm1 = new CashMachine();
        bank.add(atm1);
        atm1.add(-200);
        atm1.add(-900);
        atm1.add(1100);

        CashMachine atm2 =new CashMachine();
        bank.add(atm2);
        atm2.add(-200);
        atm2.add(-1100);

        int averageOfAllPayment = bank.getAverageValueOfAllPayments();
        assertEquals(850,averageOfAllPayment);
    }

    @Test
    public void shouldCalculateAverageOfAllPaychecks() {  //średnia kwota wypłaty ze wszystkich bankomatów
        Bank bank = new Bank();
        CashMachine atm = new CashMachine();
        bank.add(atm);
        atm.add(-1100);
        atm.add(200);
        atm.add(-200);
        atm.add(0);

        CashMachine atm1 = new CashMachine();
        bank.add(atm1);
        atm1.add(3200);
        atm1.add(-700);

        CashMachine atm2 =new CashMachine();
        bank.add(atm2);
        atm2.add(-1200);
        atm2.add(1100);
        atm2.add(-900);

        int averageOfAllPaychecks = bank.getAverageValueOfPaychecks();
        assertEquals(-820,averageOfAllPaychecks);
    }

}
