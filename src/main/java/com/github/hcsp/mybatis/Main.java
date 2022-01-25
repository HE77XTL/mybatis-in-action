package com.github.hcsp.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        String resource = "db/mybatis/config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        UserDao userDao = new UserDao(new SqlSessionFactoryBuilder().build(inputStream));

        userDao.getUserByPage("zhangsan", 0, 6);
    }
}
