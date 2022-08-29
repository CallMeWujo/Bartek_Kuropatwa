package com.kodilla.BankHomework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLenght() {
        CashMachine cashMachine = new CashMachine();
        int [] completedTransaction = cashMachine.getCompletedTransactions();
        assertEquals(0,completedTransaction.length);
    }
    @Test
    public void shouldAddFourElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1200);
        cashMachine.add(750);
        cashMachine.add(-450);
        cashMachine.add(-1000);

        int[] completedTransaction = cashMachine.getCompletedTransactions();
        assertEquals(4,completedTransaction.length);
        assertEquals(1200,completedTransaction[0]);
        assertEquals(750,completedTransaction[1]);
        assertEquals(-450, completedTransaction[2]);
        assertEquals(-1000, completedTransaction[3]);
    }
    @Test
    public void shouldCalculateBalanceOfATM() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1200);
        cashMachine.add(750);
        cashMachine.add(-450);
        cashMachine.add(-1000);

        int completedTransaction = cashMachine.getAtmBalance();
        assertEquals(500,completedTransaction);
    }
    @Test
    public void ShouldCalculateNumberOfTransaction() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(3200);
        cashMachine.add(1700);
        cashMachine.add(-2000);
        cashMachine.add(-3);
        cashMachine.add(-23544);

        int[] numberOfTransactions = cashMachine.getCompletedTransactions();
        assertEquals(5,numberOfTransactions.length);
    }
    @Test
    public void ShouldCalculateAveragePayment() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(15000);
        cashMachine.add(7130);
        cashMachine.add(2110);
        cashMachine.add(-8900);
        cashMachine.add(-4500);
        double averagePayment = cashMachine.getAveragePaymentNumber();
        assertEquals(8080,averagePayment,0.1);
    }
    @Test
    public void ShouldCalculateAveragePaycheck() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-12000);
        cashMachine.add(-6240);
        cashMachine.add(8100);
        cashMachine.add(7300);
        cashMachine.add(499);
        double averagePaycheck = cashMachine.getAveragePaycheckNumber();
        assertEquals(10,averagePaycheck,0.1);
    }
}
