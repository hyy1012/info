package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dto.OrganDto;
import com.info.n25175_info.entity.Catalog;
import com.info.n25175_info.entity.N25175Organ;
import com.info.n25175_info.service.DepartmentService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

/**
 * Class Name:com.info.n25175_info.controller DepartmentController
 * ==========================
 * Author: 陈佳峰
 * Date: 2020/1/7 0007 14:37
 * Description: DepartmentController 组织管理
 * ==========================
 */
@RequestMapping("/depart")
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/to_item")
    public String toItem() {
        return "home/items";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public JSONObject getAll() {
        JSONObject jsonObject = new JSONObject();
        /*List<N25175Organ> all = departmentService.getAll(null);
        List<Catalog> list1 = new ArrayList<>();
        for (N25175Organ organ : all) {
            Catalog catalog = new Catalog();
            catalog.setTitle(organ.getnName());
            catalog.setId(organ.getnId());
            List<N25175Organ> all1 = departmentService.getAll(organ.getnId());
            List<Catalog> list = new ArrayList<>();
            for (N25175Organ organ1 : all1) {
                Catalog catalog1 = new Catalog();
                catalog1.setTitle(organ1.getnName());
                catalog1.setId(organ1.getnId());
                list.add(catalog1);
            }
            catalog.setChildren(list);
            list1.add(catalog);
        }*/
        List<N25175Organ> top = departmentService.getAll(null);
        List<OrganDto> all = new ArrayList<>();
        for (N25175Organ organ : top) {
            OrganDto organDto = new OrganDto();
            departmentService.getOrganDto(organDto, organ);
            all.add(organDto);
        }
        jsonObject.put("code", 200);
        jsonObject.put("list", all);
        System.out.println(all);
        return jsonObject;
    }


    @RequestMapping("/add")
    @ResponseBody
    public JSONObject add(N25175Organ organ) {
        JSONObject jsonObject = new JSONObject();
        boolean add = departmentService.add(organ);
        System.out.println(organ.getnId());
        if (add) {
            jsonObject.put("code", 200);
            jsonObject.put("reID", organ.getnId());
        } else {
            jsonObject.put("code", 201);
        }
        return jsonObject;
    }


    @RequestMapping("/edit")
    @ResponseBody
    public JSONObject edit(N25175Organ organ) {
        JSONObject jsonObject = new JSONObject();
        boolean edit = departmentService.edit(organ);
        if (edit) {
            jsonObject.put("code", 200);
        } else {
            jsonObject.put("code", 201);
        }
        return jsonObject;

    }


    @RequestMapping("/delete")
    @ResponseBody
    public JSONObject delete(Integer id) {
        JSONObject jsonObject = new JSONObject();
        boolean edit = departmentService.delete(id);
        if (edit) {
            jsonObject.put("code", 200);
        } else {
            jsonObject.put("code", 201);
        }
        return jsonObject;

    }


}
