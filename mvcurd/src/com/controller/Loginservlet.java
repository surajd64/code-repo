package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/log")
public class Loginservlet extends HttpServlet{


@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

String uname=req.getParameter("uname");
System.Out.println(usrnm);
String pass=req.getParameter("pass");
System.Out.println(pass);
if(uname.equals("admin")&&pass.equals("admin"))
{
	req.getRequestDispatcher("display").forward(req, res);
}
else
{
	req.setAttribute("data","invalid username and password");
	req.getRequestDispatcher("index.jsp").forward(req, res);
	
}
}


}
