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
}
