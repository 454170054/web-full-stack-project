package com.jf.service.impl;

import com.jf.mapper.AccountMapper;
import com.jf.pojo.Account;
import com.jf.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-11-06 19:44
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 使用事务
     */
    public void updateByTx(){
        Account account = new Account();
        account.setId(2L);
        account.setMoney(1000.0);
        accountMapper.updateMoney(account);

        int i = 1 / 0;

        Account account1 = new Account();
        account.setId(3L);
        account.setMoney(-1000.0);
        accountMapper.updateMoney(account1);
    }

    /**
     * 未使用事务
     */
    public void NoupdateByNoTx(){
        Account account = new Account();
        account.setId(2L);
        account.setMoney(1000.0);
        accountMapper.updateMoney(account);

        int i = 1 / 0;

        Account account1 = new Account();
        account.setId(3L);
        account.setMoney(-1000.0);
        accountMapper.updateMoney(account1);
    }

    public List<Account> findAllAccounts() {
        return accountMapper.getAllAccounts();
    }
}
