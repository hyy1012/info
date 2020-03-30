<%@page contentType="text/html; charset=utf-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>员工资料</title>
    <base href="<%=basePath%>">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="css/city-picker.css"/>
    <script src="js/jquery-2.1.4.js"></script>
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

    </style>
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

<div class="layui-fluid" style="padding-bottom: 50px;">
    <div class="layui-row layui-col-space15">

        <div class="layui-row personal ">
            <div class="layui-col-xs12">
                <div class="grid-demo grid-demo-bg1" style="width: 1200px; background-color: #FFFFFF;padding: 30px;">
                    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
                        <legend>字段列表&nbsp;&nbsp;&nbsp;&nbsp;<i id="addJob" class="layui-icon" style="font-size: 25px;">&#xe654;</i>
                        </legend>
                    </fieldset>
                    <form class="layui-form" action="" id="edit_def">
                        <div class="layui-form-item" style="margin-left: 70px">
                            <input type="checkbox" id="eIdef1" lay-filter="eIdef1" name="eIdef1" title="数值1" lay-skin="primary">
                            <input type="checkbox" id="eIdef2" name="eIdef2" title="数值2" lay-skin="primary">
                            <input type="checkbox" id="eDdef1" name="eDdef1" title="时间1" lay-skin="primary">
                            <input type="checkbox" id="eDdef2" name="eDdef2" title="时间2" lay-skin="primary">
                            <input type="checkbox" id="eSdef1" name="eSdef1" title="文本1" lay-skin="primary">
                            <input type="checkbox" id="eSdef2" name="eSdef2" title="文本2" lay-skin="primary">
                            <input type="checkbox" id="eTadef1" name="eTadef1" title="文本域1" lay-skin="primary">
                            <input type="checkbox" id="eTadef2" name="eTadef2" title="文本域2" lay-skin="primary">
                        </div>

                        <div class="layui-form-item">
                            <div class="layui-inline">
                                <label class="layui-form-label">数值1</label>
                                <div class="layui-input-inline">
                                    <input type="tel" name="eIdef1n" lay-verify="" autocomplete="off"
                                           id="eIdef1n" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">数值2</label>
                                <div class="layui-input-inline">
                                    <input type="tel" name="eIdef2n" lay-verify="" autocomplete="off"
                                           id="eIdef2n" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">时间1</label>
                                <div class="layui-input-inline">
                                    <input type="tel" name="eDdef1n" lay-verify="" autocomplete="off"
                                           id="eDdef1n" class="layui-input">
                                </div>
                            </div>
                        </div>

                        <div class="layui-form-item">
                            <div class="layui-inline">
                                <label class="layui-form-label">时间2</label>
                                <div class="layui-input-inline">
                                    <input type="tel" name="eDdef2n" lay-verify="" autocomplete="off"
                                           id="eDdef2n" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">文本1</label>
                                <div class="layui-input-inline">
                                    <input type="tel" name="eSdef1n" lay-verify="" autocomplete="off"
                                           id="eSdef1n" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">文本2</label>
                                <div class="layui-input-inline">
                                    <input type="tel" name="eSdef2n" lay-verify="" autocomplete="off"
                                           id="eSdef2n" class="layui-input">
                                </div>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <div class="layui-inline">
                                <label class="layui-form-label">文本域1</label>
                                <div class="layui-input-inline">
                                    <input type="tel" name="eTadef1n" lay-verify="" autocomplete="off"
                                           id="eTadef1n" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">文本域2</label>
                                <div class="layui-input-inline">
                                    <input type="tel" name="eTadef2n" lay-verify="" autocomplete="off"
                                           id="eTadef2n" class="layui-input">
                                </div>
                            </div>
                        </div>

                        <button type="submit" class="layui-btn" id="editDef" style="margin-left: 70px"
                                lay-submit="" lay-filter="demo1">确认提交
                        </button>
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

<script src="layuiadmin/layui/layui.js"></script>
<script>
    layui.config({
        base: 'layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'console', 'jquery', 'table', 'laydate', 'form', 'layer'], function () {
        var $ = layui.jquery, table = layui.table, laydate = layui.laydate;
        var layer = layui.layer;
        var form = layui.form;

        form.on('submit(demo1)', function (data) {
            // 确定请求路径
            var url = "home/edit_def";
            // 从输入框等控件中获取请求参数
            var fdata = $("#edit_def").serialize();
            console.log("fdata:  "+fdata);
            // 通过AJAX发送请求，处理结果
            $.ajax({
                "url": url,
                "data": fdata,
                "type": "POST",
                "dataType": "json",
                "success": function (obj) {
					layer.alert(obj.msg);
                },
                "error": function () {
                }
            });
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });

    });


</script>
<script type="text/javascript">
    function initDef(user) {
		for (var i in user) {
			if (user[i] == "on") {
				$("#" + i).prop("checked", true);
			} else if (user[i] != ""){
				$("#" + i).val(user[i]);
			}
		}
    }
    function loadDef() {
        var url = "home/show_def";
        $.ajax({
            "url": url,
            "type": "GET",
            "dataType": "json",
            "success": function (obj) {
                if (obj.code == 200) {
                    initDef(obj.userEnable);
                } else {
                    alert(obj.msg);
                }
            },
            "error": function () {
            }
        });
    }

    window.onload = loadDef();
</script>

</body>
</html>

