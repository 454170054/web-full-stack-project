package com.js.dao.impl;

import com.js.dao.StudentDao;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-09-25 21:44
 */
@Slf4j
public class StudentDaoImpl implements StudentDao {

    public void addStudent() {
        System.out.println("添加学生信息");
    }

    public void deleteStudent() {
        System.out.println("====学生管理模块：删除学生信息====");
        log.info("1111");
    }


    public static void main(String[] args) {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        studentDao.deleteStudent();
    }
}
