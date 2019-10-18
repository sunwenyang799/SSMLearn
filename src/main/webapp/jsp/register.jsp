<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="../js/register.js"></script>
<style type="text/css">
   form{
    
      font-size: 30px
   }
   
   button {
	height:50px;
	width:80px
}
</style>
<title>注册</title>
</head>
<body>
	<h1>用户注册</h1>
	<form action="/user/register" method = "get">
		<table>
			<tr>
				<td>请填写账号:</td>
				<td><input type="text" id="username" name="username"></td>
			</tr>
			<tr>
				<td>请填写密码:</td>
				<td><input type="password" name="password" id="passowrd"></td>
			</tr>
			<tr>
				<td>请填写姓名:</td>
				<td><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<td>请填写年龄:</td>
				<td><input type="text" id="age" name="age"></td>
			</tr>
			<tr>
				<td>请选择性别:</td>
				<td><input type="radio" value="男" name="sex" size="50"> <input
					type="radio" value="女" name="sex"></td>
			</tr>
			<tr>
				<td>请填写出生日期:</td>
				<td><input type="date" name="birthday"></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td><button type="submit">提交</button></td>
				<td><button type="reset">重置</button></td>
				<td><button type="button" onclick = "returnIndex()">返回</button></td>
			</tr>

		</table>
	</form>
</body>
</html>