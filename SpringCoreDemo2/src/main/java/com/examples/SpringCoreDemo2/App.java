package com.examples.SpringCoreDemo2;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import examples.DrawingApp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource=new ClassPathResource("springs.xml");
        BeanFactory bf=new XmlBeanFactory(resource);
        
        DrawingApp obj=bf.getBean("obj1", DrawingApp.class);
        obj.letsDraw();
    }
}
