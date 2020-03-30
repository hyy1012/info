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
                <h2>项目立项申请信息</h2>
                <div class="demoTable" style="margin-top: 10px;">
                    项目编号：
                    <div class="layui-inline">
                        <input class="layui-input" id="name" name="id" id="demoReload" autocomplete="off">
                    </div>
                    项目名字：
                    <div class="layui-inline">
                        <select id="zhiwei">
                            <option value="0">全部</option>
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
                        <input type="hidden" id="selzhiwei" value="0">
                    </div>
                    <button class="layui-btn" id="search" data-type="reload">搜索</button>
                </div>
                <table class="layui-hide" id="test" lay-filter="test"></table>

            </div>
        </div>
    </div>
</div>
<script type="text/html" id="addNew_role">
    <div class="layui-col-md12" style="margin-top: 20px">
        <form action="" method="" class="layui-form">
            <div class="layui-form-item">
                <label class="layui-form-label">姓名</label>
                <div class="layui-input-inline">
                    <input name="name" type="text" lay-verify="required" autocomplete="off" class="layui-input"
                           value="">
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">性别</label>
                <div class="layui-input-inline">
                    <select name="sex" lay-verify="required">
                        <option value="1">男</option>
                        <option value="2">女</option>
                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">岗位</label>
                <div class="layui-input-inline">
                    <select id="post" name="post" lay-verify="required">

                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">职务</label>
                <div class="layui-input-inline">
                    <select id="status" name="status" lay-verify="required">
                        <option value="1">实习</option>
                        <option value="3">试用</option>
                        <option value="4">正式员工</option>
                        <option value="5">副主管</option>
                        <option value="6">副经理</option>
                        <option value="7">副总经理</option>
                        <option value="8">总经理</option>
                        <option value="9">离职</option>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">权限</label>
                <div class="layui-input-inline">
                    <select name="role" lay-verify="required">
                        <option value="2">成员</option>
                        <option value="1">系统管理员</option>
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">部门</label>
                <div class="layui-input-inline">
                    <select id="department" name="department" lay-verify="required">
                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <label class="layui-form-label">手机号</label>
                <div class="layui-input-inline">
                    <input name="phone" type="text" autocomplete="off" lay-verify="phone" class="layui-input" value="">
                </div>
            </div>
            <button id="add" lay-submit lay-filter="addnew" style="display: none">提交</button>
        </form>
    </div>

</script>

<script type="text/html" id="editNew_role">
    <div class="layui-col-md12" style="margin-top: 20px">
        <form action="" method="" class="layui-form">
            <div class="layui-form-item">
                <label class="layui-form-label">账号</label>
                <div class="layui-input-inline">
                    <input id="username" name="username" type="text" autocomplete="off" lay-verify="required"
                           class="layui-input" value="">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">密码</label>
                <div class="layui-input-inline">
                    <input id="password" name="password" type="text" autocomplete="off" lay-verify="pass"
                           class="layui-input" value="">
                </div>
            </div>
            <input type="hidden" id="editId">
            <div class="layui-form-item">
                <label class="layui-form-label">权限</label>
                <div class="layui-input-inline">
                    <select id="role" name="role" lay-verify="required">
                        <option value="2">成员</option>
                        <option value="1">系统管理员</option>
                    </select>
                </div>
            </div>
            <input type="hidden" id="ajnum" name="ajnum">
            <div class="layui-form-item">
                <label class="layui-form-label">职务</label>
                <div class="layui-input-inline">
                    <select id="sa"  name="status" lay-verify="required">
                        <option value="1">实习</option>
                        <option value="3">试用</option>
                        <option value="4">正式员工</option>
                        <option value="5">副主管</option>
                        <option value="6">副经理</option>
                        <option value="7">副总经理</option>
                        <option value="8">总经理</option>
                        <option value="9">离职</option>
                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">岗位</label>
                <div class="layui-input-inline">
                    <select id="post1" name="post" lay-verify="required">
                    </select>
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">部门</label>
                <div class="layui-input-inline">
                    <select id="department1" name="department" lay-verify="required">
                    </select>
                </div>
            </div>

            <button id="ediit" lay-submit lay-filter="addnew1" style="display: none">提交</button>
        </form>
    </div>

</script>

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
                                <b>1.</b>职位有: 信息策划推广，销售人员，跟单人员，ASP.NET开发，JAVA开发，安卓开发，IOS开发，前端开发，美工设计，软件开发实习
                                <br><b>2.</b>期望薪资只支持数字(月薪)
                                <br><b>3.</b>籍贯用/分隔,如:江苏省/徐州市
                                <br><b>4.</b>婚姻状况为是或者否
                                <br><b>5.</b>政治面貌有: 中共党员，中共预备党员，共青团员，群众，其他
                                <br><b>6.</b>学历有: 专科，本科，博士，硕士，其他
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

<script type="text/html" id="print_table">
    <table border="1" style="border-collapse: collapse; width: 700px">
        <tbody>
        <tr>
            <th colspan="4" style="height: 35px;font-size: 30px">个人档案</th>
        </tr>
        <tr>
            <th colspan="4" align="left" style="height: 30px;font-size: 20px">个人信息</th>
        </tr>
        <tr>
            <th align="left" style="height: 20px;font-size: 15px;padding-left: 10px">姓 名:</th>
            <th>我是占位符</th>
            <th>我是占位符</th>
            <th>我是占位符</th>
        </tr>
        <tr>
            <th>我是占位符</th>
            <th>我是占位符</th>
            <th>我是占位符</th>
        </tr>
        </tbody>
    </table>
</script>

<script type="text/html" id="barTool">
    <%--<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>--%>

    <a class="layui-btn layui-btn-xs" lay-href="outer/toAnswer?id={{d.aId}}">查看答题信息</a>
    <a class="layui-btn layui-btn-xs" lay-href="home/console?uAid={{d.aId}}">查看个人档案</a>
    <%--    <a class="layui-btn layui-btn-xs" target="view-frame" href="home/exportWord?id={{d.aId}}">导出Word</a>--%>
    <%--    <a class="layui-btn layui-btn-xs" target="view-frame" href="home/exportExcel?id={{d.aId}}">导出Excel</a>--%>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script type="text/html" id="usernameTpl">
    <a lay-href="home/console?uAid={{d.aId}}" class="layui-table-link" target="_blank">{{ d.name }}</a>
</script>
<script type="text/html" id="sex_">
    {{# if(d.sex==1){ }}
    男
    {{# }else{ }}
    <span style="color: #F581B1;">女</span>
    {{# } }}
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

        $('.imAndEx').click(function () {
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
                    //创建 FormData 对象
                    var frm = new FormData();
                    for(var i=0; i<files.length; i++){
                        var file = files[i];
                        console.log(file)
                        frm.append("files", file);
                    }
                    var index = layer.load();
                    // console.log(file)
                    //利用JQuery的ajax方法发送formData对象
                    $.ajax({
                        url:'excel/importExcel',
                        type:'POST',
                        dataType: 'json',
                        data:frm, //ajax方法发送formData对象
                        processData: false,//JQuery不要出来frm数据
                        contentType: false,
                        beforeSend: function () {
                            index;
                        },
                        complete: function () {
                            layer.close(index);
                        },
                        success:function(obj){
                            if (obj.code==200){
                                var msg = obj.msg.replace(/\n/g,"<br>");
                                table.reload('inner')
                                layer.alert(msg);
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

        var uploadInst = upload.render({
            elem: '#test3'
            ,url: 'AddFujian'
            ,data:{type:"附件",kind:"message"}
            ,multiple:true
            ,size: 1024
            ,accept: 'file'
            ,done: function(res){
                //如果上传失败
                if(res.code > 0){
                    return layer.msg('上传失败');
                }
                //上传成功
                console.log(res.data.src);
                var demoText = $('#demoText');
                var ht='<div id="'+res.data.id+'"><input value="'+res.data.src+'" name="fujian_uri" style="display:none">'+
                    '<input value="'+res.data.name+'" name="fujian_name" style="display:none">'+
                    '<a href="'+url+res.data.src+'" target="view_frame">'+res.data.name+'</a>'+
                    '<a onclick="delfujian('+0+','+res.data.id+')">&nbsp;&nbsp;删除</a></div>';
                demoText.append(ht);
            },
        })

        form.on('submit(addnew)', function (data) {
            var field = data.field;
            var aRole = field.role;
            var post = field.post;
            var phone = field.phone;
            var sex = field.sex;
            var name = field.name;
            var aStatus = field.status;
            var depart = field.department;
            $.ajax({
                url: 'inner/add'
                ,type: 'POST'
                ,data: {
                    aStatus:aStatus,
                    aRole: aRole,
                    phone: phone,
                    sex: sex,
                    name: name,
                    post: post,
                    aDepart:depart
                },success: function (res) {
                    if (res.code == 200) {
                        layer.msg("添加成功")
                        layer.close(index1)
                        table.reload('inner')
                    } else {
                        layer.msg("添加失败,员工账号不能重复")
                    }
                },error: function (res) {
                    console.log("未知错误");
                }
            })
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });


        form.on('submit(addnew1)', function (data) {
            var field = data.field;
            var aUsername = field.username;
            var aPassword = field.password;
            var aRole = field.role;
            var aStatus = field.status;
            var aDepart = field.department;
            var p2 = field.post;
            var aId = $("#editId").val()
            var aJnum = $("#ajnum").val()
            $.ajax({
                url: 'inner/edit'
                , type: 'POST'
                , data: {aId: aId,name:name1,aJnum:aJnum,s1:s1,p1:npId,p2:p2, aPassword: aPassword,aDepart:aDepart, aStatus: aStatus, aRole: aRole, aUsername: aUsername}
                , success: function (res) {
                    if (res.code == 200) {
                        layer.msg("修改成功")
                        layer.close(index1)
                        table.reload('inner')
                    } else {
                        layer.msg("修改失败,员工账号不能重复")
                    }
                }
                , error: function (res) {
                    console.log("未知错误");
                }
            })

            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });
        var npId="";
        var s1="";
        var name1=""
        table.on("tool(test)", function (obj) {
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）
            console.log(data)
            if (layEvent === 'del') {
                layer.confirm("确认要删除吗？", function (index) {
                    $.post("inner/delete", {id: data.aId}, function (res) {
                        if (res.code == 200) {
                            layer.msg("删除成功")
                            table.reload('inner')
                        } else {
                            layer.msg("用户已答题，无法删除")
                        }
                    })

                    layer.close(index);
                })
            } else if (layEvent === 'edit') {
                npId = data.npId
                s1 = data.aStatus
                name1 = data.name
                index1 = layer.open({
                    title: "修改员工",
                    area: ["400px", '600px'],
                    type: 1,
                    shadeClose: true,
                    btn: ["确定", "取消"],
                    content: $('#editNew_role').html(),
                    yes: function (index) {
                        $("#ediit").click();
                    }
                })
                $.post("inner/getPost", function (res) {
                    var content = ""
                    if (res.code == 0) {
                        for (var i = 0; i < res.data.length; i++) {
                            content += "<option value='" + res.data[i].npId + "'>" + res.data[i].npName + "</option>"
                        }
                    }
                    $("#post1").html(content)
                    $("#post1").val(data.npId)
                    form.render("select")

                })

                $.post("inner/getDepart", function (res) {
                    var content = ""
                    if (res.code == 200) {
                        for (var i = 0; i < res.depart.length; i++) {
                            content += "<option value='" + res.depart[i].nId + "'>" + res.depart[i].nName + "</option>"
                        }
                    }
                    $("#department1").html(content)
                    $("#department1").val(data.aDepart)
                    form.render("select")


                })
                $("#username").val(data.aUsername)
                $("#password").val(data.aPassword)
                $("#role").val(data.aRole)
                $("#ajnum").val(data.aJnum)
                $("#editId").val(data.aId)
                $("#sa").val(data.aStatus)
                form.render("select")


            }else if (layEvent === 'down') {
                if(data.uFile!=null&&data.uFile!=""){
                    var filename = data.uFile;
                    var index = filename.lastIndexOf(".");
                    var suffix = filename.substr(index+1);
                    if(suffix=="docx"||suffix=="doc"){
                        var s= "inner/download?name="+data.name+"&path="+data.uFile
                        window.location.href=encodeURI(s)

                    }else{
                        window.open(data.uFile,"_blank ");
                    }


                }
            }
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

        $("#search").click(function () {
            var s = $("#name").val()
            var n = $("#zhiwei").val();
            table.reload('inner', {
                where: {
                    name: s,
                    status: n
                }
            })
            $("#selzhiwei").val(n);
        })

        $("#exportSel").click(function () {
            var checkStatus = table.checkStatus('inner');
            var ids = [];
            for (var i in checkStatus.data)
                ids.push(checkStatus.data[i].aId);
            if (ids.length >= 1)
                window.location.href = "home/exportExcelSel?ids="+ids;
        })

        $("#exportAll").click(function () {
            if ($("#selzhiwei").val()==null || ""==$("#selzhiwei").val())
                window.location.href = "home/exportExcelAll?zhiwei=0";
            else
                window.location.href = "home/exportExcelAll?zhiwei="+$("#selzhiwei").val();
        })

        $("#exportWord").click(function () {
            var checkStatus = table.checkStatus('inner');
            var ids = [];
            for (var i in checkStatus.data){
                ids.push(checkStatus.data[i].aId);
            }
            if (ids.length > 1)
                window.location.href = "home/exportWordAll?ids="+ids;
            if (ids.length == 1)
                window.location.href = "home/exportWord?id="+ids[0];
        })

        table.render({
            id: 'inner'
            ,elem: '#test'
            ,url: 'inner/getInner'
            ,toolbar:"true"
            ,limit:20
            , cols: [[
                {type: 'checkbox', width: 70, title: ''}
                , {type: 'numbers', width: 90, title: '项目编号',sort: true, templet: '#usernameTpl'}
                , {field: 'name', width: 105, title: '项目名称', sort: true, templet: '#usernameTpl'}
                , {field: 'aJnum', width: 75, title: '部门', sort: true}
                , {field: 'sex', width: 100, title: '负责人', templet: '#sex_', sort: true}
                , {field: 'aStatus', width: 130, title: '项目当前状态',templet: function (d) {
                        if (d.aStatus == 4) {
                            return "正式员工"
                        }else if (d.aStatus == 5) {
                            return "部门经理"
                        }else if (d.aStatus == 6) {
                            return "经理"
                        }else {
                            return ""
                        }
                    }, sort: true}
                , {field: 'aDate', width: 130, title: '项目创建日期', sort: true}
                , {field: "left", title: "操作", toolbar: "#barTool"}
            ]]
            , page: {
                limit: 10,
                layout: ['count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
            }
            ,where:{
                status:0
            }
        });

        $("#preview").click(function () {
            var checkStatus = table.checkStatus('inner');
            var ids = [];
            for (var i in checkStatus.data){
                ids.push(checkStatus.data[i].aId);
            }
            LODOP=getLodop();
            LODOP.ADD_PRINT_DATA("ProgramData",document.getElementById('S1').value); //装载模板
            $.ajax({
                "url": "print/getData",
                "data": "id="+ids[0],
                "type": "GET",
                "dataType": "json",
                "success": function (obj) {
                    for (var name in obj.map){
                        LODOP.SET_PRINT_STYLEA(name,"CONTENT",obj.map[name]);
                    }
                    LODOP.PREVIEW();
                }
            })
        })

        $("#print").click(function () {
            var checkStatus = table.checkStatus('inner');
            var ids = [];
            for (var i in checkStatus.data){
                ids.push(checkStatus.data[i].aId);
            }
            LODOP=getLodop();
            LODOP.ADD_PRINT_DATA("ProgramData",document.getElementById('S1').value); //装载模板
            for (var i = 0; i < ids.length; i++) {
                $.ajax({
                    "url": "print/getData",
                    "data": "id="+ids[i],
                    "type": "GET",
                    "dataType": "json",
                    "success": function (obj) {
                        for (var name in obj.map){
                            LODOP.SET_PRINT_STYLEA(name,"CONTENT",obj.map[name]);
                        }
                        LODOP.PRINT();
                    }
                })
            }
        })

    });


</script>
<script>
    function getProgramData() {
        LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
        var old_value = document.getElementById('S1').value;
        if (LODOP.CVERSION) LODOP.On_Return=function(TaskID,Value){
            if ("@"==Value)
                document.getElementById('S1').value = old_value;
            else
                document.getElementById('S1').value=Value;
            saveProgramData();
        }
        document.getElementById('S1').value=LODOP.GET_VALUE("ProgramData",0);	//获得文档式模板
    };

    /*function add0(num, n) {
        return num==null?"":(Array(n).join('0') + num).slice(-n);
    }*/

    function saveProgramData() {
        $.ajax({
            "url": "print/save",
            "data": "data=" + document.getElementById('S1').value,
            "type": "POST",
            "dataType": "text",
            "success": function (msg) {
                layer.msg(msg);
            }
        })
    };

    function DisplayDesign() {
        CreatePage();
        LODOP.SET_SHOW_MODE("DESIGN_IN_BROWSE",1);
        LODOP.PRINT_DESIGN();
    };

    function DesignByPRGData() {
        LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));

        LODOP.ADD_PRINT_DATA("ProgramData",document.getElementById('S1').value); //装载模板
        //按类名赋值
        LODOP.SET_PRINT_STYLEA("jj_xm","CONTENT","张三");
        LODOP.SET_PRINT_STYLEA("jj_dz","CONTENT","北京昌平昌盛路XX号");
        LODOP.SET_PRINT_STYLEA("jj_dh","CONTENT","18612345678");
        LODOP.SET_PRINT_STYLEA("sj_xm","CONTENT","李四");
        LODOP.SET_PRINT_STYLEA("sj_dz","CONTENT","山东泰安市泰山区青年路28号银泰大厦");
        LODOP.SET_PRINT_STYLEA("sj_dh","CONTENT","15612345678");
        LODOP.SET_SHOW_MODE("DESIGN_IN_BROWSE",1);
        LODOP.PRINT_DESIGN();
    };

    function PreviewByPRGData() {
        // LODOP.ADD_PRINT_HTM(0, 0, "100%", "100%", document.getElementById("print_table").innerHTML );
        var checkStatus = table.checkStatus('inner');
        console.log(checkStatus.length)
        var ids = [];
        for (var i in checkStatus.data){
            ids.push(checkStatus.data[i].aId);
        }
        LODOP=getLodop();
        LODOP.ADD_PRINT_DATA("ProgramData",document.getElementById('S1').value); //装载模板
        $.ajax({
            "url": "print/getData",
            "data": "id=50",
            "type": "GET",
            "dataType": "json",
            "success": function (obj) {
                for (var name in obj){
                    LODOP.SET_PRINT_STYLEA(name,"CONTENT",obj[name]);
                }
                LODOP.PREVIEW();
            }
        })
        //按类名赋值
        LODOP.SET_PRINT_STYLEA("jj_xm","CONTENT","张三");

        LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
    };

    function CreatePage() {
        LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
        LODOP.PRINT_INITA(0,0,665,600,"打印控件功能演示_Lodop功能_演示文档式模板生成和使用");
        LODOP.ADD_PRINT_TEXTA("u_name",83,78,200,20,"姓名");
    };

    $.ajax({
        "url": "print/getModel",
        "type": "GET",
        "dataType": "text",
        "success": function (obj) {
            document.getElementById('S1').value = obj;
        }
    })

    function fileChange(){
        var files = $('#fileToUpload3')[0].files;
        for(var i=0; i<files.length; i++){
            var file = files[i];
            $('#jlname').html(file.name);
        }
    }

    /*var test = document.getElementById('fileToUpload3');
    test.addEventListener('change', function() {
        var t_files = this.files;
        console.log(t_files);
        var str = '';
        for (var i = 0, len = t_files.length; i < len; i++) {
            console.log(t_files[i]);
            str += '<li>名称：' + t_files[i].name + '大小' + t_files[i].size / 1024 + 'KB</li>';
        };
        document.getElementById('content').innerHTML = str;
    }, false);*/

</script>
</body>
</html>