package com.jf.dao;

import org.junit.Test;

import java.sql.*;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-07 19:51
 */
public class AccountDao {

    public static void main(String[] args) throws SQLException {
        AccountDao studnetDao = new AccountDao();
        studnetDao.addAccount();
    }

    @Test
    public void addAccount() {
        String url = "jdbc:mysql:///jdbc_demo";
        String userName = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            //关闭自动提交，开启事务
            connection.setAutoCommit(false);
            String sql1 = "insert into account(name, money) values('小明', 1111)";
            String sql2 = "insert into account(name, money) values('小红', 121111)";
            Statement statement = connection.createStatement();
            try {
                statement.executeUpdate(sql1);
                statement.executeUpdate(sql2);
                connection.commit();
                System.out.println("添加成功");
            } catch (Exception e) {
                System.out.println("添加失败");
                connection.rollback();
                e.printStackTrace();
            }
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != connection) {
                try {
                    connection.close();
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        }
    }

    @Test
    public void updateAccount(){
        String url = "jdbc:mysql:///jdbc_demo";
        String userName = "root";
        String password = "root";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
            String sql1 = "drop database jdbc_demo2";
            Statement statement = connection.createStatement();
            try {
                //执行ddl成功可能也会返回0
                int i = statement.executeUpdate(sql1);
                System.out.println(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != connection) {
                try {
                    connection.close();
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        }
    }
}
