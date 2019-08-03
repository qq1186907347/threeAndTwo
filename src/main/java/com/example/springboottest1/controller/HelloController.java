package com.example.springboottest1.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这部分是最开始创建项目时，为了测试项目能否正常运行写的一个测试
 *
 * 访问http://localhost:8080/hello/springboot     可在页面看见：HelloWord
 *
 * */

@Controller
@RequestMapping(value = {"/hello"})
public class HelloController {

    @RequestMapping(value = {"/springboot"})
    public String hello(Map<String, Object> map, Model model){
        model.addAttribute("say","欢迎欢迎,热烈欢迎");
        map.put("hello", "欢迎进入HTML页面");
        return "HelloWord";
    }
}
