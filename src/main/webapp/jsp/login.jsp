<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/container.css" />
<script type="text/javascript">
var user = '<%=session.getAttribute("user")%>'
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<div class="fd-header">
		<span>欢迎您, ${user.name}</span>
	</div>
	<div class = "fd-container-left">
	   <ul>
	       <li>用户管理</li>
	       <li>添加用户</li>
	   </ul>
	</div>
	<div class="fd-container-right">
	   <iframe frameborder="0" scrolling="yes" style="width:100%;height:100%" src="showUser.jsp" id="main"></iframe>  
	</div>
</body>
</html>