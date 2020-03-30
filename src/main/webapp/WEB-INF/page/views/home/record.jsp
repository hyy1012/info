<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/10 0010
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
        String path=request.getContextPath();
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>人员变动</title>
    <base href="<%=basePath%>">
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
                    <label class="layui-form-label">姓名</label>
                    <div class="layui-input-inline">
                        <input id="name" type="text" name="username" placeholder="请输入" autocomplete="off" class="layui-input">
                    </div>
                </div>

                <div class="layui-inline">
                    <button id="search" class="layui-btn layuiadmin-btn-comm"  lay-filter="LAY-app-contcomm-search">
                        <i class="layui-icon layui-icon-search layuiadmin-button-btn"></i>
                    </button>
                </div>
            </div>
        </div>
        <div class="layui-card-body">

            <table id="test" lay-filter="test"></table>

        </div>
    </div>
</div>

<script src="layuiadmin/layui/layui.js"></script>
<script>



    layui.config({
        base: 'layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'contlist', 'table'], function(){
        var $ = layui.$
            ,form = layui.form
            ,table = layui.table;

        function PrefixInteger(num, m) {
            return (Array(m).join(0) + num).slice(-m);
        }

        table.render({
            elem: '#test'
            ,id:'pays'
            ,url:'change/getAllChange'
            ,title: '用户数据表'
            ,cols: [[
                {field:'pcName', title:'姓名' }
                ,{field:'pcType', title:'类型',templet:function (d) {
                    //1 离职 2转正 3晋升 4降职 5转岗 6复职 7入职 8部门调动
                        if (d.pcType==1){
                             return "离职"
                        }else if(d.pcType==2){
                            return "转正"
                        }else if(d.pcType==3){
                            return "晋升"
                        }else if(d.pcType==4){
                            return "降职"
                        }else if(d.pcType==5){
                            return "转岗"
                        }else if(d.pcType==6){
                            return "复职"
                        }else if(d.pcType==7){
                            return "入职"
                        }else if(d.pcType==8){
                            return "部门调动"
                        }else{
                            return "未知"
                        }
                    }},
                {field:'pcContent', title:'变动内容', width:'40%' },
                {field:'pcDate', title:'变动时间'}
            ]],
            page:true
        });


        $("#search").click(function(){
         //   var number=$("#number").val();
            var name=$("#name").val();
                table.reload('pays',{
                    where:{
                        name:name
                    }
                })

        })

    });
</script>
</body>
</html>

