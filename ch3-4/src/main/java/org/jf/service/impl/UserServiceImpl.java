package org.jf.service.impl;

import org.jf.dao.UserMapper;
import org.jf.pojo.po.User;
import org.jf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public void save(User user) {
        userMapper.save(user);
    }
}
