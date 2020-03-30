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
    <link rel="stylesheet" href="css/select.css" media="all">
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
                      <option value="10">全部</option>
                      <option value="1">实习</option>
                      <option value="3">试用</option>
                  </select>
                    <input type="hidden" id="selzhiwei" value="0">
                </div>
                <button class="layui-btn" id="search" data-type="reload">搜索</button>
            </div>
            <button type="button" class="layui-btn" style="margin-top: 10px;" id="exportSel"><i class="layui-icon"></i>批量导出</button>
            <button type="button" class="layui-btn" style="margin-top: 10px;" id="exportAll">全部导出</button>
            <button type="button" class="layui-btn" style="margin-top: 10px;" id="exportWord">Word导出</button>
            <button type="button" class="layui-btn" style="margin-top: 10px;" id="preview">预览</button>
            <button type="button" class="layui-btn" style="margin-top: 10px;" id="print">打印</button>
            <textarea rows="10" id="S1" cols="98" style="display:none;" >返回的结果值</textarea>
            <button type="button" class="layui-btn layui-btn-danger" id="deleteM" style="margin-top: 10px;">删除</button>
            <table class="layui-hide" id="test" lay-filter="test"></table>

        </div>
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

<script type="text/html" id="up_role">
    <div class="layui-col-md12" style="margin-top: 20px">
        <form action="" method="" class="layui-form">
            <input type="hidden" id="editId">
            <input type="hidden" id="uname">
            <input type="hidden" id="oStatus">
            <div class="layui-form-item">
                <label class="layui-form-label">职务</label>
                <div class="layui-input-inline">
                    <select id="sa" name="status" lay-verify="required">
                        <option value="4">正式员工</option>
                        <option value="5">副主管</option>
                        <option value="6">副经理</option>
                        <option value="7">副总经理</option>
                        <option value="8">总经理</option>
                    </select>
                </div>
            </div>
            <button id="ediit" lay-submit lay-filter="addnew1" style="display: none">提交</button>
        </form>
    </div>
</script>

<script type="text/html" id="barTool">
    <a class="layui-btn layui-btn-xs" lay-event="edit">转正</a>
    <a class="layui-btn layui-btn-xs" lay-href="outer/toAnswer?id={{d.aId}}">查看答题信息</a>
    <a class="layui-btn layui-btn-xs" lay-href="home/console?uAid={{d.aId}}">查看个人档案</a>
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
        var index1 = ""

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
                index1 = layer.open({
                    title: "确认让"+data.name+"转正吗？",
                    area: ["400px", '175px'],
                    type: 1,
                    shadeClose: true,
                    btn: ["确定", "取消"],
                    skin: 'to-fix-select',
                    content: $('#up_role').html(),
                    yes: function (index) {
                        $("#ediit").click();
                    }
                })
                $("#editId").val(data.aId)
                $("#uname").val(data.name)
                $("#oStatus").val(data.aStatus)
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

        form.on('submit(addnew1)', function (data) {
            var field = data.field;
            var uname = $("#uname").val()
            var oStatus = $("#oStatus").val()
            var nStatus = field.status;
            var aId = $("#editId").val()
            $.ajax({
                url: 'change/upsure'
                , type: 'POST'
                , data: {aId: aId, uname: uname, oStatus: oStatus, nStatus: nStatus}
                , success: function (res) {
                    if (res.code == 200) {
                        layer.msg("转正成功")
                        layer.close(index1)
                        table.reload('inner')
                    } else {
                        layer.alert("转正失败")
                    }
                }, error: function (res) {
                    console.log("未知错误");
                }
            })
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });

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
                , {field: 'name', width: 100, title: '姓名', sort: true, templet: '#usernameTpl'}
                , {field: 'aJnum', width: 75, title: '工号', sort: true}
                , {field: 'sex', width: 75, title: '性别', templet: '#sex_', sort: true}
                , {field: 'post', width: 100, title: '岗位', sort: true}
                , {field: 'depart', width: 100, title: '部门'}
                , {
                    field: 'aRole', width: 100, title: '权限', templet: function (d) {
                        if (d.aRole == 1) {
                            return "系统管理员"
                        } else if (d.aRole == 2) {
                            return "成员"
                        } else {
                            return ""
                        }
                    }
                }
                , {field: 'aStatus', width: 105, title: '职务状态',templet: function (d) {
                        if (d.aStatus == 1) {
                            return "实习"
                        } else if (d.aStatus == 2) {
                            return "未审核 "
                        } else if (d.aStatus == 3) {
                            return "试用"
                        }else if (d.aStatus == 4) {
                            return "正式员工"
                        }else if (d.aStatus == 5) {
                            return "副主管"
                        }else if (d.aStatus == 6) {
                            return "副经理"
                        }else if (d.aStatus == 7) {
                            return "副总经理"
                        }else if (d.aStatus == 8) {
                            return "总经理"
                        }else if (d.aStatus == 9) {
                            return "离职"
                        }else {
                            return ""
                        }
                    }, sort: true}
                , {field: 'aDate', width: 105, title: '创建日期', sort: true}
                , {field: 'uFile', width: 90, title: '简历下载',event:'down',templet:function(d){
                    if (d.uFile!=null&&d.uFile!=""){
                        return "<div style='color: red'>点击下载</div>"
                    }else{
                        return "无"
                    }
                    }}
                , {field: 'phone', width: 120, title: '手机号'}
                , {field: 'aUsername', width: 100, title: '账号'}
                , {field: 'aPassword', width: 100, title: '密码'}
                , {field: "left", title: "操作", toolbar: "#barTool"}
            ]]
            , page: {
                limit: 10,
                layout: ['count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
            }
            ,where:{
                   status: 10
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

</script>
</body>
</html>