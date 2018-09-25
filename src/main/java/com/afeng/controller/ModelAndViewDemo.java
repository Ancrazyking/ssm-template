package com.afeng.controller;

import com.afeng.pojo.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author afeng
 * @date 2018/9/25 20:25
 **/
@Controller
@RequestMapping("/role")
public class ModelAndViewDemo
{
    /**
     * 通过url访问show.do,跳转模型视图role.jsp
     * @return
     */
    @RequestMapping("/show")
    public ModelAndView show()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/role.jsp");
        Role role = new Role();
        role.setId(1);
        role.setRolename("导演");
        role.setNote("潜规则");
        modelAndView.addObject("role", role);
        return modelAndView;
    }


}
