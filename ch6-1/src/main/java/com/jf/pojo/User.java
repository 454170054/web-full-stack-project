package com.jf.pojo;

import lombok.Data;
import lombok.ToString;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-16 17:36
 */
@Data
@ToString
public class User {
    private String name;

    private int age;

    private String[] hobby;
}
