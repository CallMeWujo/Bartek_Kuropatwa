package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
      void shouldBeLeapYearIfDivisibleBy400 () {
        Year year = new Year(1600);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfIsNotDivisibleBy4() {
        Year year = new Year(1601);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy100() {
        Year year = new Year(1600);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }


}