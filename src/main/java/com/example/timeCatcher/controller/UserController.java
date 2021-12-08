package com.example.timeCatcher.controller;

import com.example.timeCatcher.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @GetMapping({"/login"})
    public ModelAndView showLogin() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("login");
        return mav;
    }
}
