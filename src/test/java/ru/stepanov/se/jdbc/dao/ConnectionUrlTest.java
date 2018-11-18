package ru.stepanov.se.jdbc.dao;

import org.junit.jupiter.api.Test;
import ru.stepanov.se.jdbc.dao.config.Config;

public class ConnectionUrlTest {

    @Test
    public void test() {
        final Config config = new Config();
        config.setDriverName("com.mysql.ru.jdbc.Driver");
        config.setDataBaseType("mysql");
        config.setDataBaseName("example");
        config.setHost("localhost");
        config.setPort(3306);

        System.out.println(config);
    }

}
