package com.portal.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.portal.daos.EmployeeDao;
import com.portal.entities.Employee;
import com.portal.utility.ConnectionProvider;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public boolean register(Employee emp) {
		try (
		Connection conn=ConnectionProvider.getDBConnection();
		){
		PreparedStatement ps=conn.prepareStatement("insert into EmployeeTab values(emptabseq.nextval,?,?,?,?,?)");
		ps.setString(1,emp.getEmployeeName());
		ps.setString(2,emp.getGender());
		ps.setString(3,emp.getQualification());
		ps.setString(4,emp.getContactNo());
		ps.setString(5,emp.getEmailAddress());
		
		int i=ps.executeUpdate();
		if(i!=0){
			ps=conn.prepareStatement("insert into LoginTab values(emptabseq.currval,?,'Employee')");
			ps.setString(1,emp.getPassword());
			ps.executeUpdate();
			return true;
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee validate(int empid, String password) {
		
		System.out.println("I m validate");
		try (Connection conn=ConnectionProvider.getDBConnection();){
		PreparedStatement ps=conn.prepareStatement("select EId,EName,Gender,Qualification,ContactNo,Email,Role from EmployeeTab join LoginTab using(EId) where EId=? and Password=?");
		ps.setInt(1,empid);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			System.out.println("I m in if : "+rs.getString(2));
			
			//if user is valid
			String name=rs.getString(2);
			String gender=rs.getString(3);
			String q=rs.getString(4);
			String contactNo=rs.getString(5);
			String email=rs.getString(6);
			String role=rs.getString(7);
			
			Employee emp=new Employee();
			emp.setEmployeeId(empid);
			emp.setEmployeeName(name);
			emp.setGender(gender);
			emp.setEmailAddress(email);
			emp.setQualification(q);
			emp.setContactNo(contactNo);
			emp.setRole(role);
			
			return emp;
			
			
		}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> eList=new ArrayList<>();
		
		try (Connection conn=ConnectionProvider.getDBConnection();){
			PreparedStatement ps=conn.prepareStatement("select EId,EName,Gender,Qualification,ContactNo,Email,Role from EmployeeTab join LoginTab using(EId)");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				//if user is valid
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String q=rs.getString(4);
				String contactNo=rs.getString(5);
				String email=rs.getString(6);
				String role=rs.getString(7);
				
				Employee emp=new Employee();
				emp.setEmployeeId(rs.getInt(1));
				emp.setEmployeeName(name);
				emp.setGender(gender);
				emp.setEmailAddress(email);
				emp.setQualification(q);
				emp.setContactNo(contactNo);
				emp.setRole(role);
				
				eList.add(emp);
				
				
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return eList;

	}

}












