<%@page contentType="text/html; charset=utf-8" language="java" %>
<%
   String path = request.getContextPath();
   String basePath = request.getScheme() + "://" + request.getServerName() +":"+request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
  <base href="<%=basePath%>">
  <meta charset="utf-8">
  <title>登入</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
  <link rel="stylesheet" href="layuiadmin/style/login.css" media="all">
</head>
<body>
  <div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">

    <div class="layadmin-user-login-main">
      <div class="layadmin-user-login-box layadmin-user-login-header">
        <h2>内部管理系统</h2>
        <p>知治科技出品的后台管理模板系统</p>
      </div>
      <form class="layadmin-user-login-box layadmin-user-login-body layui-form">
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>
          <input type="text" autocomplete="off" id="username" id="LAY-user-login-username" lay-verify="required" placeholder="用户名" class="layui-input">
        </div>
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
          <input type="password" autocomplete="off" id="password" id="LAY-user-login-password" lay-verify="required" placeholder="密码" class="layui-input">
        </div>

        <div class="layui-form-item">
          <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="LAY-user-login-submit">登 入</button>
        </div>
        <div class="layui-trans layui-form-item layadmin-user-login-other">

        </div>
      </form>
    </div>
    
    <div class="layui-trans layadmin-user-login-footer">

    </div>
    
  </div>

  <script src="layuiadmin/layui/layui.js"></script>
  <script>
  layui.config({
    base: 'layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'user'], function(){
    var $ = layui.$
    ,setter = layui.setter
    ,admin = layui.admin
    ,form = layui.form
    ,router = layui.router()
    ,search = router.search;

    form.render();




    //提交
    form.on('submit(LAY-user-login-submit)', function(obj){
        var username=$("#username").val();
        var password=$("#password").val();
          $.ajax({
              url:"login/login"
              ,data:{username:username,password:password}
              ,type:"POST"
              ,success:function (res) {
                  if (res.code==200){
                      window.location.href="index/to_index";
                  }else{
                      layer.msg("请检查账号密码是否正确")
                  }
              }
          })
      return false;
    });
      var flag='${flag}';
      if (flag==1){
          layer.msg("您未登录或账号在异地登录")
      }

     $.post("login/confirm",function(res){
         if (res.code==200){
             window.location.href="index/to_index";
         }
     })




  });
  </script>
</body>
</html>