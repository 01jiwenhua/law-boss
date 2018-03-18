package com.shx.lawboss.controller;

import com.shx.lawboss.dao.entity.User;
import com.shx.lawboss.service.UserService;
import com.shx.lawboss.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping({ "/", "" })
    String welcome(Model model) {

        return "redirect:/login";
    }

    @GetMapping("/login")
    String login() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    R ajaxLogin(String username, String password) {
        User user=userService.getUserByName(username);
        if(user!=null){
            if(user.getLoginPassword().equals(password)){
                return R.ok();
            }else{
                return R.error("用户或密码错误");
            }
        }
        return R.error("用户或密码错误");
    }


}