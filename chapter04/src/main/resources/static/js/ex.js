$(function(){
    $("#ex").click(function(){
		//询问框
		layer.confirm('确定退出吗？', {
			btn: ['确定','取消'] //按钮
		}, function(){
			$.post('/user/ex',null,function(date){
					layer.msg("退出成功");
					location.href = "/toindex/to_login";
			});
		}, function(){
			layer.msg("已取消");
		});
        /*$.ajax({
                    type : "POST",
                    data : uId,                                 //上传的参数
                    async: true,
                    url : "/user/del",     //请求的url。与后端@Request Mapping注解中的值一致。
                    success : function(data) {          //请求成功的回调函数
                        if (data.code == 0){
                            layer.msg("删除失败");
                            //alert("失败");
                            location.href = "history.back(-1)";
                        }else{
                            layer.msg("删除成功");
                            //alert("登录成功");
                            location.href = "/user/getuserlist";
                        }
                    }

                });*/


    });
});
