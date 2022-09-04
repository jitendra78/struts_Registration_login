<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
background-color: aqua;
}
  form {
	text-align: center;
	
	margin-top: 10%;
}
</style>
</head>
<body>
<html:form action="loginservice">
  Enter Email:<html:text property="email"/><br>
  Enter Passowrd:<html:text property="pass"/><br>
  <html:submit value="send"/>
  </html:form>
</body>
</html>