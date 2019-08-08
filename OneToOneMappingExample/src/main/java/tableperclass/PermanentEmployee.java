package tableperclass;

import javax.persistence.Entity;

@Entity
public class PermanentEmployee extends Employee{
	
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
