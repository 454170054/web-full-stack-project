package com.jf.dao;

import com.jf.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-10 22:28
 */
@Repository
public class AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Account> queryUsers() {
        String sql = "select * from account";
        // queryForList，返回一个列表，列表中的元素用map表示，每个map代表一条行记录,map中的key是列名，value是值
        List<Map<String, Object>> rs = jdbcTemplate.queryForList(sql);
        List<Account> res = new ArrayList<>();
        for (Map<String, Object> map : rs){
            long id = (Long) map.get("id");
            String name = (String) map.get("name");
            BigDecimal money = (BigDecimal) map.get("money");
            double v = money.doubleValue();
            Account account = new Account();
            account.setId(id);
            account.setName(name);
            account.setMoney(v);
            res.add(account);
        }
        return res;
    }
}
