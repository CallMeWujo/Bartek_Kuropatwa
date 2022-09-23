package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
    public static double getAverageNumberOfPostsForPeopleOlderOrEqualToFortyYearsOfAge(List<User> users) {
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;

    }

    public static double getAverageNumberOfPostsForPeopleYoungerThanFortyYearsOfAge(List<User> users) {
        double avg = UsersRepository.getUserList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        return avg;

    }

    public static void main(String[] args) {
        double olderOrEqualToFortyYearsOfAge = getAverageNumberOfPostsForPeopleOlderOrEqualToFortyYearsOfAge(new ArrayList<>());
        System.out.println(olderOrEqualToFortyYearsOfAge);

        double youngerThanFortyYearsOfAge = getAverageNumberOfPostsForPeopleYoungerThanFortyYearsOfAge(new ArrayList<>());
        System.out.println(youngerThanFortyYearsOfAge);


    }
}
