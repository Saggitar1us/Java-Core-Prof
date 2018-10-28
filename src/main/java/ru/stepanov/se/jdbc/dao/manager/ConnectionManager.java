package ru.stepanov.se.jdbc.dao.manager;

import ru.stepanov.se.jdbc.dao.config.Config;
import ru.stepanov.se.jdbc.dao.config.DefaultConfig;
import lombok.Getter;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

@Getter
@Setter
public class ConnectionManager {

    private Config config;

    public ConnectionManager() {
        this(new DefaultConfig());
    }

    public ConnectionManager(final Config config) {
        this.config = config;
    }

    private Connection connection;

    public Statement createStatment() throws Exception {
        return connection.createStatement();
    }

    public PreparedStatement createPreparedStatement(final String sql) throws Exception {
        return connection.prepareStatement(sql);
    }

    public void connect() throws Exception {
        Class.forName(config.getDriverName());
        connection = DriverManager.getConnection(config.toString(), config.getUserName(), config.getPassword());
    }

    public void disconnect() throws Exception {
        connection.close();
    }
}
