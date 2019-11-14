/**
 * 
 */
$(document).ready(
		function() {
			var url = "/SSMLearn/user/selectAll";

			$.get(url, function(data) {
				if (data.success) {
					var str = "<tr><td>序号</td><td>用户名</td><td>密码</td><td>姓名</td><td>年龄</td><td>性别</td><td>出生日期</td></tr>";
					if(data.userList!=null){
						for (var i = 0; i < data.userList.length; i++) {
							str += "<tr><td>" + (i + 1) + "</td>" + "<td>"
									+ data.userList[i].username + "</td>" + "<td>"
									+ data.userList[i].password + "</td>" + "<td>"
									+ data.userList[i].name + "</td>" + "<td>"
									+ data.userList[i].age + "</td>" + "<td>"
									+ data.userList[i].sex + "</td>" + "<td>"
									+ data.userList[i].birthday + "</td></tr>";
						}	
					}else{
						str+="<tr><td style='border:none'>暂无用户信息...</td></tr>"
					}
					$('table').html(str);
					console.log(data);
				} else {
					console.log("查询失败");
				}
			})
		})
