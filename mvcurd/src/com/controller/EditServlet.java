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

@WebServlet("/edit")
public class EditServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	iEmployeeService ies=new EmployeeServiceImpl();
	
	ResultSet rs=ies.getResultSet();
	
	
	try {
		while(rs.next())
		{
			Employee emp=new Employee();
			
		
			emp.setId(	Integer.parseInt(req.getParameter("radio")));
			emp.setName(rs.getString(2));
			emp.setEmail(rs.getString(3));
			emp.setAdress(rs.getString(4));
			emp.setGender(rs.getString(5));
			emp.setHobbies(rs.getString(6));
			emp.setOccupation(rs.getString(7));
				
			req.setAttribute("data",emp);
		
		
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	req.getRequestDispatcher("edit.jsp").forward(req, res);

		}



}
