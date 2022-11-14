package com.jf.service.impl;

import com.jf.dao.AccountDao;
import com.jf.pojo.Account;
import com.jf.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-09 22:35
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountDao accountDao;

    public int addByMap(Map<String, Object> map) {
        return accountDao.addByMap(map);
    }

    public int addByEntity(Account account) {
        return accountDao.addByEntity(account);
    }
}
