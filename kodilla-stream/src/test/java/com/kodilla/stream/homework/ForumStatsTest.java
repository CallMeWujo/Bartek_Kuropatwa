package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    public  void testGetAverageNumberOfPostsForPeopleOlderOrEqualToFortyYearsOfAge(){
        ForumStats forumStats = new ForumStats();
        double avg = ForumStats.getAverageNumberOfPostsForPeopleOlderOrEqualToFortyYearsOfAge(new ArrayList<>());

        assertEquals(2.25,avg,0.5);
    }
    @Test
    public void testGetAverageNumberOfPostsForPeopleYoungerThanFortyYearsOfAge() {
        ForumStats forumStats = new ForumStats();
        double avg = ForumStats.getAverageNumberOfPostsForPeopleYoungerThanFortyYearsOfAge(new ArrayList<>());

        assertEquals(2382,avg,1);
    }




}