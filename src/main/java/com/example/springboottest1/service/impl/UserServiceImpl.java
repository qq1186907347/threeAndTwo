package com.example.springboottest1.service.impl;

import java.util.List;

import com.example.springboottest1.entity.User;
import com.example.springboottest1.mapper.UserMapper;
import com.example.springboottest1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserMapper usermapper;

    @Autowired
    public UserServiceImpl(UserMapper usermapper) {
        this.usermapper = usermapper;
    }


    @Override
    public User userLogin(String username, String password) {
        return usermapper.userlogin(username, password);
    }

    @Override
    public int adduser(User user) {
        //对应sql语句中的第一种注册方式
        return usermapper.adduser(user);
    }

    /**
     * 获取所有用户信息
     *
     * @return 用户信息
     */
    @Override
    public List<User> queryAllUser() {
        return usermapper.queryAllUser();
    }


}
