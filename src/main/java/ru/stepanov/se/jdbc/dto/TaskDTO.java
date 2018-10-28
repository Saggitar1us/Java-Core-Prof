package ru.stepanov.se.jdbc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskDTO {

    private String id;

    private String projectId;

    private String name;

    private String description;

    private String dataBegin;

    private String dataEnd;

    public TaskDTO() {
    }
}
