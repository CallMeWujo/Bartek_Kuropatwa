package com.kodilla.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsername = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsername);

    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }

    public static List<String> filterGroupUserAge(int age) {
        List<String> userage = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return userage;
    }

    public static List<String> filterGroupIfPostedAnyPost() {
        List<String> userspost = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getNumberOfPost() > 0)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        return userspost;
    }



    public static String getUserName(User user) {
        return user.getUsername();
    }


}
