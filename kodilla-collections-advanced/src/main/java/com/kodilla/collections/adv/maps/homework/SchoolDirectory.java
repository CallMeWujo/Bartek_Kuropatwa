package com.kodilla.collections.adv.maps.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {
        Map<Principal, School> principalSchoolMap = new HashMap<>();

        Principal jan = new Principal("Jan", "Kowalski", "Sp nr 8 im. Marii Curie-skłodowskiej");
        Principal maria = new Principal("Maria", "Kowalska", "Zst nr 4");
        Principal adam = new Principal("Adam", "Nowak", "Sp nr 10 im. Komisji Edukacji Narodowej");


        School janSchool = new School(Arrays.asList(21,27,31,19,29));
        School mariaSchool = new School(Arrays.asList(19,23,25,30,17));
        School adamSchool = new School(Arrays.asList(16,19,25,27,28));

        principalSchoolMap.put(jan, janSchool);
        principalSchoolMap.put(maria, mariaSchool);
        principalSchoolMap.put(adam, adamSchool);

        System.out.println(principalSchoolMap.get(jan));
    }
}
