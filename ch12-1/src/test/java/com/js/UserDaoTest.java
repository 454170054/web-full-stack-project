package com.js;

import com.js.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-09-25 22:18
 */
public class UserDaoTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDaoProxy = (UserDao) applicationContext.getBean("userDaoProxy");
        userDaoProxy.deleteUser();
    }
}
