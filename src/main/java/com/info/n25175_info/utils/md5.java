package com.info.n25175_info.utils;

import com.alibaba.fastjson.JSONObject;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class md5 {
    /**
     *
     * @param str  需要加密的字符串
     * @return
     */
    public static final String getMD5(String str){
        try {
            //拿到一个MD5转换器（如果想要SHA1则把参数换成SHA1）
            MessageDigest messageDigest=MessageDigest.getInstance("MD5");
            //根据字符串得到字符数组并更新摘要
            messageDigest.update(str.getBytes());
            //转换并返回数据
            byte[] result=messageDigest.digest();

          /*  // 首先初始化一个字符数组，用来存放每个16进制字符
            char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9', 'A','B','C','D','E','F' };

            // new一个字符数组，这个就是用来组成结果字符串的（解释一下：一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方））
            char[] resultCharArray =new char[result.length * 2];

            // 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去
            int index = 0;
            for (byte b : result) {
                resultCharArray[index++] = hexDigits[b>>> 4 & 0xf];
                resultCharArray[index++] = hexDigits[b& 0xf];
            }
            return new String(resultCharArray);*/

          return new BigInteger(1,result).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }



    public static String getMd5(String str) {
        StringBuffer buf = new StringBuffer("");
        try {
            // 生成实现指定摘要算法的 MessageDigest 对象。
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 使用指定的字节数组更新摘要。
            md.update(str.getBytes());
            // 通过执行诸如填充之类的最终操作完成哈希计算。
            byte b[] = md.digest();
            // 生成具体的md5密码到buf数组
            System.out.println(Arrays.toString(b));
            System.out.println(new BigInteger(1, b));
            int i;

            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            //System.out.println("32位: " + buf.toString());// 32位的加密
            //System.out.println("16位: " + buf.toString().substring(8, 24)); // 16位的加密，其实就是32位加密后的截取
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buf.toString();
    }


}
