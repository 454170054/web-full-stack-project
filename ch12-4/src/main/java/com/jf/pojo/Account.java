package com.jf.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-11-06 20:18
 */
@Data
public class Account implements Serializable {
    private Long id;
    private String name;
    private Double money;
}
