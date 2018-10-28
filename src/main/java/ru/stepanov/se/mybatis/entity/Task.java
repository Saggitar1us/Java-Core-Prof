package ru.stepanov.se.mybatis.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Task {

    private String id;

    private String projectId;

    private String name;

    private String description;

    private Date dateBegin;

    private Date dateEnd;
}
