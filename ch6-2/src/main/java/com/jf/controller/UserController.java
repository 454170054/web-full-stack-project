package com.jf.controller;

import com.jf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-16 18:27
 */
@Controller
public class UserController {

    //返回ModelAndView对象
    @RequestMapping(value = "/userList")
    public ModelAndView userList(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<User> users = null;
        if(null != session.getAttribute("users")){
            users = (List<User>)session.getAttribute("users");
        }else {
            users = new ArrayList<User>();
            User user = new User("小明", 11, 1);
            users.add(user);
            User user1 = new User("小王", 11, 2);
            users.add(user1);
        }
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("users", users);
        return new ModelAndView("/WEB-INF/views/userList.jsp", model);
    }

    //返回String类型
    @RequestMapping(value = "/updateView", method = RequestMethod.GET)
    public String updateView() {
        return "/WEB-INF/views/userEdit.jsp";
    }

    //返回String类型（使用Model对象返回页面需要的值）
    @RequestMapping(value = "/updateUserView", method = RequestMethod.GET)
    public String updateUserView(Model model) {
        User user = new User("小明", 11, 1);
        model.addAttribute("user", user);
        return "/WEB-INF/views/userEdit.jsp";
    }

    //转发和重定向
    @RequestMapping("/update")
    public String update(String name, int age, HttpServletRequest request){
        ArrayList<User> users = new ArrayList<User>();
        User user = new User(name, age, 5);
        users.add(user);
        HttpSession session = request.getSession();
        session.setAttribute("users", users);
//        return "forward:userList";
        return "redirect:userList";
    }


    //返回ModelAndView对象
    @RequestMapping(value = "/userList2")
    public ModelAndView userList2(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<User> users = null;
        if(null != session.getAttribute("users")){
            users = (List<User>)session.getAttribute("users");
        }else {
            users = new ArrayList<User>();
            User user = new User("小明", 11, 1);
            users.add(user);
            User user1 = new User("小王", 11, 2);
            users.add(user1);
        }
        HashMap<String, Object> model = new HashMap<String, Object>();
        model.put("users", users);
        return new ModelAndView("userList", model);
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public User test(){
        User user = new User("aaa", 11, 1);
        return user;
    }
}
