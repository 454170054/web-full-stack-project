package com.jf.dao;

import com.jf.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-09 22:25
 */
@Repository
public class AccountDao {
    @Autowired
    private NamedParameterJdbcTemplate npjt;

    public int addByEntity(Account account) {
        String sql = "insert into account(name, money) values(:name, :money)";
        BeanPropertySqlParameterSource parameterSource = new BeanPropertySqlParameterSource(account);
        return npjt.update(sql, parameterSource);
    }

    public int addByMap(Map<String, Object> map) {
        String sql = "insert into account(name, money) values(:name, :money)";
        return npjt.update(sql, map);
    }

}
