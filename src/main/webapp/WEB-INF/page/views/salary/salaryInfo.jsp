<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=utf-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>员工信息</title>
    <base href="<%=basePath%>">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/soulTable.css" media="all">
    <link rel="stylesheet" href="css/toast.css"/>
    <script src="js/jquery-2.1.4.js"></script>
    <script src="js/LodopFuncs.js"></script>
</head>
<body>
<ul class="sidebar hidden-xs">
    <a href="tel:0574-63559457" class="tra"><i class="rtico layui-icon layui-icon-chat"></i>咨询<span class="sbr-400 tra"
                                                                                                    style="height: 108px;padding-top: 10px;left: -117px;"><img
            src="layuiadmin/img/person.png" alt=""></span></a>
    <a href="tel:0574-63559457" class="tra"><i class="rtico layui-icon layui-icon-login-wechat"
                                               style="color: #fff;"></i>微信<span class="sbr-400 tra"
                                                                                style="height: 108px;padding-top: 10px;left: -117px;"><img
            src="layuiadmin/img/weixin.png" alt=""></span></a>
    <a href="tel:0574-63559457" class="tra"><i class="rtico layui-icon layui-icon-cellphone"></i>电话<span
            class="sbr-400 tra"><i class="r-arr-b"></i>0574-63559457</span></a>
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
    <div class="layui-form">
    <div class="layui-row">
        <div class="layui-col-md12">
            <h2>员工信息</h2>
            <div class="demoTable" style="margin-top: 10px;">
                姓名：
                <div class="layui-inline">
                    <input class="layui-input" id="name" name="id" id="demoReload" autocomplete="off">
                </div>
                职务：
                <div class="layui-inline">
                  <select id="zhiwei">
                      <option value="">已审核</option>
                      <option value="2">未审核</option>
                      <option value="1">实习</option>
                      <option value="3">试用</option>
                      <option value="4">正式员工</option>
                      <option value="5">副主管</option>
                      <option value="6">副经理</option>
                      <option value="7">副总经理</option>
                      <option value="8">总经理</option>
                      <option value="9">离职</option>
                  </select>
                    <input type="hidden" id="selzhiwei"></input>
                </div>
                <button class="layui-btn" id="search" data-type="reload">搜索</button>
            </div>
            <button class="layui-btn addNew" style="margin-top: 10px;">添加员工</button>
            <button class="layui-btn imAndEx" style="margin-top: 10px;">选择导入</button>
            <button type="button" class="layui-btn" style="margin-top: 10px;" id="exportSel"><i class="layui-icon"></i>批量导出</button>
            <button type="button" class="layui-btn" style="margin-top: 10px;" id="exportAll">全部导出</button>
            <button type="button" class="layui-btn" style="margin-top: 10px;" id="exportWord">Word导出</button>
            <table class="layui-hide" id="demo" lay-filter="test"></table>

        </div>
    </div>
    </div>
</div>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
    <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script src="layuiadmin/layui/layui.js"></script>
<script>
    /*layui.config({
        version: '1575889601624' //为了更新 js 缓存，可忽略
    });*/
    layui.config({
        base: 'layuiadmin/ext/',   // 模块目录
    }).extend({
        soulTable: 'soulTable'  // 模块别名
    });

    layui.use(['laydate', 'laypage', 'layer', 'table', 'carousel', 'upload', 'element', 'slider', 'soulTable'], function(){
        var laydate = layui.laydate //日期
            ,laypage = layui.laypage //分页
            ,layer = layui.layer //弹层
            ,table = layui.table //表格
            ,carousel = layui.carousel //轮播
            ,upload = layui.upload //上传
            ,element = layui.element //元素操作
            ,slider = layui.slider //滑块
            ,slider = layui.slider //滑块
            ,soulTable = layui.soulTable

        //监听头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id)
                ,data = checkStatus.data; //获取选中的数据
            switch(obj.event){
                case 'add':
                    layer.msg('添加');
                    break;
                case 'update':
                    if(data.length === 0){
                        layer.msg('请选择一行');
                    } else if(data.length > 1){
                        layer.msg('只能同时编辑一个');
                    } else {
                        layer.alert('编辑 [id]：'+ checkStatus.data[0].id);
                    }
                    break;
                case 'delete':
                    if(data.length === 0){
                        layer.msg('请选择一行');
                    } else {
                        layer.msg('删除');
                    }
                    break;
                default:
                    break;
            };
        });

        //监听行工具事件
        table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'detail'){
                layer.msg('查看操作');
            } else if(layEvent === 'del'){
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);
                    //向服务端发送删除指令
                });
            } else if(layEvent === 'edit'){
                layer.msg('编辑操作');
            }
        });

        //执行一个 table 实例
        table.render({
            elem: '#demo'
            ,height: 420
            ,url: 'salary/getSalary' //数据接口
            ,title: '用户表'
            ,page: true //开启分页
            ,toolbar: 'default'  //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
            ,totalRow: false //开启合计行
            ,cols: [[ //表头
                {type: 'checkbox', fixed: 'left', fixed: 'left'}
                ,{type: 'numbers', title: '序号', width:80, totalRowText: '合计：', fixed: 'left'}
                ,{field: 'name', title: '姓名', width:80, fixed: 'left', filter: true}
                ,{field: 'department', title: '部门', width: 90, sort: true, totalRow: true, filter: true}
                ,{field: 'post', title: '职位', width:80, sort: true, filter: true}
                ,{field: 'status', title: '职务', width: 80, sort: true, totalRow: true, filter: true}
                ,<c:forEach items="${test }" var="t" varStatus="tStatus">
                    {field: 'price', title: '${t.name }', width:150,
                        templet: function (d) {
                            return d.price[${tStatus.index}]
                        }
                    }
                    ,
                </c:forEach>
                {field: 'wealth', title: '财富', width: 135, sort: true, totalRow: true}
                ,{fixed: 'right', width: 165, align:'center', toolbar: '#barDemo'}
            ]]
            ,filter: {
                items:['column', 'clearCache'] // 加入了清除缓存按钮
                ,cache: true
            }
            ,done: function(res, curr, count){
                //如果是异步请求数据方式，res即为你接口返回的信息。
                //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、curr为当前页码、count为数据总长度
                console.log(soulTable)
                soulTable.render(this)
            }
        });

    });
</script>
</body>
</html>