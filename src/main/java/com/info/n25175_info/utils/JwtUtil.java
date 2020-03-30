package com.info.n25175_info.utils;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Class Name:com.info.n25175_info.utils JwtUtil
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/11/7 0007 15:49
 * Description: JwtUtil
 * ==========================
 */
public class JwtUtil {



    private static final String SecretKey = "test";
    //签发者
    private static final String Issuer = "me";


    /**
     * 生成JWT
     * @param userId 用户ID
     * @param role 用户角色
     * @param author 用户权限
     * @return
     */
    public static String getJwtToken(Long exp,String userId,String role,String author){
        //生成签名的算法
        SignatureAlgorithm signatureAlgorithm=SignatureAlgorithm.HS256;
       //生成时间
        long createLong=System.currentTimeMillis();
        Date createTime = new Date(createLong);

        //添加头信息
        Map<String,Object> headMap=new HashMap<>();
            /*
            Header
            {
              "alg": "HS256",
              "typ": "JWT"
            }
         */
        headMap.put("alg", SignatureAlgorithm.HS256.getValue());
        headMap.put("typ", "JWT");
       //添加body信息
        Map<String,Object> bodyMap=new HashMap<>();
        if (userId!=null)
        bodyMap.put("id",userId);
        if (role!=null)
            bodyMap.put("role",role);
        if (author!=null)
            bodyMap.put("author",author);

        JwtBuilder builder= Jwts.builder().setHeader(headMap).setClaims(bodyMap).setIssuer(Issuer)
                .setIssuedAt(createTime).signWith(signatureAlgorithm,SecretKey);

        //有效时间
        if (exp>=0){
        Date expireTime=new Date((createLong+exp));
        builder.setExpiration(expireTime).setNotBefore(createTime);
        }
        return builder.compact();


    }



    //解析JWT
    public static Claims decodeJwt(String token) throws UserLoginInvalidException, UserLoginException {

        try {
            Claims claims=Jwts.parser().setSigningKey(SecretKey).parseClaimsJws(token).getBody();
            return claims;
        } catch (ExpiredJwtException e) {
            e.printStackTrace();
            throw new UserLoginInvalidException("登录信息过期，请重新登录");
        } catch (Exception e) {
            e.printStackTrace();
            throw new UserLoginException("用户未登录，请重新登录");
        }
    }

    public static void main(String[] args) {
        String jwtToken = getJwtToken((long) 10000, String.valueOf(1), null, null);
        System.out.println(jwtToken);
        try {
            try {
                System.out.println(decodeJwt(jwtToken));
            } catch (UserLoginException e) {
                e.printStackTrace();
            }
        } catch (UserLoginInvalidException e) {

        }
    }
}
