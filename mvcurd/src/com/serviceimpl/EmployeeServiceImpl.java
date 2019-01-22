package com.serviceimpl;

import java.sql.ResultSet;

import com.daoimpl.EmployeedaoImpl;
import com.idao.iEmployeeDao;
import com.iservice.iEmployeeService;
import com.module.Employee;

public class EmployeeServiceImpl implements iEmployeeService{

	@Override
	public Integer addEmployee(Employee emp) {
	
		iEmployeeDao dao = new EmployeedaoImpl();
	
	return 	dao.addEmployee(emp);
	
	}

	@Override
	public ResultSet getResultSet() {
	
	iEmployeeDao ied=new EmployeedaoImpl();
	
return ied.getResultSet();
	}

	@Override
	public Integer deleteEmployee(Employee emp) {

	iEmployeeDao ied=new EmployeedaoImpl();
	
	return ied.deleteEmployee(emp);
	
	}

	@Override
	public Integer updateEmployee(Employee emp) {
		iEmployeeDao ied=new EmployeedaoImpl();
		
		return ied.updateEmployee(emp);
	
		
	
	}

	
	
	
	
}
