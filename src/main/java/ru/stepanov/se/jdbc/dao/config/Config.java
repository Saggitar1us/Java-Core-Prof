package ru.stepanov.se.jdbc.dao.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Config {

    private String driverName;

    private String dataBaseName;

    private String dataBaseType;

    private String host;

    private String userName;

    private String password;

    private int port;

    @Override
    public String  toString() {
        return "jdbc:" + dataBaseType + "://" + host + ":" + port + "/" + dataBaseName;
    }
}
