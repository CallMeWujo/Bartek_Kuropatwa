package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {

    @Test
     void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
     void shouldBeLeapYearIfDivisibleBy4AndNotDivisibleBy100() {

        //given
        Year year = new Year(1604);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
     void shouldNotBeLeapYearIfNotDivisibleBy4() {

        //given
        Year year = new Year(1603);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }

    @Test
     void shouldNotBeLeapYearIfNotDivisibleBy400() {

        //given
        Year year = new Year(1700);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertFalse(isLeapYear);
    }
}