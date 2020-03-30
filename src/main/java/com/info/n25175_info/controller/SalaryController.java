package com.info.n25175_info.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.info.n25175_info.dto.SalRecodeDto;
import com.info.n25175_info.dto.SalaryItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Class Name: com.info.n25175_info.controller.SalaryController
 * ==================================
 * Author c25175 黄凯
 * Date 2020/1/9 10:51
 * Description: SalaryController
 * ==================================
 */
@Controller
@RequestMapping("/salary")
public class SalaryController {

    @RequestMapping(value = "/toSalary", method = RequestMethod.GET)
    public String toSalary(ModelMap modelMap){
        List<SalaryItem> test = new ArrayList<>();
        SalaryItem salaryItem = new SalaryItem();
        salaryItem.setName("基本类型");
        salaryItem.setPrice(1000);
        test.add(salaryItem);
        SalaryItem salaryItem2 = new SalaryItem();
        salaryItem2.setName("加班工资");
        salaryItem2.setPrice(500);
        test.add(salaryItem2);
        test.add(salaryItem2);
        test.add(salaryItem2);
        test.add(salaryItem2);
        test.add(salaryItem2);
        test.add(salaryItem2);
        test.add(salaryItem2);
        test.add(salaryItem2);
        test.add(salaryItem2);
        System.out.println("===="+test);
        modelMap.addAttribute("test", test);
        return "salary/salaryInfo";
    }

    /**
     * 根据条件分页查询
     * @param page 当前页
     * @param limit 限制数
     * @param name 名字
     * @param request
     * @return
     */
    @RequestMapping("/getSalary")
    @ResponseBody
    public JSONObject getInner(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer limit,
                               String field, String order, Integer status, String name, HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        PageHelper.startPage(page,limit);
//        List<N25175Admin> n25175Admins = adminService.selectByStatus(status,null, name, request, field, order);
//        PageInfo info = new PageInfo(n25175Admins);
        List<SalRecodeDto> list = new ArrayList<>();
        List<Integer> price = new ArrayList<>();
        SalRecodeDto salRecode = new SalRecodeDto();
        salRecode.setAId(1);
        salRecode.setName("李小龙");
        price.add(1000);
        price.add(500);
        salRecode.setPrice(price);
        list.add(salRecode);
        jsonObject.put("code",0);
        jsonObject.put("count",1);
        jsonObject.put("msg","");
        jsonObject.put("data",list);

        return jsonObject;
    }

}
