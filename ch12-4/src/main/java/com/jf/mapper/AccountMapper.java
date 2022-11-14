package com.jf.mapper;

import com.jf.pojo.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountMapper {

    @Select("select * from account")
    List<Account> getAllAccounts();

    @Update("update account set money = money + #{account.money} where id = #{account.id}")
    int updateMoney(@Param("account") Account account);
}
