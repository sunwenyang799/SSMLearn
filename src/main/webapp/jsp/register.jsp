<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="../js/register.js"></script>
<style type="text/css">
.container {
	border: 1px black solid;
	margin: 200px auto;
	text-align: center;
	width:25%;
	line-height:50px;
}

form {
	text-align: center;
	font-size: 22px;
}

table {
	margin: 10px auto;
}
td{
    text-align:left;
    
}
button {
	height: 40px;
	width: 60px
}
span{
    color:red;
    }
</style>
<title>注册</title>
</head>
<body>
	<div class="container">
		<h1>用户注册</h1>
		<form action="" method="get">
			<table>
				<tr>
					<td>请填写账号:</td>
					<td><input type="text" id="username" name="username" placeholder="请输入账号"></td>
					<td><span>*</span><td>
				</tr>
				<tr>
					<td>请填写密码:</td>
					<td><input type="password" name="password" id="password" placeholder="请输入密码"></td>
					<td><span>*</span><td>
				</tr>
				<tr>
					<td>请填写姓名:</td>
					<td><input type="text" id="name" name="name" placeholder="请输入姓名"></td>
					<td><span>*</span><td>
				</tr>
				<tr>
					<td>请填写年龄:</td>
					<td><input type="text" id="age" name="age" placeholder="请输入年龄"></td>
					<td><span>*</span><td>
				</tr>
				<tr>
					<td>请选择性别:</td>
					<td>
					    男<input type="radio" value="男" name="sex">
					    女<input type="radio" value="女" name="sex"></td>

				</tr>
				<tr>
					<td>请填写出生日期:</td>
					<td><input type="date" name="birthday" placeholder="请输入出生日期" id = "birthday"></td>
				</tr>
				<tr>
					<td><button type="button" onclick = "register()">提交</button></td>
					<td><button type="reset">重置</button></td>
					<td><button type="button" onclick="returnIndex()">返回</button></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>