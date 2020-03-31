<%@page contentType="text/html; charset=utf-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="css/toast.css"/>
    <script src="js/jquery-2.1.4.js"></script>
    <script src="js/LodopFuncs.js"></script>
</head>
<body>
<!-- 底部区域 -->
<c:import url="../system/footer.jsp"></c:import>
<div class="layui-fluid" style="padding-bottom: 50px;">
    <div class="layui-form">
        <div class="layui-row">
            <div class="layui-col-md12">
                <h2>项目立项申请列表</h2>
                <div class="demoTable" style="margin-top: 10px;">
                    项目编号：
                    <div class="layui-inline">
                        <input class="layui-input" id="pCode" name="id" id="pCode" autocomplete="off">
                    </div>
                    项目名称：
                    <div class="layui-inline" style="width: 300px">
                        <input class="layui-input" id="pName" name="id" id="pName" autocomplete="off">
                    </div>
                    <button class="layui-btn" id="search" data-type="reload">搜索</button>
                    <c:if test="${user.aStatus == 4}">
                        <a lay-href="project/newp?uAid=${user.aId}" class="layui-btn" id="newp" data-type="reload">新建项目</a>
                    </c:if>
                </div>
                <table class="layui-hide" id="test" lay-filter="test"></table>
            </div>
        </div>
    </div>
</div>

<script type="text/html" id="barTool">
    <a class="layui-btn layui-btn-xs" lay-href="project/item?pCode={{d.pCode}}">查看</a>
<%--    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>--%>
</script>
<script src="layuiadmin/layui/layui.js"></script>
<script>
    layui.config({
        base: 'layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'jquery', 'table', 'form', 'laydate', 'set', 'upload'], function () {
        var $ = layui.jquery, table = layui.table, form = layui.form, laydate = layui.laydate, upload = layui.upload;
        laydate.render({
            elem: "#date"
        })
        laydate.render({
            elem: "#date5"
        })
        var index1 = ""
        $('.addNew').click(function () {
            index1 = layer.open({
                title: "添加员工",
                area: ["400px"],
                type: 1,
                shadeClose: true,
                btn: ["确定", "取消"],
                content: $('#addNew_role').html(),
                yes: function (index) {
                    $("#add").click()
                }
            })

            $.post("inner/getPost", function (res) {
                var content = ""
                if (res.code == 0) {
                    for (var i = 0; i < res.data.length; i++) {
                        content += "<option value='" + res.data[i].npId + "'>" + res.data[i].npName + "</option>"
                    }
                }
                $("#post").html(content)
                form.render("select")
            })

            $.post("inner/getDepart", function (res) {
                var content = ""
                if (res.code == 200) {
                    for (var i = 0; i < res.depart.length; i++) {
                        content += "<option value='" + res.depart[i].nId + "'>" + res.depart[i].nName + "</option>"
                    }
                }
                $("#department").html(content)
                form.render("select")
            })
        })

        //删除多选
        $("#deleteM").click(function () {
            var checkStatus=table.checkStatus('inner');
            var data=checkStatus.data;
            var ids=[];
            for (var i=0;i<data.length;i++){
                ids.push(data[i].aId)
            }
            if (ids.length==0){
                layer.msg("请选择",{offset: '400px'});
                return;
            }
            layer.confirm('真的删除行么',{offset: '400px'},function(index) {
                var url = "inner/deleteMany";
                $.ajax({
                    url:"inner/deleteMany",
                    data:{ids:ids},
                    type:"POST",
                    traditional:true,
                    success:function (res) {
                        if (res.code == 200) {
                            layer.msg("删除成功",{offset: '400px'});
                            table.reload('inner');
                        } else {
                            layer.msg("部分用户已答题，无法删除",{offset: '400px'});
                            table.reload('inner');
                        }
                    }
                })

                layer.close(index);
            });
        })

        //监听排序事件
        table.on('sort(test)', function(obj){ //注：sort 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            console.log(obj.field); //当前排序的字段名
            console.log(obj.type); //当前排序类型：desc（降序）、asc（升序）、null（空对象，默认排序）
            console.log(this); //当前排序的 th 对象

            //尽管我们的 table 自带排序功能，但并没有请求服务端。
            //有些时候，你可能需要根据当前排序的字段，重新向服务端发送请求，从而实现服务端排序，如：
            table.reload('inner', {
                initSort: obj //记录初始排序，如果不设的话，将无法标记表头的排序状态。
                ,where: { //请求参数（注意：这里面的参数可任意定义，并非下面固定的格式）
                    field: obj.field //排序字段
                    ,order: obj.type //排序方式
                    ,status: $("#selzhiwei").val()
                }
            });
        });

        /**
         * Class Name:com.info.n25175_info.controller ChangeController
         * ==========================
         * Author: bill
         * Date: 2020/3/27 0008 20:16
         * Description: $("search").click()修改
         * ==========================
         */
        $("#search").click(function () {
            var s = $("#pCode").val();// pname,pcode
            var n = $("#pName").val();
            table.reload( 'project',{
                page:{
                    curr:1
                },
                where: {
                    pName:n,
                    pCode:s,
                }
            });

        })

        table.render({
            id: 'project'
            ,elem: '#test'
            ,url: 'project/getList'
            ,toolbar: "true"
            , cols: [[
                {type: 'checkbox', width: 70, title: ''}
                , {field: 'pCode', width: 200, title: '项目编号',sort: true}
                , {field: 'pName', width: 360, title: '项目名称', sort: true}
                , {field: 'departName', width: 100, title: '部门', sort: true}
                , {field: 'pPerson', width: 100, title: '负责人', sort: true}
                , {field: 'status', width: 150, title: '项目当前状态',templet: function (d) {
                        if (d.status == 1) {
                            return "已提交"
                        }else if (d.status == 2) {
                            return "初审通过"
                        }else if (d.status == 3) {
                            return "最终审核通过"
                        }else if (d.status == 4) {
                            return "初审驳回"
                        }else if (d.status == 5) {
                            return "最终审核驳回"
                        }else {
                            return ""
                        }
                    }, sort: true}
                , {field: 'createTime', width: 150, title: '项目创建日期', sort: true}
                , {field: "left", title: "操作", toolbar: "#barTool"}
            ]]
            , page: {
                limit: 10,
                layout: ['count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
            }
            , where:{
                id: ${user.aId}
            }
        });

    });

</script>
</body>
</html>