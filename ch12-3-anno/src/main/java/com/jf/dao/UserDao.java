package com.jf.dao;

import com.jf.anno.MyAopAnno;
import org.springframework.stereotype.Repository;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-11-06 19:02
 */
@Repository
public class UserDao {

    @MyAopAnno
    public void addUser(){
        System.out.println("用户添加成功");
    }
}
