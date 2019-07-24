package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connectivity {

	private static Connection con;

	private static final String driver="com.mysql.jdbc.Driver";
	
	private static final String connect="jdbc:mysql://localhost:3306/test1";
	
	private static final String user="root";

	private static final String pass="root";
	


public static Connection loaddriver()
{
	try {
		Class.forName(driver);
	con=DriverManager.getConnection(connect,user,pass);
	
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return con;
}

public static ResultSet getresultset(String query) throws SQLException
{
	ResultSet rs;
	Connection con=loaddriver();

	PreparedStatement ps=con.prepareStatement(query);
rs=ps.executeQuery();
return rs;






}








public static Integer runquery(String query) throws SQLException

{
	Connection con=loaddriver();
	PreparedStatement ps=con.prepareStatement(query);
	Integer i=ps.executeUpdate();

return i;

}

public static Integer deletequery(String query) throws SQLException

{
	Connection con=loaddriver();
	PreparedStatement ps=con.prepareStatement(query);
	Integer i=ps.executeUpdate();

return i;

}

public static Integer updateEmployee(String query) throws SQLException
{
	Connection con=loaddriver();
PreparedStatement ps=con.prepareStatement(query);
Integer i=ps.executeUpdate();

return i;
}


}
