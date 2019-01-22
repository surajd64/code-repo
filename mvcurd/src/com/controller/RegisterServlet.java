package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iservice.iEmployeeService;
import com.module.Employee;
import com.serviceimpl.EmployeeServiceImpl;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{

	Employee emp = new Employee();

@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
emp.setName(req.getParameter("name"));

emp.setEmail(req.getParameter("email"));

emp.setAdress(req.getParameter("adress"));

emp.setGender(req.getParameter("gender"));

emp.setHobbies(req.getParameter("hobby"));

emp.setOccupation(req.getParameter("job"));

System.out.println("hello");
iEmployeeService ies=new EmployeeServiceImpl();

int i=ies.addEmployee(emp);

if(i!=0)
{
	req.getRequestDispatcher("index.jsp").forward(req, res);
}
}



}
