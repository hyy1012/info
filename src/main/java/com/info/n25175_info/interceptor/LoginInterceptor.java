package com.info.n25175_info.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Class Name:com.info.n25175_info.interceptor LoginInterceptor
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/16 0016 14:25
 * Description: LoginInterceptor
 * ==========================
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user")!=null){
            return true;
        }
        PrintWriter out = response.getWriter();
      /*  JSONObject jsonObject=new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("code1",2001);
        out.append(jsonObject.toJSONString());*/

        out.println("<script>top.location.href='"+request.getContextPath()+"/login/to_login?lg=1"+"';</script>");
        // response.sendRedirect(request.getContextPath()+"/login/to_login?lg=1");
        return false;
    }
}
