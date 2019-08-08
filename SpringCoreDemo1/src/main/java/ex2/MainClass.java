package ex2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("springs.xml");
		Student stud=(Student)context.getBean("studObj1");
		System.out.println(stud);
	}

}
