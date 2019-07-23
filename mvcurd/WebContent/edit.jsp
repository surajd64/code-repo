<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.module.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit page</title>
<%Employee e=(Employee)request.getAttribute("data");%>
</head>
<body>
<form action="upd">

<center>
<h2 style="color:gray; ">Registeration form</h2>
<br>
<br>
<input type="text" name="id" value="<%=e.getId()%>">
<br>
<br>

name :-<input type="text" name="name" style="font-size:200 px;font-style:italic;color:gray" value="<%=e.getName()%>">
<br>
<br>
email :-<input type="text" name="email" style="font-size:200 px;font-style:italic;color:gray;" value="<%=e.getEmail()%>">
<br>
<br>

adress :-<input type="text" name="adress" style="font-size:200 px;font-style:italic;color:gray;"value="<%=e.getAdress()%>">
<br>
<br>

 <%if( e.getGender().equals("male")){%>
gender :-<input type="radio" name="gender" value="male" checked="checked"><input type="radio" name="gender" value="<%=e.getGender() %>" >
 <% }else if(e.getGender().equals("female")) {%> <br>

<input type="radio" name="gender" value="male"><input type="radio" name="gender" value="female"  checked="checked">	
<% } %>
<br>
<br>


Hobbies :-<input type="checkbox" name="hobby" value="<%=e.getHobbies() %>" style="font-size:200 px;font-style:italic;color:grey;   ">playing 
<input type="checkbox" name="hobby" value="<%=e.getHobbies()%>" style="font-size:200 px;font-style:italic;color:grey;   ">singing
<input type="checkbox" name="hobby" value="<%=e.getHobbies()%>" style="font-size:200 px;font-style:italic;color:grey;   ">dancing
<input type="checkbox" name="hobby" value="<%=e.getHobbies()%>" style="font-size:200 px;font-style:italic;color:grey;   ">reading
<br>
<br>


occupation :-<input type="text" name="job" style="font-size:200 px;font-style:italic;color:gray;" value="<%=e.getOccupation()%>">
<br>
<br>

<input type="submit" value="update" name="update">

</center>
</form>


</body>
</html>