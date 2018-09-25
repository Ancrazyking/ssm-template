package com.afeng.controller;

import com.afeng.pojo.User;
import com.afeng.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author afeng
 * @date 2018/9/25 19:46
 **/
@Controller
//@RequestMapping("/user")
public class UserController
{
    @Resource(name = "userServiceImpl")
    private UserService userService;

    /**
     * 重定向到注册成功页面
     *
     * @param user
     * @return
     */
    @RequestMapping("/register")
    public String userRegister(User user)
    {
        userService.insertUser(user);
        //return "success.html";  不加斜线是在当前类级别下
        return "success.html"; //加斜线则表示是在当前的项目级别下
        //return "forward:/success.html";//请求转发到当前项目的success.html
        //return "redirect:/success.html";//重定向到当前项目的success.html
    }
}
