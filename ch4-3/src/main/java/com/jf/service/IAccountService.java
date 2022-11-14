package com.jf.service;

import com.jf.pojo.Account;

import java.util.Map;

public interface IAccountService {
    int addByMap(Map<String, Object> map);
    int addByEntity(Account account);
}
