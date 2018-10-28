package ru.stepanov.se.jdbc;

import org.junit.Test;
import ru.stepanov.se.jdbc.dao.ProjectDAO;
import ru.stepanov.se.jdbc.dto.ProjectDTO;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class ProjectTest {

    @Test
    public void test() throws Exception {
        final ProjectDAO projectDAO = new ProjectDAO();
        projectDAO.getManager().connect();

        final List<ProjectDTO> projects = projectDAO.findAll();

        projectDAO.getManager().disconnect();
    }

    @Test
    public void testCRUD() throws Exception {
        final ProjectDAO projectDAO = new ProjectDAO();
        projectDAO.getManager().connect();

        final List<ProjectDTO> projects = projectDAO.findAll();

        final ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(UUID.randomUUID().toString());
        projectDTO.setName("First test");
        projectDTO.setDescription("This is first test row at DB");
//        projectDTO.setDataBegin(new Date());
//        projectDTO.setDataEnd(new Date());

    }
}
