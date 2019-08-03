package com.iris.practice;

import com.iris.daos.PersonDao;
import com.iris.daos.PersonDaoImpl;
import com.iris.models.Person;

public class App 
{
    public static void main( String[] args )
    {
    	Person p=new Person();
    	//p.setId(101);
    	p.setName("Ragini");
    	p.setAge(21);
    	
    	PersonDao daoObj=new PersonDaoImpl();
    	boolean r=daoObj.addPerson(p);
    	if(r){
    		System.out.println("Person added");
    	}
    	else {
    		System.out.println("Person not added");
    	}
    	
    }
}
