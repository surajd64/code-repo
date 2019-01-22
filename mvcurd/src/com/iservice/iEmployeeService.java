package com.iservice;

import java.sql.ResultSet;

import com.daoimpl.EmployeedaoImpl;
import com.idao.iEmployeeDao;
import com.module.Employee;

public interface iEmployeeService {

	public Integer addEmployee(Employee emp);

	public ResultSet getResultSet();
	
	public Integer deleteEmployee(Employee emp);

	public Integer updateEmployee(Employee emp);

}
