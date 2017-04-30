package com.polytech.controllers;

import com.polytech.business.models.Users;
import com.polytech.business.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by E.Marouane on 26/03/2017.
 */

@Controller
public class SignUpController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/signup")
    public String signUpPage(){
        return "signup";
    }

    @RequestMapping(value = "/dosignup")
    public String signUp(Users users){
        users.setEnabled(true);
        userService.save(users);
        return "redirect:/login";
    }






}
