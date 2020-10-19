$(function(){
    $("#aid").click(function(){

        var aId=$("#aid2").val();

        alert(aId);
		//询问框

		layer.confirm('确定删除吗？', {
			btn: ['确定','取消'] //按钮
		}, function(){
			$.post('/Acc/Accdel',{"aId":aId},function(date){
				if(date.code == 0){
					layer.msg("删除失败");
					location.href="history.back(-1)";
				}else{
					layer.msg("删除成功");

					//location.href="user/toindex";
					location.href="/Acc/getAcc";
				}
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
