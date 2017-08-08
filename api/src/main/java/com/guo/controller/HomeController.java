package com.guo.controller;

import com.guo.model.User;
import com.guo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/7/13.
 */
@Controller
public class HomeController {
    @Autowired
    UserService userService;
    @RequestMapping("/get")
    public String home() {
        User user=userService.get("Jim");
        if(user!=null){
            String a=user.getMail();
        }
        return "home";
    }

    @RequestMapping("/set")
    public String insert() {
        User user=new User();
        user.setUserid("guo");
        user.setPassword("aaa");
        userService.saveUser(user);
        User u=userService.getUser("guo");
        u.setPassword("bbb");
        return "home";
    }

    @RequestMapping("/list")
    public String list() {

        userService.saveUserList();
       userService.getUserList();
        return "home";
    }


}
