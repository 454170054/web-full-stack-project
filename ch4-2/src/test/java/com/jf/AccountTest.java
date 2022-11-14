package com.jf;

import com.jf.Service.impl.AccountService;
import com.jf.dao.AccountDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-09 21:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/applicationContext.xml"})
public class AccountTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindNameById(){
        String res = accountService.findNameById(3);
        System.out.println(res);
    }
}
