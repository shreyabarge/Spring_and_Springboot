package com.myLearning.spring.xml.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create object for mention class in bean i.e in xml file
        Dev obj1 =  (Dev)context.getBean("dev1"); //we can use id in get bean instead class name but have to done casting to its class name otherwise will get error
        obj1.build();
         
        Laptop obj = context.getBean(Laptop.class);
        obj.compile();
        
    }
}
