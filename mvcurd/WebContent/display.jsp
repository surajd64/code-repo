<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.cjc.module.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display page</title>

<script type="text/javascript">
function register() {
	
	document.fn.action="register.jsp";
	document.fn.submit();
}

function deletedata() {
	
	document.fn.action="delete";
	document.fn.submit();
}

function editdata() {
	
	document.fn.action="edit";
	document.fn.submit();
}

</script>


</head>
<%List<Employee> list=(List)request.getAttribute("data");%>
<body>
<form name="fn">
<center>
<h2 style="font-size:400 px;font-style:italic;color:gray;   ">Employee details</h2>
<br>
<br>
<br>
<table border="2 px" >
<tr><th>id</th><th>name</th><th>email</th><th>adress</th><th>gender</th><th>hobby</th><th>job</th></tr>
<% 
for(Employee emp:list)
{ %>
<tr><th><input type="radio" name="radio" value="<%=emp.getId()%>"></th><th><%=emp.getName()%></th><th><%=emp.getEmail()%></th><th><%=emp.getAdress()%></th><th><%=emp.getGender()%></th><th><%=emp.getHobbies()%></th><th><%=emp.getOccupation()%></th></tr>	



<% }

%>

</table>
<br>
<br>

<input type="button" value="register" onclick="register()">
<br>
<br>

<input type="button" value="delete" onclick="deletedata()">
<br>
<br>

<input type="button" value="edit" onclick="editdata()">


</center>

</form>
</body>
</html>