package com.jf;

import com.jf.config.AppConfig;
import com.jf.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-11-06 19:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class MyAopAnnoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testAddUser(){
        userDao.addUser();
    }

}
