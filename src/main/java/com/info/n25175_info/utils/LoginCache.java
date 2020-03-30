package com.info.n25175_info.utils;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Class Name:com.n25175_maintain.n25175_maintain.util LoginCache
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/11/22 0022 9:51
 * Description: LoginCache
 * ==========================
 */
public class LoginCache {
    private LoginCache(){
    }

    private static final  LoginCache instance=new LoginCache();

    private Map<String ,String> userToSessionId=new HashMap<String, String>();

    private Map<String,HttpSession> idToSession=new HashMap<String, HttpSession>();

    public static LoginCache getInstance(){
        return instance;
    }


    public String getSessionIdByUser(String username){
        return userToSessionId.get(username);
    }

    public HttpSession getSessionById(String sessionID){
        return idToSession.get(sessionID);
    }

    public void setSessionByUser(String username,String sessionId){
        userToSessionId.put(username,sessionId);
    }
    public void  setSessionById(String sessionId,HttpSession session){
        idToSession.put(sessionId,session);
    }
    public void removeSession(String username){
        String sessionId=userToSessionId.get(username);
        userToSessionId.remove(username);
        idToSession.remove(sessionId);
    }


}
