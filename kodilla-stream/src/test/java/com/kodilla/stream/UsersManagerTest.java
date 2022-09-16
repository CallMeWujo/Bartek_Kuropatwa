package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsername() {
        UsersManager usersManager = new UsersManager();
        List<String> result = UsersManager.filterChemistGroupUsernames();

        List<String> chemistsName = new ArrayList<>();
        chemistsName.add("Walter White");
        chemistsName.add("Gale Boetticher");
        assertEquals(chemistsName, result);


    }

    @Test
    public void testFilterGroupUserAge() {
        UsersManager usersManager = new UsersManager();
        List<String> result = UsersManager.filterGroupUserAge(35);

        List<String> usersage = new ArrayList<>();
        usersage.add("Walter White");
        usersage.add("Gus Firing");
        usersage.add("Gale Boetticher");
        usersage.add("Mike Ehrmantraut");

        assertEquals(usersage,result);
    }

    @Test
    public void testFilterGroupIfPostedAnyPost () {
        UsersManager usersManager = new UsersManager();
        List<String> result = UsersManager.filterGroupIfPostedAnyPost();

        List<String> userspost = new ArrayList<>();
        userspost.add("Walter White");
        userspost.add("Jessie Pinkman");
        userspost.add("Tuco Salamanca");
        userspost.add("Gale Boetticher");

        assertEquals(userspost, result);
    }


}