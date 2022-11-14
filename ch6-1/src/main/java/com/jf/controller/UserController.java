package com.jf.controller;

import com.jf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-16 13:49
 */
@Controller
public class UserController {

    @RequestMapping(value = "/add1")
    public ModelAndView userAdd1(HttpServletRequest request) {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println(username);
        System.out.println(age);
        System.out.println(hobbies);
        return new ModelAndView("/static/views/success.html");
    }

    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public ModelAndView userAdd2(String name, int age, String[] hobby){
        System.out.println(name);
        System.out.println(age);
        System.out.println(Arrays.toString(hobby));
        return new ModelAndView("/static/views/success.html");
    }

    @RequestMapping(value = "/add3", method = RequestMethod.GET)
    public ModelAndView userAdd3(@RequestParam("name") String username,
                                 @RequestParam("age") String age,
                                 @RequestParam("hobby") String[] hobbies){
        System.out.println(username);
        System.out.println(age);
        System.out.println(Arrays.toString(hobbies));
        return new ModelAndView("/static/views/success.html");
    }

    @RequestMapping(value = "/add4", method = RequestMethod.GET)
    public ModelAndView userAdd4(User user){
        System.out.println(user);
        return new ModelAndView("/static/views/success.html");
    }
}



