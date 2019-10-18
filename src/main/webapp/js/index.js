function login() {
	var username = $('#username').val();
	var password = $('#password').val();
	if (username.length <= 0) {
		alert("用户名不能为空");
		return;
	}
	if (password.length <= 0) {
		alert("密码不能为空");
		return;
	}

	var url = "http://localhost:8080/SSMLearn/user/login?username=" + username
			+ "&password=" + password;

	$.get(url, function(data) {
		if (data == "login") {
			window.location.href = "jsp/login.jsp";
		} else {
			alert(data);
		}
	})
};
function goRegister(){

	window.location.href = "jsp/register.jsp";
}