package ru.stepanov.se.jdbc.dao;

import org.junit.jupiter.api.Test;
import ru.stepanov.se.mybatis.entity.Task;
import ru.stepanov.se.mybatis.service.TaskService;

import java.util.List;
import java.util.UUID;

public class TaskTest {

    @Test
    public void test() throws Exception {
        final TaskService taskDAO = new TaskService();

        final Task task = new Task();
        task.setId(UUID.randomUUID().toString());
        task.setName("WOW name");
        taskDAO.insert(task);

        final List<Task> tasks = taskDAO.findAll();;
    }
}
