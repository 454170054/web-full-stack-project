package com.jf.service.impl;

import com.github.pagehelper.PageHelper;
import com.jf.mapper.StudentMapper;
import com.jf.pojo.po.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-30 21:19
 */
@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> studentList() {
        return studentMapper.selectStudentsByPages();
    }
}
