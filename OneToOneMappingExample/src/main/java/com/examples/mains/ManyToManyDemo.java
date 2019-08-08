package com.examples.mains;

import java.util.HashSet;
import java.util.Set;

import com.examples.dao.StudentDao;
import com.examples.dao.StudentDaoImpl;
import com.examples.models.Course;
import com.examples.models.Student;

public class ManyToManyDemo {

	public static void main(String[] args) {
	
	StudentDao studentDao=new StudentDaoImpl();
	
	Course c1=new Course();
	c1.setCourseName("Java");
	c1.setFees(95000);
	
	Course c2=new Course();
	c2.setCourseName("Python");
	c2.setFees(95000);
	
	Set<Course> courses=new HashSet<>();
	courses.add(c1);
	courses.add(c2);
	
	Student stud=new Student();
	stud.setStudentId(101);
	stud.setStudentName("Nilam");
	stud.setCourses(courses);
	
	studentDao.addStudent(stud);
	
			
	}

}
