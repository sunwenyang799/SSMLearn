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

	$.get(url, function(result) {
		if (result.success) {
			window.location.href = "jsp/login.jsp";
		} else {
			window.location.href = "jsp/error.jsp";
		}
	})
};
function goRegister(){

	window.location.href = "jsp/register.jsp";
}