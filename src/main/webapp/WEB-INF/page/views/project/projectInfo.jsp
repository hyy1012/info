<%@page contentType="text/html; charset=utf-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="css/city-picker.css"/>
    <script src="js/jquery-2.1.4.js"></script>
    <script src="js/city-picker.data.js"></script>
    <script src="js/city-picker.js"></script>
    <style type="text/css">
        .grid-demo-bg1 > span {
            margin-bottom: 10px;
            border: 1px solid #009688;
            color: #009688;
            padding: 5px 12px;
            display: inline-block;
        }

        .grid-demo-bg1 > span.on {
            background: #009688;
            color: #fff;
        }

        .grid-demo-bg1 > span:hover {
            cursor: pointer;
        }

        #container {
            min-width:600px;
            min-height:500px;
            padding-top: 55px;
        }

        .requires {
            color:red
        }

    </style>
</head>
<body>

<div class="layui-fluid" style="padding-bottom: 50px;">
    <div class="layui-row layui-col-space15">

        <div class="layui-row personal ">
            <div class="layui-col-xs12">
                <div class="grid-demo grid-demo-bg1" style="width: 1200px; background-color: #FFFFFF;padding: 30px;">
                    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                        <legend>项目立项申请表（项目立项申请表提交后不可修改，请确认正确后提交）</legend>
                    </fieldset>

                    <form class="layui-form" action="" method="post" id="user-profile" onkeydown="if(event.keyCode===13){return false;}">
                        <div class="layui-form-item">
                            <div class="layui-inline"  id="printDiv">
                                <label class="layui-form-label">项目编号</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="pCode" lay-verify="required" autocomplete="off"
                                           id="pCode" class="layui-input" readonly value="${p.pCode}">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">项目名称<span class="requires">*</span></label>
                                <div class="layui-input-inline">
                                    <input id="pName" type="text" name="pName" class="layui-input"
                                           <c:if test="${user.aStatus == 5 || user.aStatus ==6}">readonly</c:if>
                                           style="width: 709px" lay-verify="required" value="${p.pName}">
                                </div>
                            </div>
                        </div>

                        <div class="layui-form-item">
                            <div class="layui-inline">
                                <label class="layui-form-label">部门</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="pDept" lay-verify="required" autocomplete="off"
                                           id="pDept" class="layui-input" readonly value="${p.departName}">
                                    <input type="text" name="dId" lay-verify="required" autocomplete="off"
                                           id="dId" class="layui-input" readonly value="${user.aDepart}" style="display: none">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">负责人</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="pPerson" lay-verify="required" autocomplete="off"
                                           id="pPerson" class="layui-input" readonly value="${p.pPerson}">
                                    <input type="text" name="uAid" lay-verify="required" autocomplete="off"
                                           id="uAid" class="layui-input" readonly value="${user.aId}" style="display: none">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">起止时间<span class="requires">*</span></label>
                                <div class="layui-input-inline" style="width: 180px;">
                                    <input type="text" name="startTime" id="startTime" lay-verify="date1|required"
                                           placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input"
                                           <c:if test="${user.aStatus == 5 || user.aStatus ==6}">disabled</c:if>
                                           value="${p.STime}">
                                </div>
                                <div class="layui-form-mid">-</div>
                                <div class="layui-input-inline" style="width: 180px;">
                                    <input type="text" name="endTime" id="endTime" lay-verify="date2|required"
                                           placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input"
                                           <c:if test="${user.aStatus == 5 || user.aStatus ==6}">disabled</c:if>
                                           value="${p.ETime}">
                                </div>
                            </div>
                        </div>

                        <%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                            <legend>项目概况</legend>
                        </fieldset>--%>

                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">项目概况：<span class="requires">*</span>（项目内容、必要性、效益预测、可行性、主要进度、项目风险及应对策略等等）</label>
                            <div class="layui-input-block">
                                <textarea placeholder="项目概况：（项目内容、必要性、效益预测、可行性、主要进度、项目风险及应对策略等等）"
                                          <c:if test="${user.aStatus == 5 || user.aStatus ==6}">disabled</c:if>
                                          class="layui-textarea" id="pContent" name="pContents">${p.PContent}</textarea>
                            </div>
                        </div>
                        <%--<div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">项目必要性</label>
                            <div class="layui-input-block">
                                <textarea placeholder="请输入内容" class="layui-textarea" id="u_content"
                                          name="uContent"></textarea>
                            </div>
                        </div>
                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">效益预测</label>
                            <div class="layui-input-block">
                                <textarea placeholder="请输入内容" class="layui-textarea" id="u_content"
                                          name="uContent"></textarea>
                            </div>
                        </div>
                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">可行性</label>
                            <div class="layui-input-block">
                                <textarea placeholder="请输入内容" class="layui-textarea" id="u_content"
                                          name="uContent"></textarea>
                            </div>
                        </div>
                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">主要进度</label>
                            <div class="layui-input-block">
                                <textarea placeholder="请输入内容" class="layui-textarea" id="u_content"
                                          name="uContent"></textarea>
                            </div>
                        </div>
                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">项目风险及应对策略</label>
                            <div class="layui-input-block">
                                <textarea placeholder="请输入内容" class="layui-textarea" id="u_content"
                                          name="uContent"></textarea>
                            </div>
                        </div>
                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">其他</label>
                            <div class="layui-input-block">
                                <textarea placeholder="请输入内容" class="layui-textarea" id="u_content"
                                          name="uContent"></textarea>
                            </div>
                        </div>--%>

                        <div class="layui-form-item">
                            <div class="layui-col-xs8">
                                <label class="layui-form-label">公司营销负责人意见</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="fidea" lay-verify="" autocomplete="off" id="fidea"
                                           <c:if test="${user.aStatus == 4 || user.aStatus == 6 }">readonly</c:if>
                                           class="layui-input" style="margin-top: 10px; width: 650px" value="${p.fidea}">
                                </div>
                            </div>
                            <div class="layui-col-xs4" style="margin-top: 10px">
                                <label class="layui-form-label">审批时间</label>
                                <div class="layui-input-inline" style="width: 180px;">
                                    <input type="text" name="pdCheck" id="pdCheck" lay-verify="date1" disabled
                                           placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input" value="${p.pdChecks}">
                                </div>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <div class="layui-col-xs8">
                                <label class="layui-form-label">公司项目投资决策委员会审查意见</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="eidea" lay-verify="" autocomplete="off" id="eidea" value="${p.eidea}"
                                           <c:if test="${user.aStatus == 4 || user.aStatus ==5}">readonly</c:if>
                                           class="layui-input" style="margin-top: 18px; width: 650px">
                                </div>
                            </div>
                            <div class="layui-col-xs4" style="margin-top: 18px">
                                <label class="layui-form-label">审批时间</label>
                                <div class="layui-input-inline" style="width: 180px;">
                                    <input type="text" name="pcCheck" id="pcCheck" lay-verify="date1" disabled value="${p.pcChecks}"
                                           placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                        </div>

                        <div class="layui-form-item">
                            <div class="layui-input-block">
                                <c:if test="${p.status == null}">
                                <button type="submit" lay-submit class="layui-btn" id="commit"  lay-filter="demo1">
                                    立即提交</button>
                                </c:if>
                                <c:if test="${user.aStatus == 5 && p.status == 1}">
                                    <button type="button" lay-submit class="layui-btn" id="fchecky"
                                            onclick="sendcheck('fideay')">审批通过</button>
                                    <button type="button" lay-submit class="layui-btn layui-btn-danger" id="fcheckn"
                                            onclick="sendcheck('fidean')">驳回</button>
                                </c:if>
                                <c:if test="${user.aStatus == 6 && p.status == 2}">
                                    <button type="button" lay-submit class="layui-btn" id="echecky"
                                            onclick="sendcheck('eideay')">审批通过</button>
                                    <button type="button" lay-submit class="layui-btn layui-btn-danger" id="echeckn"
                                            onclick="sendcheck('eidean')">驳回</button>
                                </c:if>
                                <%--<button type="button" class="layui-btn layui-btn-normal" id="save">保存</button>--%>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>
</div>
<!--footer-->
<footer class="footer">
		<span class="footer-brand">
			<a href="javascript:;" target="_blank"><strong class="text-danger">知治科技</strong></a>&nbsp;提供技术支持
		</span>
    <p class="no-margin">
        &copy;by <a href="javascript:;" target="_Blank"><strong>zzkj</strong></a>
    </p>
</footer><!-- /footer -->


<script src="layuiadmin/layui/layui.js"></script>
<script src="js/ace.js"></script>
<script type="text/template" id="address">
    <div class="layui-block" id="addaddr" style="margin: 5px 0">
        <label class="layui-form-label">地址</label>
        <div class="layui-inline" style="width: 650px" id="addaddri"></div>
    </div>
    <div id="container"></div>
</script>
<script>
    layui.config({
        base: 'layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'console', 'jquery', 'table', 'laydate', 'form', 'common', 'layedit'], function () {
        var $ = layui.jquery, table = layui.table, laydate = layui.laydate, client = true, common = layui.common;
        var form = layui.form;
        var layer = layui.layer;
        var layedit = layui.layedit;

        //日期
        laydate.render({ elem: '#startTime' });
        laydate.render({ elem: '#endTime' });
        laydate.render({ elem: '#pdCheck' });
        laydate.render({ elem: '#pcCheck' });

        $("#photoImage").click(function () {
            //console.log($("#dddd").val())
            $("#uPicture").click();
        });

        form.on('submit(demo1)', function(data){
            var fdata = $("#user-profile").serialize();
            var pContent = layedit.getContent(ieditor);
            $.ajax({
                "url": "project/commit",
                "data": fdata + "&pContent=" + pContent,
                "type": "POST",
                "dataType": "json",
                "success": function(data) {
                    if (data.code == 200) {
                        layer.alert(data.msg,{offset: '300px'},
                            function(index, layero) {
                                //关闭当前标签页
                                parent.layui.admin.events.closeThisTabs()
                        });
                    } else {
                        layer.alert(data.msg,{offset: '300px'},
                            function(index, layero) { parent.layui.admin.events.closeThisTabs() });
                    }
                }
            });
            return false;
        });

        $("#dcheckn").click(function(){
            $.ajax({
                "url": "project/dcheck",
                "data": "fidean=" + $("#fidea").val(),
                "type": "POST",
                "dataType": "json",
                "success": function(data) {
                    if (data.code == 200) {
                        layer.alert(data.msg,{offset: '300px'},
                            function(index, layero) { parent.layui.admin.events.closeThisTabs() });
                    } else {
                        layer.alert(data.msg,{offset: '300px'},
                            function(index, layero) { parent.layui.admin.events.closeThisTabs() });
                    }
                }
            });
        })

        layedit.set({
            devmode: true
            //插入代码设置
            , codeConfig: {
                hide: true,  //是否显示编码语言选择框
                default: 'javascript' //hide为true时的默认语言格式
            }, tool: [
                'html', 'code', 'strong', 'italic', 'underline', 'del', '|',
                'left', 'center', 'right', '|', 'link', 'unlink'
                , '|', 'fullScreen'
            ], height: '90%'
        });
        var ieditor = layedit.build('pContent',{height: 600});

    });

</script>
<script type="text/javascript">
    function sendcheck(idea){
        switch (idea) {
            case "fideay":
                var datas = "fideay=" + $("#fidea").val();
                break
            case "fidean":
                var datas = "fidean=" + $("#fidea").val();
                break
            case "eideay":
                var datas = "eideay=" + $("#eidea").val();
                break
            case "eidean":
                var datas = "eidean=" + $("#eidea").val();
                break
        }
        $.ajax({
            "url": "project/check",
            "data": datas + "&pCode=" + $("#pCode").val(),
            "type": "POST",
            "dataType": "json",
            "success": function(data) {
                if (data.code == 200) {
                    layer.alert(data.msg,{offset: '300px'},
                        function(index, layero) { parent.layui.admin.events.closeThisTabs() });
                } else {
                    layer.alert("未知错误,请联系管理员",{offset: '300px'},
                        function(index, layero) { parent.layui.admin.events.closeThisTabs() });
                }
            }
        });
    }

    function ajax(url, datas){
        $.ajax({
            "url": url,
            "data": datas,
            "type": "POST",
            "dataType": "json",
            "success": function(data) {
                if (data.code == 200) {
                    layer.alert(data.msg,{offset: '300px'},
                        function(index, layero) { parent.layui.admin.events.closeThisTabs() });
                } else {
                    layer.alert(data.msg,{offset: '300px'},
                        function(index, layero) { parent.layui.admin.events.closeThisTabs() });
                }
            }
        });
    }

    $('#save').click(function(){
        var fdata = $("#user-profile").serialize();
        // 提交登录
        $.ajax({
            "url": "project/save",
            "data": fdata,
            "type": "POST",
            "dataType": "json",
            "success": function(obj) {
                if (obj.state == 1) {
                } else {
                }
            }
        });
    });

    function tensl(name) {
        var url = "home/tensl";
        if(name.match(/^[\u4e00-\u9fa5]+$/)){
            $.ajax({
                "url": url,
                "data": "name="+name,
                "type": "GET",
                "dataType": "json",
                "success": function (name) {
                    $("#schools").children().remove();
                    for (var i in name) {
                        var option = $('<option>').html(name[i]);
                        $("#schools").append(option);
                    }
                },
                "error": function () {
                }
            });
        }
    }

    $("#u_treatment").blur(function(){
        $("#hc_select").next().find("dl").css({ "display": "none" });
    })
</script>
</body>
</html>



