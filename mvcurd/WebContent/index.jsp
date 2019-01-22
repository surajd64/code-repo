<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index page</title>


<script type="text/javascript">

function submit1() {
	document.fn.action="log";
	document.fn.submit();
}


function register() {
	
	document.fn.action="register.jsp";
	document.fn.submit();
}



</script>

</head>
<body>
${data}

<form name="fn">
username :-<input type="text" name="uname">
<br>
<br>
password :-<input type="password" name="pass">
<br>
<br>
<input type="button" value="submit" onclick="submit1()">

<input type="button" value="register" onclick="register()">


</form>
</body>
</html>