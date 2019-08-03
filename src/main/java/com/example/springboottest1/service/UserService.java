package com.example.springboottest1.service;

import com.example.springboottest1.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public interface UserService {

    //用户登录
    User userLogin(String username,String password);

    //注册新用户
    public int adduser(User user);

    /**
     * 获取所有用户信息
     * @return 用户信息
     */
    public List<User> queryAllUser();
}
