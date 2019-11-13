/**
 * 
 */
function register() {

	var username = $('#username').val();
	var password = $('#password').val();
	var name = $('#name').val();
	var age = $('#age').val()==""?0:$('#age').val();
	var sex = $("input[name='sex']:checked").val();
	var birthday = $('#birthday').val();
	var url = "http://localhost:8080/SSMLearn/user/register?username="
			+ username + "&password=" + password + "&name=" + name + "&age="
			+ age + "&sex=" + sex + "&birthday=" + birthday;
//	if (checkUser('username', 'username', "用户名")
//			|| checkUser('password', 'password', "密码")
//			|| checkUser('name', 'name', "姓名") || checkUser('age', 'age', "年龄")) {
//		return;
//	}
	$.get(url, function(result) {
		if (result.success) {
			window.location.href = "registerSuccess.jsp";
		} else {
			window.location.href = "error.jsp";
		}
	})
}
function returnIndex() {
	window.location.href = "../index.jsp";
}

function checkUser(name, span, text) {
	var name = $('#' + name).val();
	if (name == "") {
		$('.' + span).html(text + '不能为空');
	}else{
		$('.' + span).html('*');
	}
}
