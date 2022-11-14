package com.jf.pojo.po;

import lombok.Data;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-24 22:36
 */
@Data
public class StudentPO {
    private Long stuId;

    private String stuName;

    private Integer sex;

    private Integer grade;

    private String dept;

    private String classname;
}
