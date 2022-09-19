package com.jf.service.impl;

import com.jf.dao.AccountMapper;
import com.jf.po.Account;
import com.jf.service.IAccountService;

public class AccountService implements IAccountService {

    private AccountMapper accountMapper;

    public AccountService(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    public void save(Account account) {
        accountMapper.save(account);
    }

    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }
}
