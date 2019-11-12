/**
 * 
 */
function register() {
	var username = $('#username').val();
	var password = $('#password').val();
	var name = $('#name').val();
	var age = $('#age').val();
	var sex = $('.sex').val();
	var birthday = $('#birthday').val();
	var url = "http://localhost:8080/SSMLearn/user/register?username="
			+ username + "&password=" + password + "&name" + name + "&age="
			+ age + "&sex" + sex + "&birthday=" + birthday;
	$.get(url, function(result) {
		if (result.success) {
			window.location.href = "../registerSuccess.jsp";
		} else {
			window.location.href = "../error.jsp";
		}
	})
}
function returnIndex() {
	window.location.href = "../index.jsp";
}