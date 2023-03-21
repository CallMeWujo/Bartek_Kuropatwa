package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTest {

    @Autowired
    private TaskListRepository taskListRepository;
    private static final String LISTNAME = "Test: Hibernate";
    private static final String DESCRYPTION = "First task";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRYPTION);
        taskListRepository.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListRepository.findByListName(name);

        //Then
        Assertions.assertEquals(7,readTaskList.size());

        //CleanUp
        int id = readTaskList.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
