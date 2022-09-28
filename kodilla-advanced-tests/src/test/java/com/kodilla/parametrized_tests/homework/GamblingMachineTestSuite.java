package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();
    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineCorrectNumbers.csv", numLinesToSkip = 1)
    public void gamblingMashineCorrectNumbersTest (int n1,int n2,int n3,int n4,int n5,int n6) throws InvalidNumbersException{
        Set<Integer> numbers = new HashSet<>();
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);
        numbers.add(n6);
        assertEquals(true,gamblingMachine.howManyWins(numbers) >= 0 & gamblingMachine.howManyWins(numbers) <=6);

    }
    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineNullAndNegativeNumbers.csv", numLinesToSkip = 1)
    public void gamblingMachineNegativeAndNull(int n1,int n2,int n3,int n4,int n5,int n6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);
        numbers.add(n6);
        assertThrows(InvalidNumbersException.class,() -> gamblingMachine.howManyWins(numbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineTooManyNumbers.csv", numLinesToSkip = 1)
        public void gamblingMachineTooManyNumbers(int n1,int n2,int n3,int n4,int n5,int n6,int n7) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);
        numbers.add(n6);
        numbers.add(n7);
        assertThrows(InvalidNumbersException.class,() -> gamblingMachine.howManyWins(numbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/GamblingMachineTooHighNumbers.csv", numLinesToSkip = 1)
    public void gamblingMachineTooHighNumbersWithException(int n1,int n2,int n3,int n4,int n5,int n6) throws InvalidNumbersException {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);
        numbers.add(n6);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
}