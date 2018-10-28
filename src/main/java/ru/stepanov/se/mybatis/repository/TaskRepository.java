package ru.stepanov.se.mybatis.repository;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ru.stepanov.se.mybatis.entity.Task;

import java.util.List;

public interface TaskRepository {
    @Select("SELECT * FROM app_task")
    List<Task> findAll();

    @Select("SELECT id FROM app_task")
    List<String> ids();

    @Select("SELECT * FROM app_task WHERE id = #{id}")
    Task findOne(String id);

    @Insert("INSERT INTO app_task (id, name, project_id, description, dateBegin, dateEnd)" +
            "VALUES (#{id}, #{name}, #{project_id} #{description}, #{dateBegin}, #{dateEnd})")
    void insert(Task task);

    @Update("UPDATE app_task (name, project_id, description, dateBegin, dateEnd)" +
            "SET name = #{name}, project_id = {#project_id}, description = #{description}, dateBegin = #{dateBegin}, dateEnd = #{dateEnd}"
            + "WHERE id = #{id}")
    void update(Task task);

    @Delete("DELETE FROM app_task")
    void clear();
}

