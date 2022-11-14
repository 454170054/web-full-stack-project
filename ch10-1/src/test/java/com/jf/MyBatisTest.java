package com.jf;

import com.jf.pojo.po.StudentPO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.jf.mapper.StudentMapper;
import org.junit.Test;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            Reader resourceAsReader = Resources.getResourceAsReader("mybatis/config/mybatis-config.xml");
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
    /**
     * 1.根据学号查询学生信息
     */
    @Test
    public void findStudentByIdTest(){
        // 获取SqlSession
        SqlSession session = getSession();
        // SqlSession执行映射文件中定义的sql语句，并返回映射结果
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        StudentPO student = mapper.findStudentById(20220501);
        // 输出结果
        System.out.println(student);
        // 关闭session
        session.close();
    }
    /**
     * 2.查询全部学生信息
     */
    @Test
    public void findStudentListTest(){
        // 获取SqlSession
        SqlSession session = getSession();
        // SqlSession执行映射文件中定义的SQL语句，并返回映射结果
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<StudentPO> studentList = mapper.findStudentList();
        System.out.println(studentList);
    }

    /**
     * 3.增加学生信息
     */
    @Test
    public void addStudentTest(){
        // 获取SqlSession
        SqlSession session = getSession();
        // SqlSession执行映射文件中定义的SQL语句，并返回映射结果
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        StudentPO studentPO = new StudentPO();
        studentPO.setStuId(20220504l);
        studentPO.setStuName("小李");
        studentPO.setSex(0);
        studentPO.setGrade(0);
        studentPO.setDept("大数据学院");
        studentPO.setClassname("软件1班");
        int i = mapper.addStudent(studentPO);
        System.out.println(i);
        session.commit();
        session.close();
    }
    /**
     * 4.修改学生信息
     */
    @Test
    public void updateStudentTest() throws Exception{
        // 获取SqlSession
        SqlSession session = getSession();
        StudentPO studentPO = new StudentPO();
        studentPO.setStuId(20220504l);
        studentPO.setDept("英语");
        studentPO.setClassname("软件2班");
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        int rows = mapper.updateStudent(studentPO);
        if(rows > 0){
            System.out.println("您成功修改了"+rows+"条数据! ");
        }else{
            System.out.println("执行修改操作失败!!! ");
        }
        // 提交事务
        session.commit();
        // 关闭SqlSession
        session.close();
    }
    /**
     * 5.删除学生信息
     */
    @Test
    public void deleteStudentTest(){
        // 获取SqlSession
        SqlSession session = getSession();
        // SqlSession执行删除操作
        // 执行SqlSession的删除方法，返回的是Sql语句影响的行数
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        int i = mapper.deleteStudent(20220504l);
        // 通过返回结果判断删除操作是否执行成功
        if(i > 0){
            System.out.println("删除了"+i+"条数据");
        }else{
            System.out.println("执行删除操作失败");
        }
        // 提交事务
        session.commit();
        // 关闭SqlSession
        session.close();
    }

    /**
     * 6.测试for-each
     */
    @Test
    public void findStudentByConditionTest(){
        // 获取SqlSession
        SqlSession session = getSession();
        // SqlSession执行删除操作
        // 执行SqlSession的删除方法，返回的是Sql语句影响的行数
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        StudentPO studentPO = new StudentPO();
        studentPO.setStuName("小");
        List<StudentPO> studentByCondition = mapper.findStudentByCondition(studentPO);
        System.out.println(studentByCondition);
    }

    /**
     * 7.测试choose-when
     */
    @Test
    public void findStudentByChooseTest(){
        // 获取SqlSession
        SqlSession session = getSession();
        // SqlSession执行删除操作
        // 执行SqlSession的删除方法，返回的是Sql语句影响的行数
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        StudentPO studentPO = new StudentPO();
        studentPO.setStuName("小红");
        List<StudentPO> studentByCondition = mapper.findStudentByChoose(studentPO);
        System.out.println(studentByCondition);
    }

    /**
     * 8.测试for-each
     */
    @Test
    public void findStudentByIdsTest(){
        // 获取SqlSession
        SqlSession session = getSession();
        // SqlSession执行删除操作
        // 执行SqlSession的删除方法，返回的是Sql语句影响的行数
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Long> ids = new ArrayList<>();
        ids.add(null);
        List<StudentPO> studentByIds = mapper.findStudentByIds(ids);
        System.out.println(studentByIds);
    }

}
