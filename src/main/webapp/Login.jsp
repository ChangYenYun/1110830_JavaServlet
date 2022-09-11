<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入</title>
</head>
<body>
	<form action="loginController" method="post">
	<table width="300" align="center" border="6">
	<tr>
	 	<td colspan="2" align="center">會員管理	
	<tr align="center">
	    <td>帳號:
	    <td><input type="text" name="username">
	<tr align ="center">
		<td>密碼:
		<td><input type="password" name="password">
	<tr>
	   <td align="center" colspan="2">
	   <input type="submit" value="登入" >
	   <a href="AddConsumer.jsp">註冊</a>
	
	</table>
	
	</form>
 
</body>
</html>