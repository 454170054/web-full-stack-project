package com.jf.mapper;

import com.jf.pojo.po.StudentPO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-27 15:33
 */
public interface StudentMapper {

    StudentPO findStudentById(@Param("id") Integer id);

    List<StudentPO> findStudentList();

    int addStudent(StudentPO student);

    int updateStudent(StudentPO student);

    int deleteStudent(long stuId);

    List<StudentPO> findStudentByCondition(@Param("student") StudentPO studentPO);

    List<StudentPO> findStudentByChoose(@Param("student") StudentPO studentPO);

    List<StudentPO> findStudentByIds(@Param("ids") List<Long> ids);
}
