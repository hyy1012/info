package com.info.n25175_info.interceptor;

import com.info.n25175_info.entity.N25175Admin;
import com.info.n25175_info.utils.LoginCache;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Class Name:com.info.n25175_info.interceptor LoginListener
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/16 0016 14:31
 * Description: LoginListener
 * ==========================
 */
public class LoginListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        String name = se.getName();
        if (name.equals("user")){
            String attVal=((N25175Admin)se.getValue()).getaUsername();
            HttpSession session = se.getSession();
            String sessionId = session.getId();
            String sessionId2 = LoginCache.getInstance().getSessionIdByUser(attVal);
            if (sessionId2!=null&&!sessionId.equals(sessionId2)){
                HttpSession session2=LoginCache.getInstance().getSessionById(sessionId2);
                session2.invalidate();
                LoginCache.getInstance().removeSession(attVal);
            }
            LoginCache.getInstance().setSessionByUser(attVal,sessionId);
            LoginCache.getInstance().setSessionById(sessionId,session);

        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {

    }
}
