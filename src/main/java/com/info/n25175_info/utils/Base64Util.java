package com.info.n25175_info.utils;


import sun.misc.CharacterEncoder;

import java.io.UnsupportedEncodingException;

public class Base64Util {


    /**
     * base64加密
     * @param str
     * @return
     */
    //js前端页面调用jquery.base64.js
    public static final String getBase64(String str){
        try {
            byte[] bytes=str.getBytes("UTF-8");
            java.util.Base64.Encoder encoder= java.util.Base64.getEncoder();
            String base=encoder.encodeToString(bytes);

            return base;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }


    }

    /**
     * 解密
     * @param str
     * @return
     */
    public static final String getBase(String str){
        try {
        java.util.Base64.Decoder decoder=java.util.Base64.getDecoder();
        byte[] bytes=decoder.decode(str);
            return new String(bytes,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
