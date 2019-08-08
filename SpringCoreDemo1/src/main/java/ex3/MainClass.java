package ex3;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("ex3/ex3.xml");
	
		/*Department stud=(Department)context.getBean("dept");
		System.out.println(stud);*/
		
		
		Employee emp1=context.getBean("emp1",Employee.class);
		emp1.setEmployeeName("ABC");
		System.out.println(emp1);
		
		Employee emp2=context.getBean("emp1",Employee.class);
		System.out.println(emp2);
	}

}
