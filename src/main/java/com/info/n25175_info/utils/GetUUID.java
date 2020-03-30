package com.info.n25175_info.utils;

import java.util.UUID;

public class GetUUID {



    public static String getUUID(){
        String s = UUID.randomUUID().toString().replace("-", "");


        return s;
    }


    public static  String getNumber(Integer id){
        int number=1000000+id;
        String a="A";
        String suffix=String.valueOf(number).substring(1);
        String finalNumber=a+suffix;
        System.out.println(finalNumber);
        return finalNumber;
    }


    public static void main(String[] args) {
        getNumber(12);
    }
}
