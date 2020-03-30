<%@page contentType="text/html; charset=utf-8" language="java" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() +":"+request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>员工资料</title>
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
						   <legend style="width: 100%"><span id="sjId">ID： . </span>试题列表&nbsp;&nbsp;&nbsp;&nbsp;<i id="addItem" class="layui-icon" style="font-size: 25px;">&#xe654;</i><div style="display: inline-block;float: right;margin-right: 13%">总分:<span id="zongfen"></span> </div>  </legend>
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


  <script type="text/template" id="job">
	  
	  <div class="layui-form-item">
	   <div class="layui-inline">
	      <label class="layui-form-label">职位名</label>
	   <div class="layui-input-inline" >
	   <input type="text"  autocomplete="off" class="layui-input" >
	   </div>
	   			
	    </div>
	  </div>
	  
  </script>
  <script type="text/template" id="item">
  	  
  	  <div class="layui-form" style="margin-top: 20px">
  	  <div class="layui-form-item">
  	    <div class="layui-inline">
  	  	  
  	      <label class="layui-form-label">题目</label>
  	      <div class="layui-inline">
  	        <textarea id="problem" maxlength="500" class="layui-form-label" style="width:500px;height: 150px;text-align: left;"></textarea>
  	      </div>
  	    </div>
  	  </div>
	  <div class="layui-form-item">
		  <div class="layui-inline">

			  <label class="layui-form-label">类型</label>
			  <div class="layui-inline">
				<select id="type" >
					<option value="1">单选</option>
					<option value="2">多选</option>
				</select>
			  </div>
		  </div>
	  </div>
	  <div class="layui-form-item">
		  <div class="layui-inline">
			  <label class="layui-form-label"> <button id="addAnswer" type="button" class="layui-btn layui-btn-primary layui-btn-sm"><i class="layui-icon"></i></button></label>
		  </div>
		  <div class="layui-inline">
		  <table id="table"  style="border-collapse:separate;border-spacing:50px 10px">
			  <tr>
				  <th>答案</th>
				  <th>分值</th>
			  </tr>
			  <tr>
				  <td>
					  <input   type="text" name="date"  autocomplete="off" class="layui-input addOne"  value="会">
				  </td>
				  <td>
					  <input   type="text" name="date"  oninput="value=value.replace(/[^\d]/g,'')" autocomplete="off" class="layui-input addMark"  value="0">
				  </td>
			  </tr>
			  <tr>
				  <td>
					  <input   type="text" name="date" autocomplete="off" class="layui-input addOne"  value="不会">
				  </td>
				  <td>
					  <input   type="text" name="date"  oninput="value=value.replace(/[^\d]/g,'')"  autocomplete="off" class="layui-input addMark"  value="0">
				  </td>
			  </tr>
		  </table>
		  </div>
	  </div>
	  </div>
  </script>
  <script src="layuiadmin/layui/layui.js"></script>
  <script>
      function GetQueryString(name) {
          var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)","i");
          var r = window.location.search.substr(1).match(reg);
          if (r!=null){
			  $("#sjId").html("Id: "+r[2]+". &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;")
			  return (decodeURI(r[2]));
		  }
          return null;
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

      var pPostid = GetQueryString('pid');
      if (pPostid!=null){


			$.ajax({
                   url:'test/getAll'
				  ,type:'POST'
				  ,data:{id:pPostid}
				  ,success:function (res) {
                       console.log(res.problems)
					var content =""
					for (var i = 0;i<res.problems.length;i++){
					     content +="<div class=\"problem\">\n" +
                             "<div class=\"layui-form-item\">\n" +
                             "  <div class=\"layui-inline\" style='width: 50%'>\n" +
                             "    <label class=\"layui-form-label\" <!--style='display: inline-block'-->><i class=\"layui-icon deleteItem\" style=\"font-size: 20px;\">&#x1006;</i>\n" +
                             "<i class=\"layui-icon editItem\" style=\"font-size: 20px;\">&#xe642;</i>\n" +
                             "<i class=\"layui-icon before\" style=\"font-size: 20px;\">&#xe619;</i>\n" +
                             "<i class=\"layui-icon addNew\" style=\"font-size: 20px;\">&#xe654;</i>\n" +
                             "<i class=\"layui-icon last\" style=\"font-size: 20px;\">&#xe61a;</i>\n" +
                             "        </label>\n" +
                             "  <input type=\"hidden\" value=\""+res.problems[i].pType+"\">\n" +
                             "  <input type=\"hidden\" value=\""+res.problems[i].pId+"\">\n" +
                             "  <input type=\"hidden\" value=\""+res.problems[i].pList+"\">\n" +
                             "    <div class=\"layui-inline\" style='width:80%;'>\n" +
                             "      <span class=\"layui-form-label\" style=\"width:100%;text-align: left;\">"+(i+1)+"."+res.problems[i].pTopic+" </span>\n" +
                             "    </div>\n" +
                             "  </div>\n" +
                             "  <div class=\"layui-inline\" style='display: inline-block'>\n" +
                             "    <label class=\"layui-form-label\">创建时间</label>\n" +
                             " <div class=\"layui-input-inline\" >\n" +
                             " <input readonly style=\"border: 0;\" type=\"text\" name=\"date\"  lay-verify=\"date6\"  autocomplete=\"off\" class=\"layui-input\"  value=\""+res.problems[i].pDate+"\">\n" +
                             " </div>\n" +
                             "  </div>\n" +
                             "  <div class=\"\" style='display: inline-block;'>\n" +
                             "    <label class=\"layui-form-label\">分值</label>\n" +
                             " <div class=\"layui-input-inline\" style='width: 100px' >\n" +
                             " <input readonly style=\"border: 0;\" type=\"text\" name=\"date\" lay-verify=\"date6\"  autocomplete=\"off\" class=\"layui-input fenshu\"  value=\""+res.problems[i].pScore+"\">\n" +
                             " </div>\n" +
                             "  </div>\n" +
                             "</div>\n" +
                             "<div class=\"answer\">\n"
                             if (res.problems[i].answers.length>0){
					         if (res.problems[i].pType==1){
					         for (var j=0;j<res.problems[i].answers.length;j++){
                                 content +="<div class=\"layui-form-item\" pane=\"\">\n" +
                                     "<div class=\"layui-input-block\" >\n" +
                                     "<input type=\"radio\" name=\"answer["+res.problems[i].pId+"]\" lay-skin=\"primary\" title=\""+res.problems[i].answers[j].naAnswer+"\" >\n" +
                                     "\n" +
                                     "</div>\n" +
                                     "</div>\n"
                             }
                             }
                         if (res.problems[i].pType==2){
                             for (var j=0;j<res.problems[i].answers.length;j++){
                                 content +="<div class=\"layui-form-item\" pane=\"\">\n" +
                                     "<div class=\"layui-input-block\">\n" +
                                     "<input type=\"checkbox\" name=\"answer[\"+res.problems[i].pId+\"]\" lay-skin=\"primary\" title=\""+res.problems[i].answers[j].naAnswer+"\" >\n" +
                                     "\n" +
                                     "</div>\n" +
                                     "</div>\n"
                             }
						 }

					 }
                       content +=      "</div></div>"

                    }
                   $("#testList").html(content);
					  var ssss= 0;
					  for(var i=0;i<$(".fenshu").length;i++){
					      ssss += parseInt($(".fenshu").eq(i).val());
					  }
					  $("#zongfen").html(ssss);
					form.render()
                   }
			})
			
			$("#addItem").click(function(){
				  layer.open({
				    type: 1
				    ,title: '添加试题'
				    ,content: $("#item").html()
				    ,btn: ['确定', '取消']
					,area:['750px','700px']
					,offset:'50px'
				    ,yes: function(index, layero){
                          var pTopic = $("#problem").val();
                          if (pTopic==null||pTopic.trim()==""){
                              layer.msg("题目不能为空")
							  return
						  }
                          var pType = $("#type").val();
                          var ans=$("#table tr")
						  var answers=[]
						  for(var i=1;i<ans.length;i++){
                              var inputs=$("#table tr:eq("+i+") input");
							  var answer = {};
							  answer.naAnswer = inputs.eq(0).val();
							  answer.naScore = inputs.eq(1).val();
							  answers.push(answer)
						  }
					    $.ajax({
							url:'test/add'
							,type:'POST'
							,data:JSON.stringify({pTopic:pTopic,pType:pType,pPostid:pPostid,answers:answers})
							,contentType:"application/json"
							,success:function (res) {
                                if (res.code==200){
                                    layer.msg("添加成功")
									var content = "";
                                    content +="<div class=\"problem\">\n" +
                                        "<div class=\"layui-form-item\">\n" +
                                        "  <div class=\"layui-inline\" style='width: 50%'>\n" +
                                        "    <label class=\"layui-form-label\"><i class=\"layui-icon deleteItem\" style=\"font-size: 20px;\">&#x1006;</i>\n" +
                                        "<i class=\"layui-icon editItem\" style=\"font-size: 20px;\">&#xe642;</i>\n" +
                                        "<i class=\"layui-icon before \" style=\"font-size: 20px;\">&#xe619;</i>\n" +
                                        "<i class=\"layui-icon addNew\" style=\"font-size: 20px;\">&#xe654;</i>\n" +
                                        "<i class=\"layui-icon last\" style=\"font-size: 20px;\">&#xe61a;</i>\n" +
                                        "        </label>\n" +
                                        "  <input type=\"hidden\" value=\""+res.problem.pType+"\">\n" +
                                        "  <input type=\"hidden\" value=\""+res.problem.pId+"\">\n" +
                                        "  <input type=\"hidden\" value=\""+res.problem.pList+"\">\n" +
                                        "    <div class=\"layui-inline\" style='width:80%;' >\n" +
                                        "      <span class=\"layui-form-label\" style=\"width: 100%;text-align: left;\">"+res.problem.pTopic+" </span>\n" +
                                        "    </div>\n" +
                                        "  </div>\n" +
                                        "  <div class=\"layui-inline\" style='display: inline-block'>\n" +
                                        "    <label class=\"layui-form-label\">创建时间</label>\n" +
                                        " <div class=\"layui-input-inline\" >\n" +
                                        " <input readonly style=\"border: 0;\" type=\"text\" name=\"date\"  lay-verify=\"date6\"  autocomplete=\"off\" class=\"layui-input\"  value=\""+res.problem.pDate+"\">\n" +
                                        " </div>\n" +
                                        "  </div>\n" +
                                        "  <div class=\"layui-inline\" style='display: inline-block;'>\n" +
                                        "    <label class=\"layui-form-label\">分值</label>\n" +
                                        " <div class=\"layui-input-inline\" style='width: 100px' >\n" +
                                        " <input readonly style=\"border: 0;\" type=\"text\" name=\"date\"  lay-verify=\"date6\"  autocomplete=\"off\" class=\"layui-input fenshu\"  value=\""+res.problem.pScore+"\">\n" +
                                        " </div>\n" +
                                        "  </div>\n" +
                                        "</div>\n" +
                                        "<div class=\"answer\">\n"
                                    if (res.problem.answers.length>0){
                                        if (res.problem.pType==1){
                                            for (var j=0;j<res.problem.answers.length;j++){
                                                content +="<div class=\"layui-form-item\" pane=\"\">\n" +
                                                    "<div class=\"layui-input-block\">\n" +
                                                    "<input type=\"radio\" name=\"answer["+res.problem.pId+"]\" lay-skin=\"primary\" title=\""+res.problem.answers[j].naAnswer+"\" >\n" +
                                                    "\n" +
                                                    "</div>\n" +
                                                    "</div>\n"
                                            }
                                        }
                                        if (res.problem.pType==2){
                                            for (var j=0;j<res.problem.answers.length;j++){
                                                content +="<div class=\"layui-form-item\" pane=\"\">\n" +
                                                    "<div class=\"layui-input-block\">\n" +
                                                    "<input type=\"checkbox\" name=\"answer[\"+res.problem.pId+\"]\" lay-skin=\"primary\" title=\""+res.problem.answers[j].naAnswer+"\" >\n" +
                                                    "\n" +
                                                    "</div>\n" +
                                                    "</div>\n"
                                            }
                                        }

                                    }
                                    content +=      "</div></div>"
                                    $("#testList").append(content);
                                    form.render()
                                    var ssss= 0;
                                    for(var i=0;i<$(".fenshu").length;i++){
                                        ssss += parseInt($(".fenshu").eq(i).val());
                                    }
                                    $("#zongfen").html(ssss);
									layer.close(index)
								}
                            }
                            ,error:function () {
                                layer.msg("未知错误")
                            }
						})
				    }
				  });
				  form.render();
			})

	       $("body").on('click','#addAnswer',function () {
	           var content = "<tr>\n" +
                   " <td>\n" +
                   " <input   type=\"text\" name=\"date\"    autocomplete=\"off\" class=\"layui-input addOne\"  value=\"\">\n" +
                   "  </td>\n" +
                   "  <td>\n" +
                   " <input   type=\"text\" name=\"date\" oninput=\"value=value.replace(/[^\\d]/g,'')\"   autocomplete=\"off\" class=\"layui-input addMark\"  value=\"\">\n" +
                   "  </td>\n" +
                   " <td>\n" +
                   " <i class=\"layui-icon deleteAnswer\" style=\"font-size: 25px;\">&#x1006;</i>\n" +
                   "</td>\n" +
                   "</tr>"
               $("#table").append(content)
           })

           $("body").on('click','.deleteAnswer',function () {
              $(this).parent().parent().remove();
           })

          $("body").on('click','.addNew',function () {
              var pid=$(this).parent().next().next().next().val();
              var that = $(this)
              layer.open({
                  type: 1
                  ,title: '插入试题'
                  ,content: $("#item").html()
                  ,btn: ['确定', '取消']
                  ,area:['750px','700px']
                  ,offset:'50px'
                  ,yes: function(index, layero){
                      var pTopic = $("#problem").val();
                      if (pTopic==null||pTopic.trim()==""){
                          layer.msg("题目不能为空")
                          return
                      }
                      var pType = $("#type").val();
                      var ans=$("#table tr")
                      var answers=[]
                      for(var i=1;i<ans.length;i++){
                          var inputs=$("#table tr:eq("+i+") input");
                          var answer = {};
                          answer.naAnswer = inputs.eq(0).val();
                          answer.naScore = inputs.eq(1).val();
                          answers.push(answer)
                      }
                      $.ajax({
                          url:'test/add'
                          ,type:'POST'
                          ,data:JSON.stringify({pList:pid,pTopic:pTopic,pType:pType,pPostid:pPostid,answers:answers})
                          ,contentType:"application/json"
                          ,success:function (res) {
                              if (res.code==200){
                                  layer.msg("添加成功")
                                  var content = "";
                                  content +="<div class=\"problem\">\n" +
                                      "<div class=\"layui-form-item\">\n" +
                                      "  <div class=\"layui-inline\" style='width: 50%' >\n" +
                                      "    <label class=\"layui-form-label\"><i class=\"layui-icon deleteItem\" style=\"font-size: 20px;\">&#x1006;</i>\n" +
                                      "<i class=\"layui-icon editItem\" style=\"font-size: 20px;\">&#xe642;</i>\n" +
                                      "<i class=\"layui-icon before \" style=\"font-size: 20px;\">&#xe619;</i>\n" +
                                      "<i class=\"layui-icon addNew\" style=\"font-size: 20px;\">&#xe654;</i>\n" +
                                      "<i class=\"layui-icon last\" style=\"font-size: 20px;\">&#xe61a;</i>\n" +
                                      "        </label>\n" +
                                      "  <input type=\"hidden\" value=\""+res.problem.pType+"\">\n" +
                                      "  <input type=\"hidden\" value=\""+res.problem.pId+"\">\n" +
                                      "  <input type=\"hidden\" value=\""+res.problem.pList+"\">\n" +
                                      "    <div class=\"layui-inline\" style='width:80%;'>\n" +
                                      "      <span class=\"layui-form-label\" style=\"width: 100%;text-align: left;\">"+res.problem.pTopic+" </span>\n" +
                                      "    </div>\n" +
                                      "  </div>\n" +
                                      "  <div class=\"layui-inline\" style='display: inline-block;'>\n" +
                                      "    <label class=\"layui-form-label\">创建时间</label>\n" +
                                      " <div class=\"layui-input-inline\" >\n" +
                                      " <input readonly style=\"border: 0;\" type=\"text\" name=\"date\"  lay-verify=\"date6\"  autocomplete=\"off\" class=\"layui-input\"  value=\""+res.problem.pDate+"\">\n" +
                                      " </div>\n" +
                                      " </div>\n" +
                                      "  <div class=\"layui-inline\" style='display: inline-block;'>\n" +
                                      "    <label class=\"layui-form-label\">分值</label>\n" +
                                      " <div class=\"layui-input-inline\" style='width: 100px' >\n" +
                                      " <input readonly style=\"border: 0;\" type=\"text\" name=\"date\"  lay-verify=\"date6\"  autocomplete=\"off\" class=\"layui-input fenshu\"  value=\""+res.problem.pScore+"\">\n" +
                                      " </div>\n" +
                                      "  </div>\n" +
                                      "</div>\n" +
                                      "<div class=\"answer\">\n"
                                  if (res.problem.answers.length>0){
                                      if (res.problem.pType==1){
                                          for (var j=0;j<res.problem.answers.length;j++){
                                              content +="<div class=\"layui-form-item\" pane=\"\">\n" +
                                                  "<div class=\"layui-input-block\">\n" +
                                                  "<input type=\"radio\" name=\"answer["+res.problem.pId+"]\" lay-skin=\"primary\" title=\""+res.problem.answers[j].naAnswer+"\" >\n" +
                                                  "\n" +
                                                  "</div>\n" +
                                                  "</div>\n"
                                          }
                                      }
                                      if (res.problem.pType==2){
                                          for (var j=0;j<res.problem.answers.length;j++){
                                              content +="<div class=\"layui-form-item\" pane=\"\">\n" +
                                                  "<div class=\"layui-input-block\">\n" +
                                                  "<input type=\"checkbox\" name=\"answer[\"+res.problem.pId+\"]\" lay-skin=\"primary\" title=\""+res.problem.answers[j].naAnswer+"\" >\n" +
                                                  "\n" +
                                                  "</div>\n" +
                                                  "</div>\n"
                                          }
                                      }

                                  }
                                  content +=      "</div></div>"
                                  that.parent().parent().parent().parent().after(content);
                                  var ssss= 0;
                                  for(var i=0;i<$(".fenshu").length;i++){
                                      ssss += parseInt($(".fenshu").eq(i).val());
                                  }
                                  $("#zongfen").html(ssss);
                                  form.render()
                                  layer.close(index)
                              }
                          }
                          ,error:function () {
                              layer.msg("未知错误")
                          }
                      })
                  }
              });
              form.render();

          })
			
			
			$("body").on("click",".editItem",function(){
                var pid=$(this).parent().next().next().val();
                var that = $(this)
				  layer.open({
				    type: 1
				    ,title: '编辑职位'
				    ,content: $("#item").html()
				    ,btn: ['确定', '取消']
					,area:['750px','700px']
					,offset:'50px'
				    ,yes: function(index, layero){
                          var pTopic = $("#problem").val();
                          if (pTopic==null||pTopic.trim()==""){
                              layer.msg("题目不能为空")
                              return
                          }
                          var pType = $("#type").val();
                          var ans=$("#table tr")
                          var answers=[]
                          for(var i=1;i<ans.length;i++){
                              var inputs=$("#table tr:eq("+i+") input");
                              var answer = {};
                              answer.naAnswer = inputs.eq(0).val();
                              answer.naScore = inputs.eq(1).val();
                              answers.push(answer)
                          }

                          $.ajax({
                              url:'test/edit'
                              ,type:'POST'
                              ,data:JSON.stringify({pId:pid,pTopic:pTopic,pType:pType,pPostid:pPostid,answers:answers})
                              ,contentType:"application/json"
                              ,success:function (res) {
                                  if (res.code==200){
                                      layer.msg("修改成功")
                                      var content = "";

                                      content += "<div class=\"layui-form-item\">\n" +
                                          "  <div class=\"layui-inline\" style='width: 50%'>\n" +
                                          "    <label class=\"layui-form-label\"><i class=\"layui-icon deleteItem\" style=\"font-size: 20px;\">&#x1006;</i>\n" +
                                          "<i class=\"layui-icon editItem\" style=\"font-size: 20px;\">&#xe642;</i>\n" +
                                          "<i class=\"layui-icon before \" style=\"font-size: 20px;\">&#xe619;</i>\n" +
                                          "<i class=\"layui-icon addNew\" style=\"font-size: 20px;\">&#xe654;</i>\n" +
                                          "<i class=\"layui-icon last\" style=\"font-size: 20px;\">&#xe61a;</i>\n" +
                                          "        </label>\n" +
                                          "  <input type=\"hidden\" value=\""+res.problem.pType+"\">\n" +
                                          "  <input type=\"hidden\" value=\""+res.problem.pId+"\">\n" +
                                          "  <input type=\"hidden\" value=\""+res.problem.pList+"\">\n" +
                                          "    <div class=\"layui-inline\" style='width:80%;'>\n" +
                                          "      <span class=\"layui-form-label\" style=\"width: 100%;text-align: left;\">"+res.problem.pTopic+" </span>\n" +
                                          "    </div>\n" +
                                          "  </div>\n" +
                                          "  <div class=\"layui-inline\" style='display: inline-block;'>\n" +
                                          "    <label class=\"layui-form-label\">创建时间</label>\n" +
                                          " <div class=\"layui-input-inline\" >\n" +
                                          " <input readonly style=\"border: 0;\" type=\"text\" name=\"date\" lay-verify=\"date6\"  autocomplete=\"off\" class=\"layui-input\"  value=\""+res.problem.pDate+"\">\n" +
                                          " </div>\n" +
                                          " </div>\n" +
                                          "  <div class=\"layui-inline\" style='display: inline-block;'>\n" +
                                          "    <label class=\"layui-form-label\">分值</label>\n" +
                                          " <div class=\"layui-input-inline\" style='width: 100px' >\n" +
                                          " <input readonly style=\"border: 0;\" type=\"text\" name=\"date\"  lay-verify=\"date6\"  autocomplete=\"off\" class=\"layui-input fenshu\"  value=\""+res.problem.pScore+"\">\n" +
                                          " </div>\n" +
                                          "  </div>\n" +
                                          "</div>\n" +
                                          "<div class=\"answer\">\n"
                                      if (res.problem.answers.length>0){
                                          if (res.problem.pType==1){
                                              for (var j=0;j<res.problem.answers.length;j++){
                                                  content +="<div class=\"layui-form-item\" pane=\"\">\n" +
                                                      "<div class=\"layui-input-block\">\n" +
                                                      "<input type=\"radio\" name=\"answer["+res.problem.pId+"]\" lay-skin=\"primary\" title=\""+res.problem.answers[j].naAnswer+"\" >\n" +
                                                      "\n" +
                                                      "</div>\n" +
                                                      "</div>\n"
                                              }
                                          }
                                          if (res.problem.pType==2){
                                              for (var j=0;j<res.problem.answers.length;j++){
                                                  content +="<div class=\"layui-form-item\" pane=\"\">\n" +
                                                      "<div class=\"layui-input-block\">\n" +
                                                      "<input type=\"checkbox\" name=\"answer[\"+res.problem.pId+\"]\" lay-skin=\"primary\" title=\""+res.problem.answers[j].naAnswer+"\" >\n" +
                                                      "\n" +
                                                      "</div>\n" +
                                                      "</div>\n"
                                              }
                                          }

                                      }
                                      content +="</div>"
                                     that.parent().parent().parent().parent().html(content)
                                      var ssss= 0;
                                      for(var i=0;i<$(".fenshu").length;i++){
                                          ssss += parseInt($(".fenshu").eq(i).val());
                                      }
                                      $("#zongfen").html(ssss);
                                      form.render()
                                      layer.close(index)
                                  }
                              }
                              ,error:function () {
                                  layer.msg("未知错误")
                              }
                          })
				    }
				  });
                var pid=$(this).parent().next().next().val();
                var that = $(this)
				  $.post("test/getOne",{id:pid},function (res) {
					  if (res.problem!=null){
                          $("#problem").val(res.problem.pTopic);
                           $("#type").val(res.problem.pType);
                           for(var i = 0;i<res.problem.answers.length-2;i++){
                               $("#addAnswer").click()
						   }
                          for (var i=0;i<$(".addOne").length;i++){
                              $(".addOne").eq(i).val(res.problem.answers[i].naAnswer)
                              $(".addMark").eq(i).val(res.problem.answers[i].naScore)
                          }
					  }
					  form.render()
                  })
			})
			
			
			$("body").on("click",".deleteItem",function(){
                var that=$(this);

				  layer.confirm("确定要删除这个问题吗？",function(index){
                      var pid=that.parent().next().next().val();
					  $.post("test/delete",{id:pid},function(res){
					      if (res.code==200){
                              that.parent().parent().parent().parent().remove()
					          layer.msg("删除成功",{offset:'100px'})
							  layer.close(index)
						  }else{
                              layer.msg("删除失败",{offset:'100px'})
						  }
					  })
				  })
			})

          $("body").on("click",".before",function(){
              var that=$(this);
              var s=that.parent().parent().parent().parent().prev();
			  if (s.length==1){
                 var id1=that.parent().next().next().val();
                 var id2=s.find("input").eq(1).val();
                  $.post("test/change",{id1:id1,id2:id2},function(res){
                      if (res.code==200){
                          var a = that.parent().next().next().next().val()
                          that.parent().next().next().next().val(s.find("input").eq(2).val())
                          s.find("input").eq(2).val(a)
                          that.parent().parent().parent().parent().after(s);
					  }
				  })
			 }
          })


          $("body").on("click",".last",function(){
              var that=$(this);
              var s=that.parent().parent().parent().parent().next();
              if (s.length==1){
                  var id1=that.parent().next().next().val();
                  var id2=s.find("input").eq(1).val();
                  $.post("test/change",{id1:id1,id2:id2},function(res){
                      if (res.code==200){
                          var a = that.parent().next().next().next().val()
                          that.parent().next().next().next().val(s.find("input").eq(2).val())
                          s.find("input").eq(2).val(a)
                          that.parent().parent().parent().parent().before(s);
                      }
                  })
              }
          })



      }
	});


  
	</script>
	
</body>
</html>

