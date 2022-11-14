package com.jf.Service.impl;

import com.jf.Service.IAccountService;
import com.jf.dao.AccountDao;
import com.jf.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-09 22:06
 */
@Service
public class AccountService implements IAccountService {

    @Autowired
    private AccountDao accountDao;

    public String findNameById(int id) {
        return accountDao.findNameById(id);
    }

    public void executeTest() {
        accountDao.executeTest();
    }

    public int updateInsert(Account account) {
        return accountDao.updateInsert(account);
    }

    public void updateEdit(String id) {
        accountDao.updateEdit(id);
    }

    public void updateDelete() {
        accountDao.updateDelete();
    }

    public int totalCount() {
        return accountDao.totalCount();
    }

    public List<Map<String, Object>> findAll() {
        return accountDao.findAll();
    }

    public Map<String, Object> findOne() {
        return accountDao.findOne();
    }
}
