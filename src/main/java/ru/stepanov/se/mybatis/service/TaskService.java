package ru.stepanov.se.mybatis.service;

import ru.stepanov.se.mybatis.entity.Task;
import ru.stepanov.se.mybatis.repository.TaskRepository;

import java.util.List;

public class TaskService extends AbstractService {

    private TaskRepository taskRepository;

    public TaskService() throws Exception {
        taskRepository = sqlSession.getMapper(TaskRepository.class);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public List<String> ids() {
        return taskRepository.ids();
    }

    public Task findOne(String id) {
        return taskRepository.findOne(id);
    }

    public void insert(Task task) {
        taskRepository.insert(task);
    }

    public void update(Task task) {
        taskRepository.update(task);
    }

    public void clear() {
        taskRepository.clear();
    }
}
