package com.info.n25175_info.utils;

/**
 * Class Name: com.info.n25175_info.utils.IntegerUtil
 * ==================================
 * Author c25175 黄凯
 * Date 2020/1/613:59
 * Description: IntegerUtil
 * ==================================
 */
public class IntegerUtil {

    public static String getEducation(Integer id){
        switch (id){
            case 1:
                return "专科";
            case 2:
                return "本科";
            case 3:
                return "硕士";
            case 4:
                return "博士";
            case 5:
                return "其他";
            default:
                return "";
        }
    }

    public static String getEthnic(Integer id){
        switch (id){
            case 0:
                return "汉";
            case 1:
                return "少数民族";
            case 2:
                return "其他";
            default:
                return "";
        }
    }

    public static String getPolity(Integer id){
        switch (id){
            case 1:
                return "中共党员";
            case 2:
                return "中共预备党员";
            case 3:
                return "共青团员";
            case 4:
                return "群众";
            case 5:
                return "其他";
            default:
                return "";
        }
    }

}
