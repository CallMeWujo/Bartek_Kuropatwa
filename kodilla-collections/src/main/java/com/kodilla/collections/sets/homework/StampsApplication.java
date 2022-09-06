package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Cheops Pyramid", 220,true));
        stamps.add(new Stamp("Big Ben",210,false));
        stamps.add(new Stamp("London Eye", 217,false));
        stamps.add(new Stamp("Niagara Falls",230,true));
        stamps.add(new Stamp("Big Ben",210,false));

        System.out.println("stamps size is: " + stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
