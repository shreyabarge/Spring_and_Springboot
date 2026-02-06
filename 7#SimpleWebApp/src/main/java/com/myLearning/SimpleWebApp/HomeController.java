package com.myLearning.SimpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RestController is used to create REST APIs
// Reason: It returns data directly to the browser (no view page)
// Combines @Controller + @ResponseBody
public class HomeController {

    @RequestMapping("/")
    // @RequestMapping maps the URL "/" to this method
    // Reason: When user opens "/", this method is executed
    public String greet() {
        return "Welcome...let's start Learning";
    }

    @RequestMapping("/about")
    // Maps "/about" URL to this method
    // Reason: Executes this method when "/about" is called
    public String about() {
        return "I learn by understand concept but slowly..";
    }
}
