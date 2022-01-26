package com.github.hcsp.mybatis;

import com.github.hcsp.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String resource = "db/mybatis/config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        UserDao userDao = new UserDao(new SqlSessionFactoryBuilder().build(inputStream));

        // userDao.getUserByPage(null, 6, 1);

        insertTest(userDao);
    }

    public static void insertTest(UserDao userDao) {
//        User user1 = new User(null, "hedongsheng", "18584401743", "广西南宁");
//        User user2 = new User(null, "ds2", "18322222", "广西宾阳");
//
//        List<User> userList = new ArrayList<>();
//        userList.add(user1);
//        userList.add(user2);
//
//        userDao.batchInsertUsers(userList);

        //User user3 = new User(8, null, "18359867458", null);

        //userDao.updateUser(user3);
        //userDao.deleteUserById(7);
        userDao.selectUserById(7);
    }
}
