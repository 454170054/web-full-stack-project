package com.jf;

import com.jf.po.Account;
import com.jf.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceTest {

    @Test
    public void testSave() {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = (IAccountService)classPathXmlApplicationContext.getBean("accountService");
        Account account = new Account();
        account.setName("2");
        account.setId("11");
        accountService.save(account);
    }
}
