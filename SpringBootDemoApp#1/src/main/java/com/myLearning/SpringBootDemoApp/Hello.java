package com.myLearning.SpringBootDemoApp;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/")
    public String greet() {
    	return "Hello !...Welcome to our page and let's starts learning.";
    }
	
	
}
