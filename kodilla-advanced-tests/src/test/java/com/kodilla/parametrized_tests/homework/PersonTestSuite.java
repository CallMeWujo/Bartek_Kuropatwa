package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.IntegerSources#provideIntegerForTestingBMI")
    public void shouldCalculateBMI (double heightInMeters, double weightInKilogram, String text) {
        Person person = new Person(heightInMeters, weightInKilogram);
        assertEquals(text, person.getBMI());
    }

}