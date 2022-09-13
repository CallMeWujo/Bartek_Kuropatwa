package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {
    @Test
    public void testFindFlightsTo() {

        FlightFinder flightFinder = new FlightFinder();

        List<Flight> result = flightFinder.findFlightsTo("Warsaw");
        assertEquals(1,result.size());
    }
    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        assertEquals(3,result.size());
    }

}