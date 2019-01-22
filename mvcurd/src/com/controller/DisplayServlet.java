package com.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iservice.iEmployeeService;
import com.module.Employee;
import com.serviceimpl.EmployeeServiceImpl;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	iEmployeeService ies=new EmployeeServiceImpl();
	
	ResultSet rs=ies.getResultSet();
	
	List<Employee> list = new ArrayList();
	
	try {
		while(rs.next())
		{
			Employee emp=new Employee();
			
			int id=Integer.parseInt(rs.getString(1));
					emp.setId(id);
			emp.setName(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setAdress(rs.getString(4));
			emp.setGender(rs.getString(5));
			emp.setHobbies(rs.getString(6));
			emp.setOccupation(rs.getString(7));
				
			list.add(emp);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	req.setAttribute("data",list);
	req.getRequestDispatcher("display.jsp").forward(req, res);
	}
	
}
