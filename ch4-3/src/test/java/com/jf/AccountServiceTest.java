package com.jf;

import com.jf.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-09 22:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/applicationContext.xml")
public class AccountServiceTest {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testAddByEntity(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "随便来个");
        map.put("money", 222.22);
        int affectRows = accountService.addByMap(map);
        System.out.println(affectRows);
    }
}
