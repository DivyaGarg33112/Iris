package com.examples.SpringCoreDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springs.xml");
        Laptop obj1=context.getBean("lapObj1",Laptop.class);
        obj1.printLaptopDetails();
        
        
        Laptop obj2=context.getBean("lapObj2",Laptop.class);
        obj2.printLaptopDetails();
    }
}
