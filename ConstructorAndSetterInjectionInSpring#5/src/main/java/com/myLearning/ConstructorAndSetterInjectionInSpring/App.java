package com.myLearning.ConstructorAndSetterInjectionInSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

       Dev obj1 = (Dev)context.getBean("dev1");
       Dev obj2 = (Dev)context.getBean("dev2");
     
       System.out.println("From dev1:"+obj1.getAge());
       System.out.println("From dev2:"+obj2.getAge());
       System.out.println("From dev2:"+obj2.getSalary());
       
       obj1.build();
      
    }
}
