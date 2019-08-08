package tableperclass;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.examples.providers.SessionFactoryProvider;

public class TestClass {

	public static void main(String[] args) {

		PermanentEmployee emp1=new PermanentEmployee();
		emp1.setEmployeeName("Sagar");
		emp1.setSalary(55000);
		
		
		ContractualEmployee emp2=new ContractualEmployee();
		emp2.setEmployeeName("Bikash");
		emp2.setNoOfDays(25);
		emp2.setRatePerDay(20000);
		
		Session session=SessionFactoryProvider.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		tx.commit();
		session.close();
		
	}

}
