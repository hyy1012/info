<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <title>基础设置</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
</head>
<body>

<div class="layui-fluid">
    <div class="layui-card">
        <div class="layui-form layui-card-header layuiadmin-card-header-auto">
            <div class="layui-form-item">
                <div class="layui-inline">
                    <label class="layui-form-label">分值比</label>
                    <div class="layui-input-block">
                        <input type="text" name="hTitle" placeholder="请输入" autocomplete="off" class="layui-input" id="spot">
                    </div>
                </div>



                <div class="layui-inline">
                    <button class="layui-btn layuiadmin-btn-admin" lay-submit lay-filter="LAY-user-back-search" id="spotC">
                       确认
                    </button>
                </div>
            </div>
        </div>

        </div>
    </div>
</div>



<script src="layuiadmin/layui/layui.js"></script>
<script>
    layui.config({
        base: 'layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'useradmin', 'table','layer'], function(){
        var $ = layui.$
            ,form = layui.form
            ,table = layui.table;
        var layer=layui.layer;
        $.post("param/get",{name:"markToPrice"},function (res) {
            $("#spot").val(res.param.pValue)
        })
        
        
        $("#spotC").click(function () {
            var spot=$("#spot").val();
            layer.confirm("确认要修改吗",function () {
                $.post("param/set",{name:"markToPrice",amount:spot},function (res) {
                   if (res.code==200){
                       layer.msg("修改成功")
                   }
                })
            })
        })


    });
</script>
</body>
</html>

