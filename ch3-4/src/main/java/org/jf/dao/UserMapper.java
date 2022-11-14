package org.jf.dao;

import org.jf.pojo.po.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {

        public void save(User user){
                System.out.println("正在保存: " + user);
        }

}
