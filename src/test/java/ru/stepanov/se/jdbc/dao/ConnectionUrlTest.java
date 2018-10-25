package ru.stepanov.se.jdbc.dao;

import ru.stepanov.se.jdbc.dao.config.Config;
import org.junit.Test;

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
