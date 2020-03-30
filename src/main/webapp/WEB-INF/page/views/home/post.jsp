<%@page contentType="text/html; charset=utf-8" language="java" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() +":"+request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>岗位信息</title>
	<base href="<%=basePath%>">
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all"><link rel="stylesheet" href="css/toast.css"/>
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
					<h2>岗位信息 </h2>
                    <h6>点击岗位名跳转到试卷编辑页面</h6>
                    <button class="layui-btn addNew" style="margin-top: 10px;">添加岗位</button>
					<button class="layui-btn importNew" style="margin-top: 10px;">导入</button>
					<button class="layui-btn exportNew" style="margin-top: 10px;">导出</button>
					<table class="layui-hide" id="test" lay-filter="test"></table>
				</div>
			</div>
   </div>

	<script type="text/html" id="im_ex_toast">
		<div class="Toast">
			<div id="" class="layui-layer-content">
				<div class="memberupdown row">
					<div class="col-xs-6 updowndescription">
						<ul class="description">
							<li>
								<h5 class="text-center">说明</h5>
							</li>
							<li class="descriptionli">
								<p>
									<b>1.</b>sheet名称为岗位名称
									<br><b>2.</b>单数行依次为题目, 分值, 类型
									<br><b>3.</b>类型用数字表示: 1为单选, 2位多选
									<br><b>4.</b>分值列在导入时可以不填,已答案中最高分为准
									<br><b>5.</b>双数行第一个单元格为空, 其余依次为答案, 分值
								</p>
							</li>
						</ul>
					</div>
					<div class="col-xs-6 updownmemberlist">
						<div class="updownmemberlistbox">
							<div class="col-xs-6">
								<ul class="downtemplate">
									<li class="templatestep">
										<i class="step1">1</i>
									</li>
									<li class="templatecenter">
										<a href="excel/exportExcel" class="producttemplate"
										   style="background: url(http://reg.25175.com/share/dowload.png) no-repeat;"></a>
									</li>
									<li class="templatestep">下载模板</li>
								</ul>
							</div>
							<div class="col-xs-6">
								<ul class="downtemplate">
									<li class="templatestep">
										<i class="step1">2</i>
									</li>
									<li class="templatecenter">
										<a href="javascript:void(1);"
										   style="background: url(http://reg.25175.com/share/upload.png) no-repeat;">
											<input class="file updowmmemberlist" type="file" name="fileToUpload3" id="fileToUpload3" value=""
												   onchange="fileChange()" accept="application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet">
										</a>
									</li>

									<li class="templatestep" id="jlname">简历导入</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</script>

   <script type="text/html" id="addNew_role" >
    	<div class="layui-col-md12" style="margin-top: 20px">
    			<form action="" method="" class="layui-form">
    				<div class="layui-form-item">
    					<label class="layui-form-label">岗位名</label>
    					<div class="layui-input-inline">
    						<input name="name" type="text" lay-verify="required"  autocomplete="off"  class="layui-input" value="">
    					</div>
    				</div>
					<button id="add" lay-submit lay-filter="addnew" style="display: none">提交</button>
				</form>
    		</div>
    	
    </script>


	<script type="text/html" id="editNew_role" >
		<div class="layui-col-md12" style="margin-top: 20px">
			<form action="" method="" class="layui-form">
				<div class="layui-form-item">
					<label class="layui-form-label">岗位名</label>
					<div class="layui-input-inline">
						<input id="username" name="username" type="text"  autocomplete="off" lay-verify="required" class="layui-input" value="">
					</div>
				</div>

				<input type="hidden" id="editId">
				<button id="ediit" lay-submit lay-filter="addnew1" style="display: none">提交</button>
			</form>
		</div>

	</script>
    <script type="text/html" id="checkboxTpl">
        <!-- 这里的 checked 的状态只是演示 -->
        <input type="checkbox" name="是否开启" value="{{d.npId}}" lay-skin="switch" lay-text="是|否" lay-filter="lockDemo"  {{ d.npSign == 1 ? 'checked' : '' }}  />
    </script>
	<script type="text/html" id="barTool">
  	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  	<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
  </script>
  <script src="layuiadmin/layui/layui.js"></script>
  <script src="js/jquery-2.1.4.js"></script>
  <script>
  layui.config({
    base: 'layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index','jquery','table','form','laydate','set'],function(){
		var $ = layui.jquery,table=layui.table,form=layui.form,laydate=layui.laydate;
      laydate.render({
          elem:"#date"
      })
      laydate.render({
          elem:"#date5"
      })
	  var index1 = ""
      $('.addNew').click(function(){
          index1=layer.open({
              title:"添加岗位",
              area:["400px"],
              type:1,
              shadeClose:true,
              btn:["确定","取消"],
              content:$('#addNew_role').html(),
              yes:function(index){
               $("#add").click()
              }
          })
      })

	  $('.importNew').click(function () {
		  index1 = layer.open({
			  title: "选择导入",
			  area: ["700px", "550px"],
			  type: 1,
			  shadeClose: true,
			  btn: ["确定", "取消"],
			  content: $('#im_ex_toast').html(),
			  yes: function (index) {
				  //找到所有文件
				  var files = $('#fileToUpload3')[0].files;
				  var file = files[0];
				  if (file == null)
				  	return
				  //创建 FormData 对象
				  var frm = new FormData();
				  frm.append("file", file);
				  var index = layer.load();
				  //利用JQuery的ajax方法发送formData对象
				  $.ajax({
					  url:'post/importExcel',
					  type:'POST',
					  dataType: 'json',
					  data: frm, //ajax方法发送formData对象
					  processData: false,//JQuery不要出来frm数据
					  contentType: false,
					  beforeSend: function () { index; },
					  complete: function () { layer.close(index); },
					  success:function(obj){
						  if (obj.code==200){
							  /*var msg = obj.msg.replace(/\n/g,"<br>");*/
							  table.reload('inner')
							  layer.alert(obj.msg);
							  layer.close(index1);
						  }else {
							  layer.alert(obj.msg);
							  layer.close(index1);
						  }
					  }
				  });
			  }
		  })
	  })

	  $(".exportNew").click(function () {
		  var checkStatus = table.checkStatus('inner');
		  var ids = [];
		  for (var i in checkStatus.data)
			  ids.push(checkStatus.data[i].npId);
		  if (ids.length >= 1)
			  window.location.href = "post/exportExcelSel?ids="+ids;
		  else
			  layer.alert("请选择试卷")
	  })

      form.on('submit(addnew)', function(data){
		  var field = data.field;
          var npName = field.name;
          $.ajax({
			  url:'post/add'
			  ,type:'POST'
			  ,data:{npName:npName}
			  ,success:function(res){
                  if (res.code==200){
                      layer.msg("添加成功")
					  layer.close(index1)
                      table.reload('inner')
                  }else{
                      layer.msg("添加失败,岗位不能重复")
                  }

			  }
			  ,error:function (res) {
				  console.log("未知错误");
              }
		  })

          return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
      });


      form.on('submit(addnew1)', function(data){
          var field = data.field;
          var npName = field.username;
          var aId=$("#editId").val()
          console.log(npName)
          console.log(aId)
          $.ajax({
              url:'post/edit'
              ,type:'POST'
              ,data:{npId:aId,npName:npName}
              ,success:function(res){
                  if (res.code==200){
                      layer.msg("修改成功")
                      layer.close(index1)
                      table.reload('inner')
                  }else{
                      layer.msg("修改失败,员工岗位不能重复")
                  }

              }
              ,error:function (res) {
                  console.log("未知错误");
              }
          })

          return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
      });
      table.on("tool(test)",function(obj){
          var data = obj.data; //获得当前行数据
          var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
          var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
          console.log(data)
          if(layEvent === 'del'){
              layer.confirm("确认要删除吗？",function (index) {
                  $.post("post/delete",{id:data.npId},function (res) {
                      if (res.code==200){
                          layer.msg("删除成功")
                          table.reload('inner')
                      }else{
                          layer.msg("删除失败")
                      }
                  })

                  layer.close(index);
              })
          }else if(layEvent==='edit'){

              index1=layer.open({
                  title:"修改岗位",
                  area:["400px"],
                  type:1,
                  shadeClose:true,
                  btn:["确定","取消"],
                  content:$('#editNew_role').html(),
                  yes:function(index){
                   $("#ediit").click();
                  }
              })
			  $("#username").val(data.npName)
			  $("#editId").val(data.npId)
          }else if(layEvent==='jump'){
              var url = 'test/toTest?pid='+data.npId
              parent.layui.index.openTabsPage(url, data.npName);
          }
      })

      $("#search").click(function () {
          var s = $("#name").val()
          table.reload('inner',{
              where:{
                  name:s
              }
          })
      })

      table.render({
          id:'inner'
          ,elem: '#test'
          ,url:'post/getAllPost'
          ,cols: [[
			  {type: 'checkbox', width: 70, title: ''}
              ,{type:'numbers', width:70, title: '序号'}
              ,{field:'npName',event:'',  title: '岗位名'}
              ,{field:'sex',  title: '是否招聘', templet: '#checkboxTpl', unresize: true}
              ,{field:"left",title:"操作",toolbar:"#barTool"}
          ]]
      });

      //监听锁定操作
      form.on('switch(lockDemo)', function(obj){
          console.log(this.checked)
          console.log(obj)
          layer.tips( this.name + '：'+ obj.elem.checked, obj.othis);
          var ss=obj.elem.checked;
          if (ss){
              $.post("post/edit",{npId:this.value,npSign:1})
          }else{
              $.post("post/edit",{npId:this.value,npSign:2})
          }
/*
          $.post("mainPlan/editStatus",{id:this.value,b:obj.elem.checked})
*/

      });

  });
  </script>
<script>
	function fileChange(){
		var files = $('#fileToUpload3')[0].files;
		for(var i=0; i<files.length; i++){
			var file = files[i];
			var regExp=new RegExp('^(.+?)\\.(xls|xlsx)$',"i")
			var result=regExp.test(file.name);
			if (!result){
				alert("请选择正确格式的excel文件（xls|xlsx）");
				$("#fileItem").val("");
				return
			}
			$('#jlname').html(file.name);
		}
	}
</script>
</body>
</html>