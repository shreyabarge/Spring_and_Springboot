package com.myLearning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RestController is used because we want to return data, not a view page
public class LoginController {

    @RequestMapping("/login")
    // Maps "/login" URL to this method
    // Reason: Executes this method when user calls "/login"
    public String login() {
        return "Login Page";
    }
}

