package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {

        List<Flight> flightList = new ArrayList<>();

        flightList.add(new Flight("Warsaw", "London"));
        flightList.add(new Flight("London", "Amsterdam"));
        flightList.add(new Flight("Amsterdam", "Stockholm"));
        flightList.add(new Flight("Amsterdam", "Warsaw"));
        flightList.add(new Flight("Warsaw", "Stockholm"));
        flightList.add(new Flight("London", "Stockholm"));
        flightList.add(new Flight("Warsaw", "Cairo"));
        flightList.add(new Flight("Cairo", "London"));

        return flightList;
    }
}
