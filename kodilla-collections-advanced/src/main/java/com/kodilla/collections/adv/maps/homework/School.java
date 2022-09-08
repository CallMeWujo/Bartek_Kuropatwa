package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(List<Integer> numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getSum() {
        int sum = 0;
        for (int students : numberOfStudents)
            sum += students;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "numberOfStudents=" + numberOfStudents +
                '}';
    }
}
