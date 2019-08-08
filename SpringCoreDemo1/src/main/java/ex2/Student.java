package ex2;

import java.util.List;

public class Student {
	
	private int studentId;
	private String studentName;
	private List<String> coursesStudied;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setCoursesStudied(List<String> coursesStudied) {
		this.coursesStudied = coursesStudied;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", coursesStudied=" + coursesStudied + "]";
	}
	
	
	
}
