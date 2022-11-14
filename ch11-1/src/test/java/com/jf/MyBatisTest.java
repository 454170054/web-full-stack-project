package com.jf;

import com.alibaba.druid.filter.AutoLoad;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jf.mapper.StudentMapper;
import com.jf.pojo.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Reader;
import java.util.List;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-27 22:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/application-spring.xml"})
public class MyBatisTest {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void selectStudentsTest(){
        int pageNum = 1, pageSize = 2;
        // 设置分页属性
        PageHelper.startPage(pageNum, pageSize);
        List<Student> students = studentMapper.selectStudentsByPages();
        PageInfo<Student> page = new PageInfo<>(students);
        // 输出分页属性
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("每页数据数：" + page.getPageSize());
        System.out.println("数据总数：" + page.getTotal());
        System.out.println("总页数：" + page.getPages());
        for(Student stu : (List<Student>)page.getList()){
            System.out.println(stu);
        }
    }
}
