package ex3;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	
	/*public Employee(){
		System.out.println("I m no-arg constructor of Employee class");
	}*/
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + "]";
	}
	
	
	
	
}
