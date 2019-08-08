package ex3;

import java.util.Set;

public class Department {
	
	private String departmentId;
	private String departmentName;
	private Set<Employee> employees;
	
	public Department(String departmentId,String departmentName,Set<Employee> employees){
		this.departmentId=departmentId;
		this.departmentName=departmentName;
		this.employees=employees;
		
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName="
				+ departmentName + ", employees=" + employees + "]";
	}

	
	
}
