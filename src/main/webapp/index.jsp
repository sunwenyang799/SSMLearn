<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
	pageEncoding="UTF-8"%>
<%String contextPath = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
var contextPath = "<%=contextPath%>";
</script>
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="js/index.js"></script>

<link rel="stylesheet" type="text/css" href="css/index.css" />
<title>SSM整合</title>
</head>
<body>
	<div class="fd-nav">
		<h1>学生管理系统</h1>
		<form action="" method="get">
		  <div class = "fd-contanier">
			用户名:<input type="text" id = "username" name = "username"> 
			密码:<input type="password" id = "password" name = "password">
			<button type = "button" onclick = "login()" >登录</button>
			<button type = "button" onclick = "goRegister()">注册</button>
		</div>
		</form>

	</div>

</body>
</html>