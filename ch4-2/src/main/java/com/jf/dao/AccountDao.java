package com.jf.dao;

import com.jf.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-09 20:15
 */
@Repository
public class AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 查询语句
     * queryForObject(String sql, Object[] args, Class<T> requiredType)
     * sql:执行的sql语句
     * args：参数数组
     * requiredType返回的对象类型
     * @param id
     * @return
     */
    public String findNameById(int id){
        String sql = "select name from account where id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, String.class);
    }

    /**
     * execute执行ddl语句
     */
    public void executeTest(){
        String sql = "create table temp(id int, name varchar(100))";
        jdbcTemplate.execute(sql);
    }
    /**
     * 增
     */
    public int updateInsert(Account account){
        String sql = "insert into account(name, money) values(?, ?)";
        return jdbcTemplate.update(sql, new Object[]{account.getName(), account.getMoney()});
    }

    /**
     * 改
     * @param id
     */
    public void updateEdit(String id){
        String sql = "update account set name = '小明' where id = ?";
        jdbcTemplate.update(sql, new Object[]{id});
    }

    /**
     * 删
     */
    public void updateDelete(){
        String sql = "delete from account where id = ?";
        jdbcTemplate.update(sql, new Object[]{3});
    }

    /**
     * 查-queryForObject(String sql, Class<T> requiredType)
     */
    public int totalCount(){
        String sql = "select count(*) from account";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    /**
     * 查-queryForList()方法
     * 返回多条记录，以list的形式
     */
    public List<Map<String, Object>> findAll(){
        String sql = "select * from account";
        return jdbcTemplate.queryForList(sql);
    }

    public Map<String, Object> findOne(){
        String sql = "select * from account limit 1";
        return jdbcTemplate.queryForMap(sql);
    }
}
