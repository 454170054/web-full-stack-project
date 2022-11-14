package com.jf.controller;

import com.jf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-19 22:24
 */
@Controller
public class LoginController {

    /**
     * 跳转用户登录页面
     */
    @RequestMapping(value = "/loginview")
    public String toLoginView(Model model){
        model.addAttribute("msg", "请先登录");
        return "login";
    }

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login")
    public String login(User user, Model model, HttpSession session) throws UnsupportedEncodingException {
        // 获取用户名和密码
        String username = user.getUsername();
        String password = user.getPassword();
        if(null != username && username.equals("小红") && null != password && password.equals("123")){
            // 重定向到系统模拟主页面
            session.setAttribute("User", user);
            return "redirect:home";
        }
        model.addAttribute("msg", "用户名或密码错误，请重新登录");
        return "login";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:loginview";
    }

    @RequestMapping(value = "/home")
    public String toMain(){
        return "home";
    }
}
