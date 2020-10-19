$(function(){
	$("#entry_btn").click(function(){
		var usrName=$("#usrName").val();
		if(usrName == null || usrName == '' || usrName == undefined){
			layer.msg("用户名不能为空");
		}else{
			var usrPassword = $("#usrPassword").val();
			if(usrPassword == null || usrPassword == '' || usrPassword == undefined){
				layer.msg("密码不能为空");
			}else{
				var user={};
				user.username = usrName;
				user.password = usrPassword;

				/*$.post('user/login',user,function(date){
					if(date.code == 0){
						layer.msg("用户名或密码错误");
						location.href="user/tologin";
					}else{
						layer.msg("登录成功");

						//location.href="user/toindex";
						location.href="templates/admin_index.html";
					}
				})*/
				$.ajax({
					type : "POST",
					data : user,                                 //上传的参数
					async: false ,
					url : "user/login",     //请求的url。与后端@Request Mapping注解中的值一致。
					success : function(data) {          //请求成功的回调函数
						if (data.code == 0){
							layer.msg("登录失败");
							//alert("失败");
							location.href = "toindex/login";
						}else{
							layer.msg("登录成功");
							//alert("登录成功");
							location.href = "toindex/index";
						}
					}

				});
			}
		}
		
	});
});
