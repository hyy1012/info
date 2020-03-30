<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=utf-8" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() +":"+request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>员工信息</title>
	<base href="<%=basePath%>">
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
</head>
<body>
	<ul class="sidebar hidden-xs">
	<a href="tel:0574-63559457" class="tra"><i class="rtico layui-icon layui-icon-chat"></i>咨询<span class="sbr-400 tra" style="height: 108px;padding-top: 10px;left: -117px;"><img src="layuiadmin/img/person.png" alt=""></span></a>
	<a href="tel:0574-63559457" class="tra"><i class="rtico layui-icon layui-icon-login-wechat" style="color: #fff;"></i>微信<span class="sbr-400 tra" style="height: 108px;padding-top: 10px;left: -117px;"><img src="layuiadmin/img/weixin.png" alt=""></span></a>
	<a href="tel:0574-63559457" class="tra"><i class="rtico layui-icon layui-icon-cellphone"></i>电话<span class="sbr-400 tra"><i class="r-arr-b"></i>0574-63559457</span></a>
	</ul>
	 <footer class="footer">
	 	<span class="footer-brand">
	 		<a href="http://www.25175.net" target="_blank"><strong class="text-danger">顺通网络</strong></a>&nbsp;提供技术支持
	 	</span>
	 	<p class="no-margin">
	 		&copy;by <a href="http://www.25175.net/" target="_Blank"><strong>25175</strong></a>
	 	</p>
	 </footer><!-- /footer -->
	 <div class="layui-fluid" style="padding-bottom: 50px;">
			<div class="layui-row">
				<div class="layui-col-md12">
					<h2>人员信息</h2>
					<div class="demoTable" style="margin-top: 10px;">
						姓名：
						<div class="layui-inline">
							<input id="name" class="layui-input" name="id" id="demoReload" autocomplete="off">
						</div>
						<button class="layui-btn" data-type="reload" id="search">搜索</button>
					</div>
					<%--<button class="layui-btn addNew" style="margin-top: 10px;">添加员工</button>--%>
					<table class="layui-hide" id="test" lay-filter="test"></table>
				</div>
			</div>
   </div>
   <div id="addNew_role" class="layui-row" style="display: none;margin: 20px;">
    	<div class="layui-col-md12">
    			<form action="" method="" class="layui-form">
    				<div class="layui-form-item">
    					<label class="layui-form-label">工号</label>
    					<div class="layui-input-inline">
    						<input type="text"  autocomplete="off" class="layui-input" value="">
    					</div>
    				</div>
    				<div class="layui-form-item">
    					<label class="layui-form-label">姓名</label>
    					<div class="layui-input-inline">
    						<input type="text"  autocomplete="off" class="layui-input" value="">
    					</div>
    				</div>
   				<div class="layui-form-item">
   					<label class="layui-form-label">性别</label>
   					<div class="layui-input-inline">
   						<select name="modules" lay-verify="required">
   							<option value="0">男</option>
   							<option value="1">女</option>
   						</select>
   					</div>
   				</div>
    				<div class="layui-form-item">
    					<label class="layui-form-label">职务</label>
    					<div class="layui-input-inline">
    						<input type="text"  autocomplete="off" class="layui-input" value="">
    					</div>
    				</div>
    				<div class="layui-form-item">
    					<label class="layui-form-label">联系方式</label>
    					<div class="layui-input-inline">
    						<input type="text"  autocomplete="off" class="layui-input" value="">
    					</div>
    				</div>
    				<div class="layui-form-item">
    					<label class="layui-form-label">身份证号</label>
    					<div class="layui-input-inline">
    						<input type="text"  autocomplete="off" class="layui-input" value="">
    					</div>
    				</div>
   				<div class="layui-form-item">
   					<label class="layui-form-label">住址</label>
   					<div class="layui-input-inline">
   						<input type="text"  autocomplete="off" class="layui-input" value="">
   					</div>
   				</div>
   				<div class="layui-form-item">
   					<label class="layui-form-label">底薪</label>
   					<div class="layui-input-inline">
   						<input type="text"  autocomplete="off" class="layui-input" value="">
   					</div>
   				</div>
   				<div class="layui-form-item">
   					<label class="layui-form-label">所属门店</label>
   					<div class="layui-input-inline">
   						<select name="modules" lay-verify="required">
   							<option value="465416546">465416546</option>
   							<option value="99999999">99999999</option>
   							<option value="789789789">789789789</option>
   						</select>
   					</div>
   				</div>
    				<div class="layui-form-item">
    					<label class="layui-form-label">入职时间</label>
    					<div class="layui-input-inline">
    						<input type="text" id="date5" autocomplete="off" class="layui-input" value="">
    					</div>
    				</div>
   				<div class="layui-form-item">
   					<label class="layui-form-label">备注</label>
   					<div class="layui-input-inline">
   						<textarea rows="" cols="" class="layui-textarea"></textarea>
   					</div>
   				</div>
    				<div class="layui-form-item">
    					<label class="layui-form-label">提成模式</label>
    					<div class="layui-input-inline">
    						<select name="modules" lay-verify="required">
    							<option value="0">模式一</option>
    							<option value="1">模式二</option>
    							<option value="2">模式三</option>
    						</select>
    					</div>
    				</div>
    				
    			</form>
    		</div>
    	
    </div>
   
	 <div id="edit" class="layui-row" style="display: none;margin: 20px;">
	 	<div class="layui-col-md12">
	 			<form action="" method="" class="layui-form">
	 				<div class="layui-form-item">
	 					<label class="layui-form-label">工号</label>
	 					<div class="layui-input-inline">
	 						<input type="text"  autocomplete="off" class="layui-input" value="9631">
	 					</div>
	 				</div>
	 				<div class="layui-form-item">
	 					<label class="layui-form-label">姓名</label>
	 					<div class="layui-input-inline">
	 						<input type="text"  autocomplete="off" class="layui-input" value="张三">
	 					</div>
	 				</div>
					<div class="layui-form-item">
						<label class="layui-form-label">性别</label>
						<div class="layui-input-inline">
							<select name="modules" lay-verify="required">
								<option value="0">男</option>
								<option value="1">女</option>
							</select>
						</div>
					</div>
	 				<div class="layui-form-item">
	 					<label class="layui-form-label">职务</label>
	 					<div class="layui-input-inline">
	 						<input type="text"  autocomplete="off" class="layui-input" value="职务一">
	 					</div>
	 				</div>
	 				<div class="layui-form-item">
	 					<label class="layui-form-label">联系方式</label>
	 					<div class="layui-input-inline">
	 						<input type="text"  autocomplete="off" class="layui-input" value="136965201421">
	 					</div>
	 				</div>
	 				<div class="layui-form-item">
	 					<label class="layui-form-label">身份证号</label>
	 					<div class="layui-input-inline">
	 						<input type="text"  autocomplete="off" class="layui-input" value="312521444511200012">
	 					</div>
	 				</div>
					<div class="layui-form-item">
						<label class="layui-form-label">住址</label>
						<div class="layui-input-inline">
							<input type="text"  autocomplete="off" class="layui-input" value="北京大街">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">底薪</label>
						<div class="layui-input-inline">
							<input type="text"  autocomplete="off" class="layui-input" value="5000">
						</div>
					</div>
					<div class="layui-form-item">
						<label class="layui-form-label">所属门店</label>
						<div class="layui-input-inline">
							<select name="modules" lay-verify="required">
								<option value="465416546">465416546</option>
								<option value="99999999">99999999</option>
								<option value="789789789">789789789</option>
							</select>
						</div>
					</div>
	 				<div class="layui-form-item">
	 					<label class="layui-form-label">入职时间</label>
	 					<div class="layui-input-inline">
	 						<input type="text" id="date" autocomplete="off" class="layui-input" value="2019-02-02">
	 					</div>
	 				</div>
					<div class="layui-form-item">
						<label class="layui-form-label">备注</label>
						<div class="layui-input-inline">
							<textarea rows="" cols="" class="layui-textarea">备注</textarea>
						</div>
					</div>
	 				<div class="layui-form-item">
	 					<label class="layui-form-label">提成模式</label>
	 					<div class="layui-input-inline">
	 						<select name="modules" lay-verify="required">
	 							<option value="0">模式一</option>
	 							<option value="1">模式二</option>
	 							<option value="2">模式三</option>
	 						</select>
	 					</div>
	 				</div>
	 				
	 			</form>
	 		</div>
	 	
	 </div>
	<script type="text/html" id="barTool">
		<a class="layui-btn layui-btn-xs" lay-href="outer/toAnswer?id={{d.aId}}" >查看答题情况</a>
		<a class="layui-btn layui-btn-xs" lay-href="home/console?uAid={{d.aId}}">查看个人档案</a>
		{{# if(${user.aRole==0}){ }}
		<%--<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>--%>
  	<a class="layui-btn layui-btn-xs" lay-event="set">设为正式员工</a>
  	<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
		{{# } }}
  </script>
	 <script type="text/html" id="sex_">
		{{# if(d.sex==0){ }}
			男
		{{# }else{ }}
			女
		{{# } }}
	</script>
  <script src="layuiadmin/layui/layui.js"></script>
  <script>
  layui.config({
    base: 'layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index','jquery','table','form','laydate'],function(){
		var $ = layui.jquery,table=layui.table,form=layui.form,laydate=layui.laydate;
		laydate.render({
			elem:"#date"
		})
		laydate.render({
			elem:"#date5"
		})
		$('.addNew').click(function(){
			layer.open({
				title:"添加员工",
				area:["400px","750px"],
				type:1,
				shadeClose:true,
				btn:["确定","取消"],
				content:$('#addNew_role'),
				yes:function(index){
					layer.close(index);
					layer.msg('ok')
				}
			})
		})
		table.on("tool(test)",function(obj){
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
            console.log(data)
            if(layEvent === 'del'){
                layer.confirm("确认要删除吗？",function (index) {
                    $.post("outer/delete",{id:data.aId},function (res) {
                        if (res.code==200){
                            layer.msg("删除成功")
                            table.reload('outer')
                        }else{
                            layer.msg("删除失败")
                        }
                    })

                    layer.close(index);
                })
            }else if(layEvent==='set'){
                layer.confirm("确认要设置正式员工吗？",function (index) {
                    $.post("outer/edit",{aId:data.aId,aRole:2,aStatus:1},function (res) {
                        if (res.code==200){
                            layer.msg("设置成功")
                            table.reload('outer')
                        }else{
                            layer.msg("设置失败")
                        }
                    })

                    layer.close(index);
                })

			}
		})

	  $("#search").click(function () {
	      var s = $("#name").val()
             table.reload('outer',{
                 where:{
                   name:s
				 }
			 })
      })

		table.render({
			id:'outer'
			,elem: '#test'
			,url:'outer/getOuter'
			,cols: [[
				{type:'numbers', width:70, title: '序号'}
				,{field:'name', width:100, title: '姓名'}
				,{field:'sex', width:70, title: '性别',templet:'#sex_'}
				,{field:'treatment', width:100, title: '期望薪资'}
				,{field:'post', width:100, title: '应聘职位'}
				,{field:'aSum', width:100, title: '得分'}
				,{field:'aDate', width:105, title: '创建日期'}
				,{field:'phone', width:120,  title: '手机号'}
				,{field:'aUsername', width:120,title: '账号', }
				,{field:'aPassword',width:120, title: '密码'}
				,{field:"left",title:"操作",toolbar:"#barTool"}
			]]
            ,page: {
                layout: ['count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
            }
		});



	});
  </script>
</body>
</html>