package com.myLearning.AutowiringUsingSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
	
//	Laptop laptop = new Laptop();    
    
	//field injection
	@Autowired    
//	@Qualifier("")
	 private Computer comp;
	
	
	 //Constructor Injection and  Mentioning Autowired Optional
//	@Autowired 
//	public Dev(Laptop laptop) {
//		this.laptop = laptop;
//	}

	
	 //Setter Injection
//	 @Autowired           
//	 public void setLaptop(Laptop laptop) {
//		 this.laptop = laptop;
//	 }
	 
     public void build() {
    	 System.out.println("Working on an awesome project..");
    	 comp.compile();

    	}
     }
