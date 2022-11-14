package com.jf.controller;

import com.jf.pojo.Account;
import com.jf.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-10 22:18
 */
@Controller
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "/accounts")
    public ModelAndView userList(){
        List<Account> list = accountService.queryUsers();
        Map<String, Object> model = new HashMap<>();
        model.put("list", list);
        //为ModelAndView对象指定相应页面，并绑定相应数据
        return new ModelAndView("/WEB-INF/views/account.jsp", model);
    }
}
