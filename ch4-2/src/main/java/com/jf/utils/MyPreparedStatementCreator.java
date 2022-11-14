package com.jf.utils;

import org.springframework.jdbc.core.PreparedStatementCreator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-09 21:22
 */
public class MyPreparedStatementCreator implements PreparedStatementCreator {

    private String sql;


    public MyPreparedStatementCreator(String sql){
        this.sql = sql;
    }

    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
        return connection.prepareStatement(sql);
    }
}
