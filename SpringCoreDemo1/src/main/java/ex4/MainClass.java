package ex4;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("springs.xml");
	
		Car car=(Car)context.getBean("carObj");
		System.out.println(car);
		
		
	}

}
