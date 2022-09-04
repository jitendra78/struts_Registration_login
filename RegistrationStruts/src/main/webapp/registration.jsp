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



    <html:form action="services">
      <h3>Registration</h3><br>
      User Id:<html:text property="id"></html:text><br><br>
       Name:<html:text property="name"></html:text><br><br>
       Email:<html:text property="email"></html:text><br><br>
       Password:<html:password property="pass"></html:password><br><br>
       Mobile Number:<html:text property="mob_no"></html:text><br><br>
       Gender<html:select property="gender">
         <html:option value="male">Male</html:option>
         <html:option value="female">Female</html:option>
         <html:option value="other">Other</html:option>
       </html:select><br><br>
       Address:<html:text property="address"></html:text><br><br>
       <html:submit value="send"></html:submit>
    </html:form>
   
</body>
</html>
