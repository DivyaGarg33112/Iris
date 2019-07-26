package com.portal.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public boolean validate(int empid, String password) {
		try (Connection conn=ConnectionProvider.getDBConnection();){
		PreparedStatement ps=conn.prepareStatement("select * from LoginTab where EId=? and Password=?");
		ps.setInt(1,empid);
		ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			return true;
		}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
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
		// TODO Auto-generated method stub
		return null;
	}

}
