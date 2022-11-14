package com.jf;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jf.mapper.StudentMapper;
import com.jf.pojo.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-27 22:09
 */
public class MyBatisTest {
    private static SqlSessionFactory sqlSessionFactory = null;
    // 初始化SqlSessionFactory对象
    static {
        try{
            // 使用Mybatis提供的Resources类加载Mybatis的XML配置文件
            Reader resourceAsReader = Resources.getResourceAsReader("mybatis/mybatis-config.xml");
            // 构建SqlSessionFactory对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    // 获取SqlSession对象的静态方法
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }

    @Test
    public void selectByPrimaryKeyTest(){
        SqlSession session = getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = mapper.selectByPrimaryKey(20220501l);
        System.out.println(student);
        session.close();
    }

    @Test
    public void selectStudentsTest(){
        int pageNum = 1, pageSize = 3;
        SqlSession session = getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        // 设置分页属性
        PageHelper.startPage(pageNum, pageSize);
        List<Student> students = mapper.selectStudentsByPages();
        PageInfo<Student> page = new PageInfo<>(students);
        // 输出分页属性
        System.out.println("当前页码：" + page.getPageNum());
        System.out.println("每页数据数：" + page.getPageSize());
        System.out.println("数据总数：" + page.getTotal());
        System.out.println("总页数：" + page.getPages());
        for(Student stu : (List<Student>)page.getList()){
            System.out.println(stu);
        }
        // 关闭sqlsession
        session.close();
    }
}
