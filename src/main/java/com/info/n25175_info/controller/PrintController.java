package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.utils.IntegerUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Class Name:com.info.n25175_info.controller IndexController
 * ==========================
 * Author: huangk
 * Date: 2019/12/16 0016 16:15
 * Description: IndexController
 * ==========================
 */
@RequestMapping("/print")
@Controller
@Slf4j
public class PrintController {

    SimpleDateFormat sdfborn = new SimpleDateFormat("yyyy年MM月");
    SimpleDateFormat sdfnor = new SimpleDateFormat("yyyy/MM/dd");

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public String save(String data){
        try{
            saveModel(data);
            return "保存成功";
        }catch (Exception e){
            return "保存失败";
        }
    }

    @RequestMapping(value = "/getModel", method = RequestMethod.GET)
    @ResponseBody
    public String getModel(){
        String sql = "select model from n25175_print where id=1";
        String model = jdbcTemplate.queryForObject(sql, String.class);
        return model;
    }

    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    @ResponseBody
    public JSONObject getData(Integer id){
        JSONObject jsonObject = new JSONObject();
        String sql = "select * from n25175_user u left join n25175_post p on u_post = np_id where u_aid=?";
//        Map<String, Object> map = jdbcTemplate.queryForObject(sql, Map.class, id);
        Map<String, Object> dataMap = jdbcTemplate.queryForMap(sql, id);
        modifyDataMap(dataMap);
        jsonObject.put("code", 200);
        jsonObject.put("map", dataMap);
        return jsonObject;
    }

    public void saveModel(String data){
        String sql = "update n25175_print set model=? where id=1";
        int i = jdbcTemplate.update(sql, data);
    }

    public void modifyDataMap(Map map){
        map.put("u_sex", Integer.parseInt(map.get("u_sex").toString())==1?"男":"女");
        map.put("u_married", Integer.parseInt(map.get("u_married").toString())==1?"是":"否");
        map.put("u_first_se",null); map.put("u_peak_se",null); map.put("u_birthplace",null);
        if (map.get("u_born")!=null) //出生年月
            map.put("u_born", sdfborn.format(map.get("u_born")));
        if (map.get("u_first")!=null) //最高学历
            map.put("u_first", IntegerUtil.getEducation(Integer.parseInt(map.get("u_first").toString())));
        if (map.get("u_peak")!=null) //最高学历
            map.put("u_peak", IntegerUtil.getEducation(Integer.parseInt(map.get("u_peak").toString())));
        if (map.get("u_first_start")!=null && map.get("u_first_end")!=null) //第一学历起始时间
            map.put("u_first_se", sdfnor.format(map.get("u_first_start")) + " - " + sdfnor.format(map.get("u_first_end")));
        if (map.get("u_peak_start")!=null && map.get("u_peak_end")!=null) //最高学历起始时间
            map.put("u_peak_se", sdfnor.format(map.get("u_peak_start")) + " - " + sdfnor.format(map.get("u_peak_end")));
        if (map.get("u_ethnic")!=null) //民族
            map.put("u_ethnic", IntegerUtil.getEthnic(Integer.parseInt(map.get("u_ethnic").toString())));
        if (map.get("u_province")!=null && map.get("u_city")!=null) //籍贯
            map.put("u_birthplace", map.get("u_province").toString().replace("省","")+map.get("u_city").toString().replace("市",""));
        if (map.get("u_polity")!=null) //政治面貌
            map.put("u_polity", IntegerUtil.getPolity(Integer.parseInt(map.get("u_polity").toString())));
    }



}
