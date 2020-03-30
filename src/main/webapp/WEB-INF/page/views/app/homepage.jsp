<%@page contentType="text/html; charset=utf-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>主页</title>
    <base href="<%=basePath%>">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
    <style>
        *{margin:0;padding:0}
        html,body{
            width:100%;
            height:100%;
        }
        #main{
            width:600px;
            height:450px;
            margin: 150px auto;
            border:1px solid #ddd;
        }
        /*默认长宽比0.75*/
    </style>
</head>
<body>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md8">
            <div class="layui-card">
                <div class="layui-card-header">
                    人员信息
                </div>
                <div class="layui-card-body">
                    <table class="layui-table" lay-even="" lay-skin="row">
                        <colgroup>
                            <col width="25%">
                            <col width="25%">
                            <col width="25%">
                            <col>
                        </colgroup>
                        <thead>
                        <tr>
                            <th>在职</th>
                            <th>实习</th>
                            <th>试用</th>
                            <th>已离职</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td id="zaizhi"></td>
                            <td id="shixi"></td>
                            <td id="shiyong"></td>
                            <td id="lizhi"></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="layui-card">
                <div class="layui-card-header">员工在职情况统计</div>
                <div class="layui-card-body" style="height: 500px">
                    <div class="layui-tab">
                        <%--<ul class="layui-tab-title">
                            <li class="layui-this">员工在职情况统计</li>
                            <li>岗位统计</li>
                            <li>平均测试工资与期望工资统计</li>
                            <li>商品管理</li>
                            <li>订单管理</li>
                        </ul>--%>
                        <div class="layui-tab-content">
                            <div class="layui-tab-item layui-show">
                                <%--<div class="layui-card" style="width: 500px">
                                    <div class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade" lay-filter="LAY-index-normcol">
                                      <div carousel-item id="LAY-index-normcol">
                                        <div><i class="layui-icon layui-icon-loading1 layadmin-loading"></i></div>
                                      </div>
                                    </div>
                                </div>--%>
                                <div id="zaizhiqingkuang" style="width: 500px; height:400px;"></div>
                            </div>
                            <div class="layui-tab-item">
                                <div id="gangwei" style="width: 1000px; height:400px;"></div>
                            </div>
                            <div class="layui-tab-item">
                                <div id="pingjungongzi" style="width: 500px; height:400px;"></div>
                            </div>
                            <div class="layui-tab-item">
                                <div id="map" style="width: 1000px; height:800px;"></div>
                            </div>
                            <div class="layui-tab-item">
                            </div>
                        </div>
                    </div>
                    <%--<h1>内容待定</h1>--%>
                </div>
            </div>
        </div>

        <div class="layui-col-md4">
            <div class="layui-card">
                <div class="layui-card-header">当月生日提醒</div>
                <div class="layui-card-body">
                    <ul class="layui-row layuiadmin-card-team" id="month">
                        <li class="layui-col-xs6">
                            <span class="layui-team-img"><img src="layuiadmin/style/res/logo.png"></span>
                            <span>当前月份无员工生日</span>
                        </li>
                    </ul>

                </div>
            </div>
            <%--   <div class="layui-card">
                 <div class="layui-card-header">重点组件</div>
                 <div class="layui-card-body">
                   <ul class="layui-row layuiadmin-card-team">
                     <li class="layui-col-xs6">
                       <a lay-href="https://www.layui.com/doc/modules/table.html">
                         <span class="layui-team-img"><img src="layuiadmin/style/res/logo.png"></span>
                         <span>数据表格</span>
                       </a>
                     </li>
                     <li class="layui-col-xs6">
                       <a lay-href="https://www.layui.com/doc/modules/layim.html">
                         <span class="layui-team-img"><img src="layuiadmin/style/res/logo.png"></span>
                         <span>即时通讯</span>
                       </a>
                     </li>
                     <li class="layui-col-xs6">
                       <a lay-href="https://www.layui.com/doc/modules/form.html">
                         <span class="layui-team-img"><img src="layuiadmin/style/res/logo.png"></span>
                         <span>表单</span>
                       </a>
                     </li>
                     <li class="layui-col-xs6">
                       <a lay-href="https://www.layui.com/doc/modules/layer.html">
                         <span class="layui-team-img"><img src="layuiadmin/style/res/logo.png"></span>
                         <span>弹出层</span>
                       </a>
                     </li>
                     <li class="layui-col-xs6">
                       <a lay-href="https://www.layui.com/doc/modules/upload.html">
                         <span class="layui-team-img"><img src="layuiadmin/style/res/logo.png"></span>
                         <span>文件上传</span>
                       </a>
                     </li>
                     <li class="layui-col-xs6">
                       <a lay-href="https://www.layui.com/doc/modules/rate.html">
                         <span class="layui-team-img"><img src="layuiadmin/style/res/logo.png"></span>
                         <span>评分</span>
                       </a>
                     </li>
                   </ul>
                 </div>
               </div>--%>
        </div>
    </div>
</div>
<script src="js/jquery-2.1.4.js"></script>
<script src="js/echarts.min.js"></script>
<script src="layuiadmin/layui/layui.js"></script>
<script>
    layui.config({
        base: 'layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'form', 'senior', 'carousel', 'echarts'], function () {
        var $ = layui.$
        ,carousel = layui.carousel
        ,echarts = layui.echarts;

        $.post("index/getInfo", function (res) {
            console.log(res)
            if (res.code == 200) {
                var echnormcol = [], normcol = [{
                        tooltip : {trigger: 'axis'},
                        xAxis : [{
                                type : 'category',
                                data : ["在职","实习","试用","已离职"]}
                        ],
                        yAxis : [{}],
                        series : [{
                                name:'在职',
                                type:'bar',
                                data:[res.zaizhi, res.shixi, res.shiyong, res.lizhi]}
                        ]
                    }
                ]
                ,elemNormcol = $('#LAY-index-normcol').children('div')
                ,renderNormcol = function(index){
                    echnormcol[index] = echarts.init(elemNormcol[index], layui.echartsTheme);
                    echnormcol[index].setOption(normcol[index]);
                    window.onresize = echnormcol[index].resize;
                };
                if(!elemNormcol[0]) return;
                renderNormcol(0);
            }
        })

    });

    $.post("index/getBorn", function (res) {
        if (res.users != null && res.users.length != 0) {
            console.log(res)
            var content = "";
            for (var i = 0; i < res.users.length; i++) {
                content += " <li class=\"layui-col-xs6\">\n" +
                    "<span class=\"layui-team-img\"><img src=\"layuiadmin/style/res/logo.png\"></span>\n" +
                    "<span>" + res.users[i].uName + "</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +
                    "<span>" + res.users[i].uBorn + "</span>\n" +
                    " </li>"
            }
            $("#month").html(content)
        }
    })

</script>
<script type="text/javascript">
    var myChart_gw = echarts.init(document.getElementById('zaizhiqingkuang'));
    $.post("index/getInfo", function (res) {
        if (res.code == 200) {
            // var data = []
            $("#zaizhi").text(res.zaizhi)
            $("#shixi").text(res.shixi)
            $("#shiyong").text(res.shiyong)
            $("#lizhi").text(res.lizhi)
            myChart_gw.setOption({
                series: [
                    {
                        name: '访问来源',
                        type: 'pie',
                        radius: '55%',
                        data: [
                            {value: res.zaizhi, name: '在职人员'},
                            {value: res.shixi, name: '实习人员'},
                            {value: res.shiyong, name: '试用人员'},
                            {value: res.lizhi, name: '离职人员'}
                        ]
                    }
                ]
            })
        }
    })

    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('gangwei'));
    $.post("echarts/getPost", function (res) {
        if (res.code == 200) {
            var name = [], count = [];
            for (var key in res.map){
                name.push(key);
                count.push(res.map[key]);
            }
            // 指定图表的配置项和数据
            var option = {
                color: ['#3398DB'],
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                        type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                grid: {
                    containLabel: false
                },
                xAxis: {data: name},
                yAxis: {},
                series: [{
                    name: '销量',
                    type: 'bar',
                    data: count,
                    barWidth : 30,//柱图宽度
                }]
            };
            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
        }
    })


    var myChart_gz = echarts.init(document.getElementById('pingjungongzi'));
    $.post("echarts/getMoney", function (res) {
        if (res.code == 200) {
            var month = [], tmoney = [], smoney = [];
            for (var key in res.list){
                tmoney.push(res.list[key].tmoney);
                smoney.push(res.list[key].tmoney);
                month.push(res.list[key].month);
            }
            myChart_gz.setOption({
                legend: {},
                dataset: {
                    source: [
                        ['product', '期望工资', '测试工资'],
                        [month[0], tmoney[0], tmoney[1]],
                        [month[1], smoney[0], smoney[1]]
                    ]
                },
                xAxis: {type: 'category'},
                yAxis: {},
                // Declare several bar series, each will be mapped
                // to a column of dataset.source by default.
                series: [
                    {type: 'bar'},
                    {type: 'bar'}
                ]
            })
        }
    })

</script>
</body>
</html>