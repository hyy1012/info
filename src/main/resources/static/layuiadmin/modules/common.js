/**

 @Name：layuiAdmin 公共业务
 @Author：贤心
 @Site：http://www.layui.com/admin/
 @License：LPPL
    
 */
 
layui.define(function(exports){
  var $ = layui.$
  ,layer = layui.layer
  ,laytpl = layui.laytpl
  ,setter = layui.setter
  ,view = layui.view
  ,admin = layui.admin
  
  //公共业务的逻辑处理可以写在此处，切换任何页面都会执行
  //……
  
  
  
  //退出
  admin.events.logout = function(){
    //执行退出接口
    admin.req({
      url: layui.setter.base + 'json/user/logout.js'
      ,type: 'get'
      ,data: {}
      ,done: function(res){ //这里要说明一下：done 是只有 response 的 code 正常才会执行。而 succese 则是只要 http 为 200 就会执行
        
        //清空本地记录的 token，并跳转到登入页
        admin.exit(function(){
          location.href = 'user/login.html';
        });
      }
    });
  };


  var commonFunc = {
    getQueryVariable: function(search, paramName) {
      if (search == null || search == '' || search == undefined) {
        return undefined;
      }

      search = search.substring(1);
      var params = search.split('&');

      for (var i = 0; i < params.length; i++) {
        var param = params[i].split("=");
        if (param[0] == paramName) {
          return param[1];
        }
      }

      return undefined;
    },
    getURL: function() {
      return "http://localhost:8080/check/";
    },
  }





  //对外暴露的接口
  exports('common', commonFunc);
});