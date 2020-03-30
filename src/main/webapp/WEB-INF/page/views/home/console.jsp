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
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="layuiadmin/style/admin.css" media="all">
    <link rel="stylesheet" href="css/city-picker.css"/>
    <script src="js/jquery-2.1.4.js"></script>
    <script src="js/city-picker.data.js"></script>
    <script src="js/city-picker.js"></script>
    <script src="js/LodopFuncs.js"></script>
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
                        <legend>基本信息（基本信息仅可修改一次，请确认修改正确后提交）</legend>
                    </fieldset>

                    <form class="layui-form" action="" id="user-profile" onkeydown="if(event.keyCode===13){return false;}">
                        <div class="layui-form-item">
                            <div class="layui-inline"  id="printDiv">
                                <label class="layui-form-label">姓名<span class="requires">*</span></label>
                                <div class="layui-input-inline">
                                    <input type="text" name="uName" lay-verify="required" autocomplete="off"
                                           id="u_name" class="layui-input">
                                    <input type="text" name="uAid" lay-verify="required" autocomplete="off"
                                           value="${d}" id="u_aid" class="layui-input" style="display: none">
                                    <input type="text" name="uId" lay-verify="required" autocomplete="off"
                                           id="u_id" class="layui-input" style="display: none">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">籍贯<span class="requires">*</span></label>
                                <div class="layui-input-inline">
                                    <div style="position: relative;"><!-- container -->
                                        <input readonly id="dddd" type="text" data-toggle="city-picker"
                                               lay-verify="required" placeholder="请选择省/市" data-level="city">
                                    </div>
                                </div>

                            </div>

                            <div class="layui-inline">
                                <label class="layui-form-label">照片</label>
                                <div id="photoImage"
                                     style="width: 110px; height: 150px;position: absolute;left:120px;top: -20px;display: flex;align-items: center; justify-content: space-around;text-align: center;border: 1px solid black;">
                                    点击选择图片(110X150)
                                </div>
                                <input id="uPicture" type="file" style="display: none;"/>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">婚否</label>
                                <div class="layui-input-inline">
                                    <input type="radio" name="uMarried" value="0" title="是" checked="">
                                    <input type="radio" name="uMarried" value="1" title="否" id="nomarr">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">性别</label>
                                <div class="layui-input-inline">
                                    <input type="radio" name="uSex" value="1" title="男" checked="">
                                    <input type="radio" name="uSex" value="2" title="女" id="noman">
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <div class="layui-inline">
                                    <label class="layui-form-label">出生日期</label>
                                    <div class="layui-input-inline">
                                        <input type="text" name="uBorn" id="u_born"
                                               placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">年龄</label>
                                    <div class="layui-input-inline">
                                        <input type="text" id="u_age" name="uAge" autocomplete="off"
                                               class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">身份证</label>
                                    <div class="layui-input-inline">
                                        <input type="text" id="u_identity" name="uIdentity" autocomplete="off"
                                               lay-verify="identity" class="layui-input">
                                    </div>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-inline">
                                    <label class="layui-form-label">名族</label>
                                    <div class="layui-input-inline">
                                        <select id="u_ethnic" name="uEthnic">
                                            <option value="0">汉</option>
                                            <option value="1">少数名族</option>
                                            <option value="2">其他</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">政治面貌</label>
                                    <div class="layui-input-inline">
                                        <select id="u_polity" name="uPolity">
                                            <option value="0">中共党员</option>
                                            <option value="1">中共预备党员</option>
                                            <option value="2">共青团员</option>
                                            <option value="3">群众</option>
                                            <option value="4">其他</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">身高（cm）</label>
                                    <div class="layui-input-inline">
                                        <input type="text" id="u_height" name="uHeight" autocomplete="off"
                                               class="layui-input">
                                    </div>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <div class="layui-inline">
                                    <label class="layui-form-label">职位</label>
                                    <div class="layui-input-inline">
                                        <select id="u_post" name="uPost">
                                            <c:forEach items="${posts}" var="posts">
                                                <option value="${posts.npId}">${posts.npName}</option>
                                            </c:forEach>
<%--                                            <option selected value="0">职位二</option>--%>
                                        </select>
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">期望薪资</label>
                                    <div class="layui-input-inline">
                                        <input type="text" name="uTreatment" placeholder="¥" autocomplete="off" id="u_treatment"
                                        style="position:absolute;z-index:2" class="layui-input"  onkeyup="search()" lay-verify="salary">
                                        <select type="text" id="hc_select" lay-filter="hc_select" autocomplete="off" placeholder="移交单位全称" lay-verify="required" class="layui-select" lay-search>
                                            <option value="1000">1000</option><option value="3500">3500</option><option value="6000">6000</option>
                                            <option value="1500">1500</option><option value="4000">4000</option><option value="6500">6500</option>
                                            <option value="2000">2000</option><option value="4500">4500</option><option value="7000">7000</option>
                                            <option value="2500">2500</option><option value="5000">5000</option><option value="7500">7500</option>
                                            <option value="3000">3000</option><option value="5500">5500</option><option value="8000">8000</option>
                                            <option value="3000">8500</option><option value="9000">9000</option><option value="9500">9500</option>
                                            <option value="10000">10000</option><option value="10500">10500</option><option value="11000">11000</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">脚码</label>
                                    <div class="layui-input-inline">
                                        <select id="u_subscript" name="uSubscript">
                                            <option value="36">36</option>
                                            <option value="37">37</option>
                                            <option value="38">38</option>
                                            <option value="39">39</option>
                                            <option value="40">40</option>
                                            <option value="41">41</option>
                                            <option value="42">42</option>
                                            <option value="43">43</option>
                                            <option value="44">44</option>
                                            <option value="45">45</option>
                                            <option value="46">46</option>
                                        </select>
                                    </div>
                                </div>
                            </div>


                            <div class="layui-form-item">
                                <div class="layui-inline">
                                    <label class="layui-form-label">入职日期</label>
                                    <div class="layui-input-inline">
                                        <input type="text" name="uWork" id="u_work" lay-verify="date1"
                                               placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">转正日期</label>
                                    <div class="layui-input-inline">
                                        <input type="text" name="uBecome" id="u_become" lay-verify="date1"
                                               placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">离职日期</label>
                                    <div class="layui-input-inline">
                                        <input type="text" name="uOut" id="u_out" lay-verify="date1"
                                               placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                            </div>


                            <div class="layui-form-item">
                                <label class="layui-form-label">联系地址<span class="requires">*</span></label>
                                <div class="layui-input-inline" style="width: 650px">
                                    <input type="text" name="uAddress" id="u_address" autocomplete="off"
                                           lay-verify="required" placeholder="请输入地址" class="layui-input">
                                </div>
                                <div class="layui-input-inline">
                                    <a style="line-height: 35px" href="javascript:OpenMapAddressSearch('u_address')">[从地图中搜索]</a>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-inline">
                                    <label class="layui-form-label">手机<span class="requires">*</span></label>
                                    <div class="layui-input-inline">
                                        <input type="tel" name="uPhone" lay-verify="required|phone" autocomplete="off"
                                               id="u_phone" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">微信</label>
                                    <div class="layui-input-inline">
                                        <input type="text" name="uWx" id="u_wx" autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">QQ</label>
                                    <div class="layui-input-inline">
                                        <input type="text" name="uQq" id="u_qq" autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <div class="layui-inline">
                                    <label class="layui-form-label">第一学历</label>
                                    <div class="layui-input-inline">
                                        <select id="u_first" name="uFirst">
                                            <option value="1">专科</option>
                                            <option value="2">本科</option>
                                            <option value="3">硕士</option>
                                            <option value="4">博士</option>
                                            <option value="5">其他</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">起止时间</label>
                                    <div class="layui-input-inline" style="width: 180px;">
                                        <input type="text" name="uFirstStart" id="u_first_start" lay-verify="date4"
                                               placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                                    </div>
                                    <div class="layui-form-mid">-</div>
                                    <div class="layui-input-inline" style="width: 180px;">
                                        <input type="text" name="uFirstEnd" id="u_first_end" lay-verify="date5"
                                               placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <div class="layui-col-md6" style="width: 650px">
                                    <label class="layui-form-label">毕业院校</label>
                                    <div class="layui-input-block">
                                        <input type="tel" name="uFirstSchool" lay-verify="" autocomplete="off" style="width: 80%"
                                               id="u_first_school" class="layui-input" list="schools" oninput="tensl(this.value)">
                                    </div>
                                </div>


                                <div class="layui-inline">
                                    <label class="layui-form-label">所学专业</label>
                                    <div class="layui-input-inline">
                                        <input type="tel" name="uFirstMajor" lay-verify="" autocomplete="off"
                                               id="u_first_major" class="layui-input">
                                    </div>
                                </div>

                            </div>


                            <div class="layui-form-item">
                                <div class="layui-inline">
                                    <label class="layui-form-label">最高学历</label>
                                    <div class="layui-input-inline">
                                        <select id="u_peak" name="uPeak">
                                            <option value="1">专科</option>
                                            <option value="2">本科</option>
                                            <option value="3">硕士</option>
                                            <option value="4">博士</option>
                                            <option value="5">其他</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="layui-inline">
                                    <label class="layui-form-label">起止时间</label>
                                    <div class="layui-input-inline" style="width: 180px;">
                                        <input type="text" name="uPeakStart" id="u_peak_start" lay-verify="date6"
                                               placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                                    </div>
                                    <div class="layui-form-mid">-</div>
                                    <div class="layui-input-inline" style="width: 180px;">
                                        <input type="text" name="uPeakEnd" id="u_peak_end" lay-verify="date7"
                                               placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <div class="layui-col-md6" style="width: 650px">
                                    <label class="layui-form-label">毕业院校</label>
                                    <div class="layui-input-block">
                                        <input type="tel" name="uPeakSchool" lay-verify="" autocomplete="off" style="width: 80%"
                                               id="u_peak_school" class="layui-input" list="schools" oninput="tensl(this.value)">
                                    </div>
                                </div>
                                <datalist id="schools"></datalist>

                                <div class="layui-inline">
                                    <label class="layui-form-label">所学专业</label>
                                    <div class="layui-input-inline">
                                        <input type="tel" name="uPeakMajor" lay-verify="" autocomplete="off"
                                               id="u_peak_major" class="layui-input">
                                    </div>
                                </div>

                            </div>


                            <div class="layui-form-item">
                                <label class="layui-form-label">家庭地址</label>
                                <div class="layui-input-inline" style="width: 650px">
                                    <input id="u_old_address" type="text" name="uOldAddress" autocomplete="off"
                                           placeholder="请输入地址" class="layui-input">
                                </div>
                                <div class="layui-input-inline">
                                    <a style="line-height: 35px" onclick="OpenMapAddressSearch('u_old_address')">[从地图中搜索]</a>
                                </div>
                            </div>

                            <div class="layui-form-item layui-form-text"  id="eTadef1" style="display: none">
                                <label class="layui-form-label"  id="eTadef1n">textarea自定义1</label>
                                <div class="layui-input-block">
                                    <textarea placeholder="请输入内容" class="layui-textarea" id="u_textarea1"
                                              name="uTextarea1"></textarea>
                                </div>
                            </div>

                            <div class="layui-form-item layui-form-text" id="eTadef2" style="display: none">
                                <label class="layui-form-label"  id="eTadef2n">textarea自定义1</label>
                                <div class="layui-input-block">
                                    <textarea placeholder="请输入内容" class="layui-textarea" id="u_textarea2"
                                              name="uTextarea2"></textarea>
                                </div>
                            </div>

                            <div class="layui-form-item layui-form-text">
                                <label class="layui-form-label">备注</label>
                                <div class="layui-input-block">
                                    <textarea placeholder="请输入内容" class="layui-textarea" id="u_content"
                                              name="uContent"></textarea>
                                </div>
                            </div>
                            <!--<div class="layui-form-item layui-form-text">
                              <label class="layui-form-label">编辑器</label>
                              <div class="layui-input-block">
                                <textarea class="layui-textarea layui-hide" name="content" lay-verify="content" id="LAY_demo_editor"></textarea>
                              </div>
                            </div>-->

                            <div class="layui-form-item">
                                <div class="layui-col-md6" id="eIdef1" style="display: none">
                                    <label class="layui-form-label" id="eIdef1n">int自定义1</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="uNumber1" id="u_number1"
                                               autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-col-md6" id="eIdef2" style="display: none">
                                    <label class="layui-form-label" id="eIdef2n">int自定义2</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="uNumber2" id="u_number2"
                                               autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <div class="layui-col-md6" id="eDdef1" style="display: none">
                                    <label class="layui-form-label" id="eDdef1n">date自定义1</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="uDate1" id="u_date1" lay-verify="date1"
                                               autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-col-md6" id="eDdef2" style="display: none">
                                    <label class="layui-form-label" id="eDdef2n">date自定义2</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="uDate2" id="u_date2" lay-verify="date1"
                                               autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <div class="layui-col-md6" id="eSdef1" style="display: none">
                                    <label class="layui-form-label" id="eSdef1n">Str自定义1</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="uString1" id="u_string1"
                                               autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                                <div class="layui-col-md6" id="eSdef2" style="display: none">
                                    <label class="layui-form-label" id="eSdef2n">Str自定义2</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="uString2" id="u_string2"
                                               autocomplete="off" class="layui-input">
                                    </div>
                                </div>
                            </div>

                            <div class="layui-form-item">
                                <div class="layui-input-block">
                                    <button type="submit" class="layui-btn" lay-submit="" lay-filter="demo1"
                                            id="editProfile">立即提交
                                    </button>
                                    <%--<button type="button" class="layui-btn" id="prn1_print">打印</button>
                                    <button type="button" class="layui-btn" id="prn1_preview">预览</button>
                                    <button type="button" class="layui-btn" id="prn1_printA">维护</button>
                                    <button type="button" class="layui-btn" id="prn1_printB">选择打印机</button>--%>
                                    <%--<a href="javascript:DisplayDesign()">打印设计</a>
                                    <a href="javascript:DesignByPRGData()">加载模板</a>
                                    <a href="javascript:getProgramData()">生成模板</a>
                                    <a href="javascript:saveProgramData()">保存模板</a>
                                    <a href="javascript:PreviewByPRGData()">打印预览</a>
                                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>--%>
                                </div>
<%--                                <textarea rows="10" id="S1" cols="98" style="display:block;" >返回的结果值</textarea>--%>
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
			<a href="http://www.25175.net" target="_blank"><strong class="text-danger">顺通网络</strong></a>&nbsp;提供技术支持
		</span>
    <p class="no-margin">
        &copy;by <a href="http://www.25175.net/" target="_Blank"><strong>25175</strong></a>
    </p>
</footer><!-- /footer -->


<script src="layuiadmin/layui/layui.js"></script>
<script charset="utf-8" src="https://map.qq.com/api/js?v=2.exp&key=R5GBZ-FJO6I-MV7GS-5P5LP-77X63-INF5H&libraries=place"></script>
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
    }).use(['index', 'console', 'jquery', 'table', 'laydate', 'form', 'common'], function () {
        var $ = layui.jquery, table = layui.table, laydate = layui.laydate, client = true, common = layui.common;
        var form = layui.form;
        var layer = layui.layer;

        // console.log(common);
        // console.log(common.getURL());

        //日期
        laydate.render({
            elem: '#u_born'
        });
        laydate.render({
            elem: '#u_work'
        });
        laydate.render({
            elem: '#u_become'
        });
        laydate.render({
            elem: '#u_out'
        });
        laydate.render({
            elem: '#u_first_start'
        });
        laydate.render({
            elem: '#u_first_end'
        });
        laydate.render({
            elem: '#u_peak_start'
        });
        laydate.render({
            elem: '#u_peak_end'
        });
        laydate.render({
            elem: '#u_date1'
        });
        laydate.render({
            elem: '#u_date2'
        });

        $("#photoImage").click(function () {
            //console.log($("#dddd").val())
            $("#uPicture").click();
        })

        $("#uPicture").change(function () {
            $('#photoImage').html('');
            var regExp = new RegExp('^(.+?)\\.(jpg|png|gif|bmp|jpeg)$', "i")
            var s1 = $("#uPicture")[0].files
            if (s1.length > 0) {
                var result = regExp.test(s1[0].name);
                if (!result) {
                    layer.msg("请选择正确格式的图片（jpg|png|gif|bmp|jpeg）", {offset: '400px'});
                    $("#uPicture").val("");
                    $('#photoImage').html('');
                    return
                }
                duqv()
            }
        })

        form.on('submit(demo1)', function (data) {
            // console.log(data.elem) //被执行事件的元素DOM对象，一般为button对象
            // console.log(data.form) //被执行提交的form对象，一般在存在form标签时才会返回
            // console.log(data.field) //当前容器的全部表单字段，名值对形式：{name: value}
            // 从输入框等控件中获取请求参数
            var photo = $("#uPicture")[0].files;
            if (photo.length == 1) {
                //创建 FormData 对象
                var frm = new FormData();
                frm.append("image", photo[0]);
                frm.append("uAid", $('#u_aid').val());
                //利用JQuery的ajax方法发送formData对象
                $.ajax({
                    url: 'home/upload-image',
                    type: 'POST',
                    dataType: 'json',
                    data: frm, //ajax方法发送formData对象
                    processData: false,//JQuery不要出来frm数据,传frm要加这个
                    contentType: false,
                    success: function () {
                        editProfile();
                    },
                    error: function (obj) {
                        layer.alert(obj.msg)
                    }
                });
            } else {
                editProfile();
            }
            return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
        });

        form.on('select(hc_select)', function (data) {   //选择移交单位 赋值给input框
            $("#u_treatment").val(data.value);
            $("#hc_select").next().find("dl").css({ "display": "none" });
            form.render();
        });

        window.search = function () {
            var value = $("#u_treatment").val();
            $("#hc_select").val(value);
            form.render();
            $("#hc_select").next().find("dl").css({ "display": "block" });
            var dl = $("#hc_select").next().find("dl").children();
            var j = -1;
            for (var i = 0; i < dl.length; i++) {
                if (dl[i].innerHTML.indexOf(value) <= -1) {
                    dl[i].style.display = "none";
                    j++;
                }
                if (j == dl.length-1) {
                    $("#hc_select").next().find("dl").css({ "display": "none" });
                }
            }
        }

        function initProfile(user, close) {
            if (close){
                $("#u_treatment").attr("disabled", "disabled");
                $("#u_work").attr("disabled", "disabled");
                $("#u_become").attr("disabled", "disabled");
                $("#u_out").attr("disabled", "disabled");
            }
            $("#u_id").val(user.uId);
            $("#u_name").val(user.uName);
            $("#u_born").val(user.uBorn);
            if (user.uMarried == 1)
                $("#nomarr").prop("checked", true);
            if (user.uSex == 2)
                $("#noman").prop("checked", true);
            $("#dddd").citypicker("reset");
            $("#dddd").citypicker("destroy");
            $("#dddd").citypicker({
                province: user.uProvince,
                city: user.uCity
            });
            $("#u_age").val(user.uAge);
            $("#u_height").val(user.uHeight);
            $("#u_ethnic").val(user.uEthnic);
            $("#u_polity").val(user.uPolity);
            $("#u_subscript").val(user.uSubscript);
            $("#u_post").val(user.uPost);
            $("#u_identity").val(user.uIdentity);
            $("#u_treatment").val(user.uTreatment);
            $("#u_work").val(user.uWork);
            $("#u_become").val(user.uBecome);
            $("#u_out").val(user.uOut);
            $("#u_address").val(user.uAddress);
            $("#u_phone").val(user.uPhone);
            $("#u_wx").val(user.uWx);
            $("#u_qq").val(user.uQq);
            $("#u_first").val(user.uFirst);
            $("#u_first_start").val(user.uFirstStart);
            $("#u_first_end").val(user.uFirstEnd);
            $("#u_first_school").val(user.uFirstSchool);
            $("#u_first_major").val(user.uFirstMajor);
            $("#u_peak").val(user.uPeak);
            $("#u_peak_start").val(user.uPeakStart);
            $("#u_peak_end").val(user.uPeakEnd);
            $("#u_peak_school").val(user.uPeakSchool);
            $("#u_peak_major").val(user.uPeakMajor);
            $("#u_old_address").val(user.uOldAddress);
            $("#u_content").val(user.uContent);
            $("#u_textarea1").val(user.uTextarea1);
            $("#u_textarea2").val(user.uTextarea2);
            $("#u_number1").val(user.uNumber1);
            $("#u_number2").val(user.uNumber2);
            $("#u_date1").val(user.uDate1);
            $("#u_date2").val(user.uDate2);
            $("#u_string1").val(user.uString1);
            $("#u_string2").val(user.uString2);
            if (user.uPicture != null && user.uPicture != "") {
                $("#photoImage").html('<img src="photos/' + user.uPicture + '" alt="" class="layui-upload-img" style="width: 100%;height: 100%" >')
            }
            // loadSchools();
            form.render("select")
        }

        /*function loadSchools() {
            var url = "home/allschools";
            $.ajax({
                "url": url,
                "type": "GET",
                "dataType": "json",
                "success": function (name) {
                    for (var i in name) {
                        var option = $('<option>').html(name[i]);
                        $("#schools").append(option);
                    }
                },
                "error": function () {
                }
            });
        }*/

        function loadRecord(id) {
            var url = "home/show_profile";
            if (id==null){
                id=0;
            }
            $.ajax({
                "url": url,
                "data": "uAid="+id,
                "type": "POST",
                "dataType": "json",
                "success": function (obj) {
                    if (obj.code == 200) {
                        if (obj.hide==1){
                            $("#editProfile").hide();
                            initProfile(obj.user, obj.close);
                        }else{
                            if (obj.uAid!=null){
                                $("#u_aid").val(obj.uAid);
                            }
                            initProfile(obj.user, obj.close);
                        }
                    }else if(obj.code == 300){
                        $("#editProfile").hide();
                    }else {
                        alert(obj.msg);
                    }
                },
                "error": function () {
                }
            });
        }

        function initDef(user) {
            for (var i in user) {
                if (user[i] == "on") {
                    $("#" + i).show();
                } else if (user[i] != "") {
                    $("#" + i).html(user[i]);
                }
            }
        }

        function loadDef(id) {
            var url = "home/show_def";
            $.ajax({
                "url": url,
                "type": "GET",
                "dataType": "json",
                "success": function (obj) {
                    if (obj.code == 200) {
                        initDef(obj.userEnable);
                        loadRecord(id);
                    } else {
                        alert(obj.msg);
                    }
                },
                "error": function () {
                }
            });
        }

        window.onload = loadDef(${d});

        //自定义表单验证（金额）
        form.verify({
            salary: [
                /(^$)|^[0-9]{2,3}00$/
                ,'期望薪资必须大于1000,并为一百的整数倍'
            ]
        });
    });

    function OpenMapAddressSearch(addr) {
        layer.open({
            type: 1
            , title: '地址搜索'
            , content: $("#address").html()
            , area: ['1000px', '650px']
            , zIndex: 900
            , offset: '10px'
        });
        var input = '<input type="text" id="i'+ addr +'" autocomplete="off" class="layui-input">';
        $("#addaddri").append(input);
        var btn = '<button type="button" class="layui-btn" id="saveaddr" onclick="saveAddr(\''+addr+'\')">保存地址</button>';
        $("#addaddr").append(btn);
        var map = new qq.maps.Map(document.getElementById("container"),{
            center: new qq.maps.LatLng(29.873992, 121.549987),
            zoom: 12
        });
        //实例化自动完成,需要引入libraries=place库，不是autocomplete库。
        var ap = new qq.maps.place.Autocomplete(document.getElementById('i'+addr), {
            offset: new qq.maps.Size(0, 5),
            location: '北京市'
        });
        var keyword = "";
        //调用Poi检索类。用于进行本地检索、周边检索等服务。
        var searchService = new qq.maps.SearchService({
            complete : function(results){
                if(results.type === "CITY_LIST") {
                    searchService.setLocation(results.detail.cities[0].cityName);
                    searchService.search(keyword);
                    return;
                }
                var pois = results.detail.pois;
                var latlngBounds = new qq.maps.LatLngBounds();
                for(var i = 0,l = pois.length;i < l; i++){
                    var poi = pois[i];
                    latlngBounds.extend(poi.latLng);
                    var marker = new qq.maps.Marker({
                        map:map,
                        position: poi.latLng
                    });
                    marker.setTitle(poi.name);
                }
                map.fitBounds(latlngBounds);
            }
        });
        qq.maps.event.addListener(map, 'click', function(event) {
            var geocoder = new qq.maps.Geocoder();
            var latLng = new qq.maps.LatLng(event.latLng.getLat(), event.latLng.getLng());
            geocoder.getAddress(latLng);
            geocoder.setComplete(function(rs) {
                var rsJson = JSON.parse(JSON.stringify(rs));
                $("#i"+addr).val(rsJson.detail.address);
                // var address={};
                // address.province = rsJson.detail.addressComponents.province;
                // alert('您点击的位置为d: [' + address.province + ']');
            });
        });
        //添加监听事件
        qq.maps.event.addListener(ap, "confirm", function(res){
            keyword = res.value;
            searchService.search(keyword);
        });
    }

    function duqv() {
        var s1 = $("#uPicture")[0].files
        var reader = new FileReader();
        reader.readAsDataURL(s1[0]);
        reader.onload = function (ev) {
            $("#photoImage").html('<img src="' + this.result + '" alt="" class="layui-upload-img" style="width: 100%;height: 100%" >')
        }
    }

</script>
<script type="text/javascript">
    function getsearch() { }

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

    function saveAddr(addr) {
        $("#"+addr).val($("#i"+addr).val());
        layer.closeAll();
    }

    function editProfile() {
        var fdata = $("#user-profile").serialize();
        // var formdata = new FormData($("#user-profile")[0]).serialize();
        var str = $("#dddd").val().split("/");
        uProvince = str[0];
        uCity = str[1];
        // 通过AJAX发送请求，处理结果
        $.ajax({
            "url": "home/handle_edit_profile",
            "data": fdata + "&uProvince=" + uProvince + "&uCity=" + uCity,
            "type": "POST",
            "dataType": "json",
            "success": function (obj) {
                layer.msg(obj.msg,{
                    offset: '15px'
                    ,icon: 1
                    ,time: 1000
                    }, function(){
                        window.location.reload();
                });
            },
            "error": function () {
                layer.alert("提交失败,请检查表单")
            }
        });
    }

    $("#u_treatment").blur(function(){
        $("#hc_select").next().find("dl").css({ "display": "none" });
    })

    // window.onload=loadRecord;
</script>
<script>
    //打印
    var LODOP; //声明为全局变量

    $("#prn1_preview").bind("click", function () {
        //打印预览
        LODOP = getLodop();
        CreateOneFormPage();//公共的方法（把一样的代码都提取出来）
        LODOP.PREVIEW();
    })

    $("#prn1_print").bind("click", function () {
        //直接打印
        LODOP = getLodop();
        CreateOneFormPage();//公共的方法
        LODOP.PRINT();
    })

    $("#prn1_printA").bind("click", function () {
        //维护
        LODOP = getLodop();
        CreateOneFormPage();//公共的方法
        LODOP.PRINT_SETUP();
    })

    $("#prn1_printB").bind("click", function () {
        //选择打印机
        LODOP = getLodop();
        CreateOneFormPage();//公共的方法
        LODOP.PRINTA();
    })

    function CreateOneFormPage() {

        //打印的是BootStrop的页面，所以要把他的css加进来，否则打印是样式会没有，很难看
        var strStyleCSS = "";
        strStyleCSS += "<link rel=\"stylesheet\" href=\"layuiadmin/layui/css/layui.css\" media=\"all\">";
        strStyleCSS += "<link rel=\"stylesheet\" href=\"layuiadmin/style/admin.css\" media=\"all\">";
        strStyleCSS += "<link rel=\"stylesheet\" href=\"css/city-picker.css\"/>";

        //设定打印任务名
        /* LODOP.PRINT_INIT("Mysql更改密码的四种方法");*/
        //设置打印项风格
        LODOP.SET_PRINT_STYLE("FontSize", 15);

        LODOP.SET_PRINT_STYLE("Bold", 1);

        //设置横向打印
        /* LODOP.SET_PRINT_PAGESIZE(2,"700mm","3000","");*/


        //设施内容的宽高  参数100表示距离左侧11px;88表示距离顶部88px
        LODOP.ADD_PRINT_HTM(88, 11, "100%", "100%", strStyleCSS  + document.getElementsByTagName("html")[0].innerHTML );

        //设置预览窗口的显示模式和大小
        LODOP.SET_PREVIEW_WINDOW(1, 0, 0, 0, 0, "");
    }

    function getProgramData() {
        LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
        if (LODOP.CVERSION) LODOP.On_Return=function(TaskID,Value){document.getElementById('S1').value=Value;};
        document.getElementById('S1').value=LODOP.GET_VALUE("ProgramData",0);	//获得文档式模板
    };

    function saveProgramData() {
        $.ajax({
            "url": "print/save",
            "data": "data=" + document.getElementById('S1').value,
            "type": "POST",
            "dataType": "text",
            "success": function (obj) {
                console.log(123)
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

        // console.log(123)
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
        LODOP=getLodop();
        LODOP.ADD_PRINT_DATA("ProgramData",document.getElementById('S1').value); //装载模板
        //按类名赋值
        LODOP.SET_PRINT_STYLEA("jj_xm","CONTENT","张三");
        LODOP.SET_PRINT_STYLEA("jj_dz","CONTENT","北京昌平昌盛路XX号");
        LODOP.SET_PRINT_STYLEA("jj_dh","CONTENT","18612345678");
        LODOP.SET_PRINT_STYLEA("sj_xm","CONTENT","李四");
        LODOP.SET_PRINT_STYLEA("sj_dz","CONTENT","山东泰安市泰山区青年路28号银泰大厦");
        LODOP.SET_PRINT_STYLEA("sj_dh","CONTENT","15612345678");
        LODOP.PREVIEW();
        LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
    };

    function CreatePage() {
        LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
        LODOP.PRINT_INITA(0,0,665,600,"打印控件功能演示_Lodop功能_演示文档式模板生成和使用");
        LODOP.ADD_PRINT_TEXTA("u_name",83,78,200,20,"姓名");
    };
</script>
</body>
</html>



