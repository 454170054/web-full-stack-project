package com.jf;

import com.jf.po.Account;
import com.jf.service.IAccountService;
import com.jf.service.impl.AccountService;
import org.junit.Test;

public class AccountServiceTest {

    @Test
    public void testSave(){
        IAccountService accountService = new AccountService();
        Account account = new Account();
        account.setId("1");
        account.setName("小明");
        accountService.save(account);
    }
}
