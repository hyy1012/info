<%@page contentType="text/html; charset=utf-8" language="java" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() +":"+request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>答题情况</title>
	<base href="<%=basePath%>">
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
  <link rel="stylesheet" href="css/city-picker.css" />
  <script src="js/jquery-2.1.4.js"></script>
	<style type="text/css">
		.grid-demo-bg1>span{margin-bottom: 10px;border: 1px solid #009688;color: #009688;padding: 5px 12px;display: inline-block;}
		.grid-demo-bg1>span.on{background: #009688;color: #fff;}
		.grid-demo-bg1>span:hover{cursor: pointer;}
		.layui-form-item { margin-bottom: 0px;}
		
	</style>
</head>
<body>
  <ul class="sidebar hidden-xs">
  <a href="tel:0574-63559457" class="tra"><i class="rtico layui-icon layui-icon-chat"></i>咨询<span class="sbr-400 tra" style="height: 108px;padding-top: 10px;left: -117px;"><img src="layuiadmin/img/person.png" alt=""></span></a>
  <a href="tel:0574-63559457" class="tra"><i class="rtico layui-icon layui-icon-login-wechat" style="color: #fff;"></i>微信<span class="sbr-400 tra" style="height: 108px;padding-top: 10px;left: -117px;"><img src="layuiadmin/img/weixin.png" alt=""></span></a>
  <a href="tel:0574-63559457" class="tra"><i class="rtico layui-icon layui-icon-cellphone"></i>电话<span class="sbr-400 tra"><i class="r-arr-b"></i>0574-63559457</span></a>
  </ul>
  
  <div class="layui-fluid" style="padding-bottom: 50px;">
    <div class="layui-row layui-col-space15">
	
				<div class="layui-row personal ">
					<div class="layui-col-xs12" >
						<div class="grid-demo grid-demo-bg1" style="width: 1200px; background-color: #FFFFFF;padding: 30px;">
						<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
						   <legend id="dddd">试题列表&nbsp;&nbsp;&nbsp;&nbsp; </legend>
						</fieldset>
						
						<form id="testList" class="layui-form" action="">
						</form>
						</div>
					</div>
				</div>
		
    </div>
  </div>
	<!--footer-->
	<footer class="footer">
		<span class="footer-brand">
			<a href="http://www.25175.net" target="_blank"><strong class="text-danger">顺通网络</strong></a>&nbsp;提供技术支持
		</span>
		<p class="no-margin">
			&copy;by <a href="http://www.25175.net/" target="_Blank"><strong>25175</strong></a>
		</p>
	</footer><!-- /footer -->



  <script src="layuiadmin/layui/layui.js"></script>
  <script>
      function GetQueryString(name) {
          var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");
          var r = window.location.search.substr(1).match(reg);
          if (r!=null) return (decodeURI(r[2])); return null;
      }

  </script>
  <script>
  layui.config({
    base: 'layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'console','jquery','table','laydate','form','layer'],function(){
			var $ = layui.jquery,table = layui.table,laydate=layui.laydate,form=layui.form;
			var layer=layui.layer;

      var id = GetQueryString('id');
      if (id!=null){
			$.ajax({
                   url:'outer/getItem'
				  ,type:'POST'
				  ,data:{id:id}
				  ,success:function (res) {
                       console.log(res.record)
					var content =""
					var mark=0;
                       var sum=0;
					for (var i = 0;i<res.record.length;i++){
                        mark += res.record[i].sMark
                        sum +=res.record[i].sScore
					     content +="<div class=\"problem\">\n" +
                             "<div class=\"layui-form-item\">\n" +
                             "  <div class=\"layui-inline\">\n" +
                             "    <label class=\"layui-form-label\">题目：" +
                             "        </label>\n" +
                             "    <div class=\"layui-inline\">\n" +
                             "      <span class=\"layui-form-label\" style=\"width: 80%;text-align: left;font-weight: bolder\">"+res.record[i].sName+" </span>\n" +
                             "    </div>\n" +
                             "  </div>\n" +
                             "  <div class=\"layui-inline\" style='float: right'>\n" +
                             "    <label class=\"layui-form-label\">分值</label>\n" +
                             " <div class=\"layui-input-inline\" >\n" +
                             " <input readonly style=\"border: 0;\" type=\"text\" name=\"date\" id=\"date6\" lay-verify=\"date6\"  autocomplete=\"off\" class=\"layui-input\"  value=\""+res.record[i].sMark+"/"+res.record[i].sScore+"\">\n" +
                             " </div>\n" +
                             "  </div>\n" +
                             "</div>\n" +
                             "<div class=\"answer\">\n"
                     if (res.record[i].responses.length>0){

					         for (var j=0;j<res.record[i].responses.length;j++){
                                 content +="<div class=\"layui-form-item\" >\n" +
                                     "<div class=\"layui-input-block\" style='width: 70%;margin-bottom: 5px'>\n" +
                                     "<input readonly class='layui-input' value='"+res.record[i].responses[j].rResponse+"'>"+
                                     "\n" +
                                     "</div>\n" +
                                     "</div>\n"
                             }


					 }
                       content +=      "</div></div>"

                    }
                    $("#dddd").append("得分/总分："+mark+"/"+sum)
                   $("#testList").html(content);
					form.render()
                   }
			})




      }
	});


  
	</script>
	
</body>
</html>

