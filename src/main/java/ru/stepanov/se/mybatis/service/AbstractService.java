package ru.stepanov.se.mybatis.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public abstract class AbstractService {

    private static final String RESOURCE = "mybatis-config.xml";

    final SqlSessionFactory sqlSessionFactory;

    final SqlSession sqlSession;

    AbstractService() throws Exception {
        final InputStream inputStream = Resources.getResourceAsStream(RESOURCE);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
    }
}
