package org.jf.controller;

import org.jf.pojo.po.User;
import org.jf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    public void save(){
        User user = new User();
        userService.save(user);
    }
}
