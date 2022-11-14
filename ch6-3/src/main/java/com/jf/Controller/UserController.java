package com.jf.Controller;

import com.jf.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-16 22:03
 */
@RestController
public class UserController {

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public User update(@RequestBody User user){
        System.out.println(user);
        //返回json响应
        return user;
    }
}
