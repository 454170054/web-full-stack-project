package com.jf;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-07 23:48
 */
public class DruidTest {

    @Test
    public void main() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream(DruidTest.class.getResource("/").getPath() + "druid.properties"));
        //4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //5. 获取数据库连接 Connection
        Connection connection = dataSource.getConnection();
        System.out.println(connection); //获取到了连接后就可以继续做其他操作了
    }

    @Test
    public void testDruid(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource datasource = (DataSource) applicationContext.getBean("dataSource");
        JDBCTemplateTest bean = applicationContext.getBean(JDBCTemplateTest.class);
        System.out.println(bean.getJdbcTemplate());
    }
}
