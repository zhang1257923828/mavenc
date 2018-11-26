package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/selectAll")
    public String selectAll(Map map){
       List<User> list= userService.selectAll();
       map.put("list",list);
        return "index";
    }

    @RequestMapping("/add")
    public String add(User user){
        userService.insert(user);
        return "redirect:selectAll.do";
    }
    @RequestMapping("/delete")

    public String delete(int id){
        userService.delete(id);
        return "redirect:selectAll.do";
    }
    @RequestMapping("/deleteMany")
    public String deleteMany(int[] ids){
        userService.deleteMany(ids);
        return "redirect:selectAll.do";
    }
    @RequestMapping("selectOne")
    public String SelectOne(int id,Map map){
       User user= userService.selectOne(id);
       map.put("user",user);
        return "update";
    }
    @RequestMapping("/update")
    public String update(User user){
        System.out.println(user);
        userService.update(user);

        return "redirect:selectAll.do";
    }
}
