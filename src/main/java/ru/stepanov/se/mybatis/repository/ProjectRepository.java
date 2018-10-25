package ru.stepanov.se.mybatis.repository;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ru.stepanov.se.mybatis.entity.Project;

import java.util.List;

public interface ProjectRepository {

    @Select("SELECT * FROM app_project")
    List<Project> findAll();

    @Select("SELECT id FROM app_project")
    List<String> ids();

    @Select("SELECT * FROM app_project WHERE id = #{id}")
    Project findOne(String id);

    @Insert("INSERT INTO app_project (id, name, description, dateBegin, dateEnd)" +
            "VALUES (#{id}, #{name}, #{description}, #{dateBegin}, #{dateEnd})")
    void insert(Project project);

    @Update("UPDATE app_project (name, description, dateBegin, dateEnd)" +
            "SET name = #{name}, description = #{description}, dateBegin = #{dateBegin}, dateEnd = #{dateEnd}"
            + "WHERE id = #{id}")
    void update(Project project);

    @Delete("DELETE FROM app_project")
    void clear();
}
