package com.jf.service.impl;

import com.jf.dao.AccountDao;
import com.jf.pojo.Account;
import com.jf.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-10 22:26
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountDao accountDao;
    public List<Account> queryUsers() {
        return accountDao.queryUsers();
    }
}
