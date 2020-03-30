<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/8 0008
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>目录菜单</title>
    <base href="<%=basePath%>">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/template.css" media="all">
    <script src="js/jquery-2.1.4.js"></script>
    <style>
        * {
            font-family: FangSong;
            font-weight: bold;
            font-size: 18px;
        }
    </style>
</head>
<body>

<div class="layui-fluid layadmin-message-fluid">
    <div class="layui-row">
        <div class="layui-col-md12">
            <div class="layui-card-header">
                <button class="layui-btn layuiadmin-btn-admin" id="add">添加一级</button>
            </div>
            <div id="test1" style="font-size: 15px; margin-left: 1%;"></div>
        </div>
        <div class="layui-row message-content-btn">
        </div>
    </div>
</div>
</div>
<script type="text/template" id="addq">
    <div class="layui-form-item">
        <label class="layui-form-label">版本号</label>
        <div class="layui-input-inline">
            <input id="banben" type="text" name="phone" lay-verify="phone" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>
</script>

<script src="layuiadmin/layui/layui.js"></script>
<script>
    layui.config({
        base: 'layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index']);
    layui.use(['layer', 'tree', 'laypage'], function () {
        var tree = layui.tree;
        var laypage = layui.laypage;

        function GetQueryString(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) return (decodeURI(r[2]));
            return null;
        }

        //渲染
        function xuanran() {
            $.post("depart/getAll", function (res) {
                var inst1 = tree.render({
                    elem: '#test1',     //绑定元素
                    id: 'ceshi',
                    edit: ['add', 'update', 'del'],
                    operate: function (obj) {
                        var type = obj.type; //得到操作类型：add、edit、del
                        var data = obj.data; //得到当前节点的数据
                        var elem = obj.elem; //得到当前节点元素
                        //Ajax 操作
                        var id = data.id; //得到节点索引
                        if (type === 'add') { //增加节点
                            console.log(data)
                            console.log(elem)/*
                            $.post("depart/add",{nPid:id,nName:'未命名'},function (res) {
                                if (res.code==201){
                                    layer.msg("当前最多2级，请勿错误添加")
                                }
                            })*/
                        } else if (type === 'update') { //修改节点
                            $.post("depart/edit", {nId: id, nName: data.title})
                        } else if (type === 'del') { //删除节点
                            console.log(data)
                            console.log(elem)
                        };
                    }, data: res.list
                });
            })
        }
        xuanran()
        $("#add").click(function () {
            var index1 = layer.open({
                type: 1
                , title: '添加一级'
                , content: $("#addq").html()
                , offset: '120px'
                , btn: ['确定', '取消']
                , yes: function (index, layero) {
                    var title = $("#banben").val();
                    $.post("depart/add", {nName: title}, function (res) {
                        if (res.code == 200) {
                            layer.msg("添加成功", {offset: '400px'})
                            xuanran();
                            layer.close(index1);
                        } else {
                            layer.msg("添加失败", {offset: '400px'})
                        }
                    })
                }
            });

        })
    })
</script>
</body>
</html>
