package tableperclass;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.examples.providers.SessionFactoryProvider;

public class TestClass2 {

	public static void main(String[] args) {

		Session session=SessionFactoryProvider.getSessionFactory().openSession();
		
		/*Query<PermanentEmployee> query=session.createQuery("from PermanentEmployee");
		List<PermanentEmployee> employeeList=query.getResultList();
		for(PermanentEmployee emp:employeeList){
			System.out.println("\n"+emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+emp.getSalary());
		}*/
		
		//2. example
		/*Query<String> query=session.createQuery("select employeeName from PermanentEmployee");
		List<String> namesList=query.getResultList();
		for(String str:namesList){
			System.out.println("Welcome : "+str);
		}*/
		
		/*Query<Object[]> query=session.createQuery("select employeeName,salary from PermanentEmployee");
		List<Object[]> objArr=query.getResultList();
		for(Object[] obj:objArr){
			System.out.println(obj[0]+" is having salary "+obj[1]);
		}*/
		
		//Binding Parameters
		/*Query<String> query=session.createQuery("select employeeName from PermanentEmployee where employeeName=:empName");
		query.setParameter("empName","Harry");
		List<String> namesList=query.getResultList();
		for(String str:namesList){
			System.out.println("Welcome : "+str);
		}*/
		
		//Native SQL
		
		NativeQuery<PermanentEmployee> query=session.createSQLQuery("select * from PermanentEmployee");
		query.addEntity(PermanentEmployee.class);
		List<PermanentEmployee> empList=query.getResultList();
		for(PermanentEmployee empObj:empList){
			System.out.println(empObj);
		}
		
		
		session.close();
		
	}

}
