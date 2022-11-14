package com.jf;

import com.jf.pojo.po.StudentPO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-24 22:56
 */
public class MyBatisTest {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            String resource = "mybatis/config/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            StudentPO studentPO = session.selectOne("com.jf.mapper.StudentMapper.selectStudent", null);
            System.out.println(studentPO);
        }
    }
}
