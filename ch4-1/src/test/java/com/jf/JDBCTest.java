package com.jf;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-08 21:31
 */
public class JDBCTest {

    /**
     * 增
     */
    @Test
    public void testCreate() throws Exception {
        //注册驱动，可省略
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        String url = "jdbc:mysql:///jdbc_demo";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        //获取执行statement
        String sql = "insert into account(name, money) values(?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, "小胡");
        preparedStatement.setDouble(2, 12313.22);
        //处理结果
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        //资源关闭
        preparedStatement.close();
        conn.close();
    }

    /**
     * 删
     */
    @Test
    public void testDelete() throws Exception {
        //注册驱动，可省略
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        String url = "jdbc:mysql:///jdbc_demo";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        //获取执行statement
        String sql = "delete from account where id = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setLong(1, 1);
        //处理结果
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        //资源关闭
        preparedStatement.close();
        conn.close();
    }

    /**
     * 改
     */
    @Test
    public void testUpdate() throws Exception {
        //注册驱动，可省略
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        String url = "jdbc:mysql:///jdbc_demo";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        //获取执行statement
        String sql = "update account set money = ? where id = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setDouble(1, 2222.22);
        preparedStatement.setLong(2, 2);
        //处理结果
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        //资源关闭
        preparedStatement.close();
        conn.close();
    }

    /**
     * 查
     */
    @Test
    public void testRead() throws Exception {
        //注册驱动，可省略
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取连接
        String url = "jdbc:mysql:///jdbc_demo";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        //获取执行statement
        String sql = "select * from account where id = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setLong(1, 2);
        //处理结果
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            System.out.println("id: " + rs.getInt(1));
            System.out.println("姓名: " + rs.getString(2));
            System.out.println("money: " + rs.getDouble(3));
        }
        //资源关闭
        preparedStatement.close();
        conn.close();
    }
}
