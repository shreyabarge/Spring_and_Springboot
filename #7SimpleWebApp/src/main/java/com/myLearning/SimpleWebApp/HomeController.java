package com.myLearning.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

  @RestController
 // @Controller
public class HomeController {
	
	  @RequestMapping("/")
	 // @ResponseBody
      public String greet() {
    	  return "Welcome...let's start Learning";
      }
	  
	  @RequestMapping("/about")
	  public String about() {
		  
		return "I learn by understand concept but slowly.."; 
	  }
	  
	  
}
