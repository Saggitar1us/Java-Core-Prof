package ru.stepanov.se.jdbc.dao;

import ru.stepanov.se.jdbc.dao.manager.ConnectionManager;
import ru.stepanov.se.jdbc.dao.manager.constant.FieldConst;
import ru.stepanov.se.jdbc.dto.ProjectDTO;
import lombok.Getter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Getter
public class ProjectDAO {

    private final ConnectionManager manager;

    public ProjectDAO() { this(new ConnectionManager());}

    public ProjectDAO(final ConnectionManager manager) { this.manager = manager;}

    private ProjectDTO fetch(final ResultSet row) throws SQLException {
        if (row == null) return null;
        final ProjectDTO project = new ProjectDTO();
        project.setId(row.getString(FieldConst.ID));
        project.setName(row.getString(FieldConst.NAME));
        project.setDescription(row.getString(FieldConst.DESCRIPTION));
        project.setDataBegin(row.getString(FieldConst.DATA_BEGIN));
        project.setDataEnd(row.getString(FieldConst.DATE_END));
        return project;
    }

    public List<ProjectDTO> findAll() throws Exception {
        final Statement statement = manager.createStatment();
        final String query = "SELECT * FROM app_Project";
        final ResultSet resultSet = statement.executeQuery(query);
        final List<ProjectDTO> result = new ArrayList<>();
        while (resultSet.next()) result.add(fetch(resultSet));
        statement.close();
        return result;
    }
}
