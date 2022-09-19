package com.jf.service.impl;

import com.jf.dao.AccountMapper;
import com.jf.po.Account;
import com.jf.service.IAccountService;

public class AccountService implements IAccountService {

    public void save(Account account) {
        AccountMapper accountMapper = new AccountMapper();
        accountMapper.save(account);
    }
}
