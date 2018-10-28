package ru.stepanov.se.mybatis.service;

import ru.stepanov.se.mybatis.entity.Project;
import ru.stepanov.se.mybatis.repository.ProjectRepository;

import java.util.List;

public final class ProjectService extends AbstractService {

    private final ProjectRepository projectRepository;

    public ProjectService() throws Exception {
     projectRepository = sqlSession.getMapper(ProjectRepository.class);
    }

    public List<Project> findAll() {return projectRepository.findAll();}

    public List<String> ids() {return projectRepository.ids();}

    public Project findOne(String id) { return projectRepository.findOne(id);}

    public void insert(Project project) {projectRepository.insert(project);}

    public void update(Project project) {projectRepository.update(project);}

    public void clear() {projectRepository.clear();}
}
