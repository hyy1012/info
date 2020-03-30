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
    <title>内部管理系统</title>
    <base href="<%=basePath%>">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
    <script>
        /^http(s*):\/\//.test(location.href) || alert('请先部署到 localhost 下再访问');
    </script>
</head>
<body class="layui-layout-body">

<div id="LAY_app">
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header">
            <!-- 头部区域 -->
            <ul class="layui-nav layui-layout-left">
                <li class="layui-nav-item layadmin-flexible" lay-unselect>
                    <a href="javascript:;" layadmin-event="flexible" title="侧边伸缩">
                        <i class="layui-icon layui-icon-shrink-right" id="LAY_app_flexible"></i>
                    </a>
                </li>
                <li class="layui-nav-item" lay-unselect>
                    <a href="javascript:;" layadmin-event="refresh" title="刷新">
                        <i class="layui-icon layui-icon-refresh-3"></i>
                    </a>
                </li>
            </ul>
            <ul class="layui-nav layui-layout-right" lay-filter="layadmin-layout-right">
                <!-- <li class="layui-nav-item" lay-unselect>
                  <a lay-href="app/message/index.html" layadmin-event="message" lay-text="消息中心">
                    <i class="layui-icon layui-icon-notice"></i>
                    如果有新消息，则显示小圆点
                    <span class="layui-badge-dot"></span>
                  </a>
                </li> -->
                <li class="layui-nav-item layui-hide-xs" lay-unselect>
                    <a href="javascript:;" layadmin-event="theme">
                        <i class="layui-icon layui-icon-theme"></i>
                    </a>
                </li>
                <li class="layui-nav-item layui-hide-xs" lay-unselect>
                    <a href="javascript:;" layadmin-event="note">
                        <i class="layui-icon layui-icon-note"></i>
                    </a>
                </li>
                <li class="layui-nav-item layui-hide-xs" lay-unselect>
                    <a href="javascript:;" layadmin-event="fullscreen">
                        <i class="layui-icon layui-icon-screen-full"></i>
                    </a>
                </li>
                <li class="layui-nav-item" lay-unselect>
                    <a href="javascript:;">
                        <cite>${user.aUsername}</cite>
                    </a>
                    <dl class="layui-nav-child">
                        <dd><a lay-href="login/to_edit">修改密码</a></dd>
                        <hr>
                        <dd id="loginOut" layadmin-event="" style="text-align: center;"><a>退出</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item" lay-unselect>
                    <a href="javascript:;">
                        <cite>相关产品</cite>
                    </a>
                    <dl class="layui-nav-child">
                    </dl>
                </li>

                <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-unselect>
                    <a href="javascript:;" layadmin-event="more"><i class="layui-icon layui-icon-more-vertical"></i></a>
                </li>
            </ul>
        </div>

        <!-- 侧边菜单 -->
        <div class="layui-side layui-side-menu">
            <div class="layui-side-scroll">
                <div class="layui-logo" lay-href="img/indexPage.html">
                    <span> <a href="javascript:;" target="_blank"><img src="layuiadmin/img/logo.png" alt=""
                                                                       style="width: 40px;margin-right: 20px;"></a>内部管理系统</span>
                </div>
                <ul class="layui-nav layui-nav-tree" lay-shrink="all" id="LAY-system-side-menu"
                    lay-filter="layadmin-system-side-menu">

                    <c:if test="${user.aRole == 0}">
                        <li data-name="user" class="layui-nav-item">
                            <a href="javascript:;" lay-tips="人员管理" lay-direction="2">
                                <i class="layui-icon layui-icon-user"></i>
                                <cite>人员管理</cite>
                            </a>
                            <dl class="layui-nav-child">
                                <c:if test="${user.aRole==0}"></c:if>
                                <dd>
                                    <a lay-href="inner/toInner">员工花名册</a>
                                </dd>
                                <dd>
                                    <a lay-href="depart/to_item">组织管理</a>
                                </dd>
                                    <%--<dd>
                                        <a lay-href="change/toChange">人员变动信息</a>
                                    </dd>
                                    <dd>
                                        <a lay-href="change/to_up">转正管理</a>
                                    </dd>
                                    <dd>
                                        <a lay-href="change/to_leave">离职管理</a>
                                    </dd>
                                    <dd>
                                        <a lay-href="change/to_transfer">调动管理</a>
                                    </dd>--%>
                            </dl>
                        </li>
                    </c:if>


                    <c:if test="${user.aStatus == 4}">
                        <li data-name="project" class="layui-nav-item">
                            <a href="javascript:;" lay-tips="我的项目" lay-direction="2">
                                <i class="layui-icon layui-icon-list"></i>
                                <cite>我的项目</cite>
                            </a>
                            <dl class="layui-nav-child">
                                <dd class="layui-nav-itemed">
                                <dd><a lay-href="project/to_list">项目列表</a></dd>
                                </dd>
                                    <%--<dd><a lay-href="project/to_pi">项目详情</a></dd>--%>
                            </dl>
                        </li>
                    </c:if>

                    <c:if test="${user.aStatus == 5 || user.aStatus == 6}">
                        <li data-name="project" class="layui-nav-item">
                            <a href="javascript:;" lay-tips="项目审批管理" lay-direction="2">
                                <i class="layui-icon layui-icon-list"></i>
                                <cite>项目审批管理</cite>
                            </a>
                            <dl class="layui-nav-child">
                                <dd class="layui-nav-itemed">
                                <dd><a lay-href="project/to_list">项目列表</a></dd>
                                </dd>
                                    <%--            <dd><a lay-href="project/to_pi">项目详情</a></dd>--%>
                            </dl>
                        </li>
                    </c:if>

                </ul>
            </div>
        </div>

        <!-- 页面标签 -->
        <div class="layadmin-pagetabs" id="LAY_app_tabs">
            <div class="layui-icon layadmin-tabs-control layui-icon-prev" layadmin-event="leftPage"></div>
            <div class="layui-icon layadmin-tabs-control layui-icon-next" layadmin-event="rightPage"></div>
            <div class="layui-icon layadmin-tabs-control layui-icon-down">
                <ul class="layui-nav layadmin-tabs-select" lay-filter="layadmin-pagetabs-nav">
                    <li class="layui-nav-item" lay-unselect>
                        <a href="javascript:;"></a>
                        <dl class="layui-nav-child layui-anim-fadein">
                            <dd layadmin-event="closeThisTabs"><a href="javascript:;">关闭当前标签页</a></dd>
                            <dd layadmin-event="closeOtherTabs"><a href="javascript:;">关闭其它标签页</a></dd>
                            <dd layadmin-event="closeAllTabs"><a href="javascript:;">关闭全部标签页</a></dd>
                        </dl>
                    </li>
                </ul>
            </div>
            <div class="layui-tab" lay-unauto lay-allowClose="true" lay-filter="layadmin-layout-tabs">
                <ul class="layui-tab-title" id="LAY_app_tabsheader">
                    <li lay-id="index/toHome" lay-attr="index/toHome" class="layui-this"><i
                            class="layui-icon layui-icon-home"></i></li>
                </ul>
            </div>
        </div>


        <!-- 主体内容 -->
        <div class="layui-body" id="LAY_app_body">
            <div class="layadmin-tabsbody-item layui-show">
                <iframe src="index/toHome" frameborder="0" class="layadmin-iframe"></iframe>
            </div>
        </div>

        <!-- 辅助元素，一般用于移动设备下遮罩 -->
        <div class="layadmin-body-shade" layadmin-event="shade"></div>
    </div>
</div>

<script src="layuiadmin/layui/layui.js"></script>
<script src="js/jquery-2.1.4.js"></script>
<script>
    layui.config({
        base: 'layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use('index', function () {
        $("#loginOut").click(function () {
            $.post("login/loginOut", function (res) {
                if (res.code == 201) {
                    window.location.reload();
                }
            })
        })
    });
</script>
<script>
    var _hmt = _hmt || [];
    (function () {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?7da1657e225ee069bfc18d0b34754e2c";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();

</script>
<!-- 百度统计 -->
<script>
    var _hmt = _hmt || [];
    (function () {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?d214947968792b839fd669a4decaaffc";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
    })();

</script>
</body>
</html>


