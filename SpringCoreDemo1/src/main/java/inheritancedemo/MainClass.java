package inheritancedemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springs.xml");
	
		/*Message obj=(Message)context.getBean("obj1");
		System.out.println(obj);
		
		obj=(Message)context.getBean("obj2");
		System.out.println(obj);
		*/
		Message obj=(Message)context.getBean("obj3");
		System.out.println(obj);
		
		context.close();
		
	}

}
