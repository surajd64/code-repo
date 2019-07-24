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

@WebServlet("/delete1")
public class DeleteServlet extends HttpServlet{
Integer i;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	Employee emp2=new Employee();
	emp2.setId(Integer.parseInt(req.getParameter("radio")));
		iEmployeeService ies=new EmployeeServiceImpl();
		i=ies.deleteEmployee(emp2);
	

if(i!=0)
{
ResultSet rs=ies.getResultSet();
	
	List<Employee> list = new ArrayList();
	
	try {
		while(rs.next())
		{
			Employee emp=new Employee();
			emp.setId(Integer.parseInt(rs.getString(1)));
//			emp.setName(rs.getString(2));
			System.out.println(emp.getName());
			emp.setEmail(rs.getString(3));
			emp.setAdress(rs.getString(4));
			emp.setGender(rs.getString(5));
			emp.setHobbies(rs.getString(6));
			emp.setOccupation(rs.getString(7));
				
			list.add(emp);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.Out.println(e.printStackTrace());
	}
	req.setAttribute("data",list);
	req.getRequestDispatcher("display.jsp").forward(req, res);

}
else
{
	req.getRequestDispatcher("error.jsp").forward(req, res);
}
	
}
}
