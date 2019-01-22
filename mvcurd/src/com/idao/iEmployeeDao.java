package com.idao;

import java.sql.ResultSet;

import com.module.Employee;

public interface iEmployeeDao {

	public Integer addEmployee(Employee emp);

	public ResultSet getResultSet();

	public Integer deleteEmployee(Employee emp);

	public Integer updateEmployee(Employee emp);

}
