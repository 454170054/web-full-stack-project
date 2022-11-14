package com.jf.controller;

import com.jf.pojo.Account;
import com.jf.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.List;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-11-06 19:43
 */
@Controller
public class AccountController {

    @Autowired
    private IAccountService accountService;

    /**
     * 使用事务
     * @return
     */
    @RequestMapping("updateA")
    public String testUpdateWithTx(){
        try{
            accountService.updateByTx();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "forward:accountList";
    }

    /**
     * 不使用事务
     * @return
     */
    @RequestMapping("updateB")
    public String testUpdateNoTx(){
        try{
            accountService.NoupdateByNoTx();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "forward:accountList";
    }

    /**
     * 查询所有数据
     * @param model
     * @return
     */
    @RequestMapping("accountList")
    public String accountList(Model model){
        List<Account> allAccounts = accountService.findAllAccounts();
        model.addAttribute("accounts", allAccounts);
        return "accountList";
    }
}
