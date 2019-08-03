package com.example.springboottest1.controller;

import com.example.springboottest1.entity.User;
import com.example.springboottest1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = {"/user"})
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    /*
     * 同时这个时候可以自己了解一下@Controller与@RestController的区别，以及@ResponseBody的用法。
     */

    /**
     * 跳转到用户登录页面
     *
     * @return 登录页面
     */
    @RequestMapping(value = {"/loginHtml"})
    public String loginHtml() {
        return "userLogin";
    }

    /**
     * 跳转到用户注册页面
     *
     * @return 注册页面
     */
    @RequestMapping(value = {"/registerpage"})
    public String registerpage() {
        return "register";
    }

    /**
     * 获取用户名与密码，用户登录
     *
     * @return 登录成功页面
     */
    @ResponseBody
    @RequestMapping(value = {"/userLogin"})
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpServletRequest request) {

        if (StringUtils.isEmpty(username)) {
            return "用户名不能为空";
        }

        if (StringUtils.isEmpty(password)) {
            return "密码不能为空";
        }

        User user = userService.userLogin(username, password);
        //登录成功
        if (user != null) {
            //将用户信息放入session  用于后续的拦截器
            request.getSession().setAttribute("session_user", user);
            return "登录成功";
        }
        return "登录失败，用户名或密码错误";
    }

    /**
     * 注册新用户
     *
     * @return 注册结果
     */
    @ResponseBody
    @RequestMapping(value = {"/register"})
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          @RequestParam("password2") String password2,
                          @RequestParam("age") int age) {

        if (StringUtils.isEmpty(username)) {
            return "用户名不能为空";
        }

        if (StringUtils.isEmpty(password)) {
            return "密码不能为空";
        }

        if (StringUtils.isEmpty(password2)) {
            return "确认密码不能为空";
        }

        if (!password.equals(password2)) {
            return "两次密码不相同，注册失败！！";
        } else {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setAge(age);
            int res = userService.adduser(user);
            if (res == 0) {
                return "注册失败！";
            } else {
                return "注册成功！";
            }
        }

    }

    @RequestMapping(value = {"/list"})
    public  ModelAndView userList() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("users", userService.queryAllUser());
        modelAndView.setViewName("userList.html");
        return  modelAndView;
    }
}
