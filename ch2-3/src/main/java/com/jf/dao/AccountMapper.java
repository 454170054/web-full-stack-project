package com.jf.dao;

import com.jf.po.Account;

public class AccountMapper {

    public void save(Account account){
        System.out.println("正在保存: " + account);
    }
}
