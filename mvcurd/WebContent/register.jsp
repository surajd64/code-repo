<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register page</title>
</head>
<body>

<form action="reg">

<center>
<h2 style="color:gray; ">Registeration form</h2>
<br>
<br>
<input type="hidden" name="id">
<br>
<br>

name :-<input type="text" name="name" style="font-size:200 px;font-style:italic;color:gray  ">
<br>
<br>
email :-<input type="text" name="email" style="font-size:200 px;font-style:italic;color:gray;   ">
<br>
<br>

adress :-<input type="text" name="adress" style="font-size:200 px;font-style:italic;color:gray;   ">
<br>
<br>

gender :-<input type="radio" name="gender" value="male" style="font-size:200 px;font-style:italic;color:gray;   ">male<input type="radio" name="gender" value="female" style="font-size:200 px;font-style:italic;color:gray;   ">female
<br>
<br>


Hobbies :-<input type="checkbox" name="hobby" value="playing" style="font-size:200 px;font-style:italic;color:grey;   ">playing <input type="checkbox" name="hobby" value="singing" style="font-size:200 px;font-style:italic;color:grey;   ">singing
<input type="checkbox" name="hobby" value="dancing" style="font-size:200 px;font-style:italic;color:grey;   ">dancing<input type="checkbox" name="hobby" value="reading" style="font-size:200 px;font-style:italic;color:grey;   ">reading
<br>
<br>


occupation :-<input type="text" name="job" style="font-size:200 px;font-style:italic;color:gray;   ">
<br>
<br>

<input type="submit" value="register" name="register">

</center>
</form>


</body>
</html>