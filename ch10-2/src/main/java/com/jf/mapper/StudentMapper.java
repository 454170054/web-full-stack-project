package com.jf.mapper;

import com.jf.pojo.po.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> selectStudentsByPages();


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sat Oct 29 19:26:40 CST 2022
     */
    int deleteByPrimaryKey(Long stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sat Oct 29 19:26:40 CST 2022
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sat Oct 29 19:26:40 CST 2022
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sat Oct 29 19:26:40 CST 2022
     */
    Student selectByPrimaryKey(Long stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sat Oct 29 19:26:40 CST 2022
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sat Oct 29 19:26:40 CST 2022
     */
    int updateByPrimaryKey(Student record);


}