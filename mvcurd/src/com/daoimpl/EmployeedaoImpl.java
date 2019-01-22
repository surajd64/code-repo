package com.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.idao.iEmployeeDao;
import com.module.Employee;
import com.utility.Connectivity;

public class EmployeedaoImpl implements iEmployeeDao{
	ResultSet rs;

	
	public Integer addEmployee(Employee emp)
	{
		 Integer i=0;

		
		try {
			String sql="insert into employee(id,name,email,adress,gender,hobby,job) values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getEmail()+"','"+emp.getAdress()+"','"+emp.getGender()+"','"+emp.getHobbies()+"','"+emp.getOccupation()+"')";

			i=Connectivity.runquery(sql);
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public ResultSet getResultSet() {
	String sql="select * from test2.employee ";	
	
	try {
		rs=Connectivity.getresultset(sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return rs;
	}

	@Override
	public Integer deleteEmployee(Employee emp) {
Integer i=0;
	String s="delete from employee where id="+emp.getId()+"";
	
	try {
		i= Connectivity.deletequery(s);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return i;
	
	}

	@Override
	public Integer updateEmployee(Employee emp) {
	Integer i=0;
	String s="update test2.employee set name='"+emp.getName()+"',email='"+emp.getEmail()+"',adress='"+emp.getAdress()+"',gender='"+emp.getGender()+"',hobby='"+emp.getHobbies()+"',job='"+emp.getOccupation()+"'where id="+emp.getId()+"";
	
	try {
		i=Connectivity.updateEmployee(s);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return i;
	
	}

	
	
	
}
