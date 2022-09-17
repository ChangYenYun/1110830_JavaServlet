<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>註冊</title>
</head>
<body>
	<form action="AddConsumerController" method="post">
		<table width="300" align="center" border="6">
			<tr>
				<th align="center" colspan="2">會員資料
			<tr>
				<td>帳號:
				<td><input type="text" name="username"/>
			<tr>
				<td>密碼:
				<td><input type="text" name="password"/>
			<tr>
				<td>姓名:
				<td><input type="text" name="name"/>
			<tr>
				<td>電話:
				<td><input type="text" name="phone"/>
			<tr>
				<td>地址:
				<td><input type="text" name="address"/>
			<tr>
				<td  align="center" colspan="2">
				<input type="submit" value="註冊" >
		</table>
	</form>
</body>
</html>