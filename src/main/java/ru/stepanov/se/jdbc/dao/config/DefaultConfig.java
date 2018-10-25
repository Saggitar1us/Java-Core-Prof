package ru.stepanov.se.jdbc.dao.config;

public class DefaultConfig extends Config {
    {
        setDriverName("com.mysql.jdbc.Driver");
        setDataBaseType("mysql");
        setDataBaseName("example");
        setHost("localhost");
        setUserName("root");
        setPassword("");
        setPort(3306);
    }
}
