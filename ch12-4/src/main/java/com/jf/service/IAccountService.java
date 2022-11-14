package com.jf.service;

import com.jf.pojo.Account;

import java.util.List;

public interface IAccountService {

    void updateByTx();

    void NoupdateByNoTx();

    List<Account> findAllAccounts();
}
