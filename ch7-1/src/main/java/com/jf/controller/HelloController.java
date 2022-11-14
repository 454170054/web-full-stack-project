package com.jf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-17 22:54
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model){
        System.out.println("hello请求被多次拦截!");
        model.addAttribute("msg", "hello请求被多次拦截");
        return "index.jsp";
    }

    @RequestMapping("/hello1")
    public String hello1(Model model){
        System.out.println("hello1请求未被MyInterceptor拦截!");
        model.addAttribute("msg", "hello1请求仅被UserInterceptor拦截!");
        return "index.jsp";
    }
}
