package com.info.n25175_info.interceptor;

import com.info.n25175_info.entity.N25175Admin;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TologinInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        N25175Admin user=(N25175Admin)request.getSession().getAttribute("user");
        System.out.println(1);
        if (user!=null){
            request.getRequestDispatcher("/index/to_index").forward(request,response);
            return false;
        }

        return true;
    }
}
