package com.info.n25175_info.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.info.n25175_info.dao.N25175AdminMapper;
import com.info.n25175_info.dao.N25175ResponseMapper;
import com.info.n25175_info.dao.N25175SubmitMapper;
import com.info.n25175_info.dto.SubmitBody;
import com.info.n25175_info.dto.SubmitDto;
import com.info.n25175_info.entity.*;
import com.info.n25175_info.service.ParamService;
import com.info.n25175_info.service.SubmitService;
import com.info.n25175_info.utils.Des;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.service.impl SubmitServiceImpl
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/24 0024 14:15
 * Description: SubmitServiceImpl
 * ==========================
 */
@Service
public class SubmitServiceImpl implements SubmitService {

    @Autowired
    private N25175SubmitMapper n25175SubmitMapper ;

    @Autowired
    private N25175AdminMapper n25175AdminMapper;

    @Autowired
    private N25175ResponseMapper n25175ResponseMapper;

    @Autowired
    private ParamService paramService;

    @Override
    @Transactional
    public JSONObject setRecord(String token, SubmitBody body) {
        JSONObject jsonObject = new JSONObject();
        System.out.println(token==null);
        if (token==null){
            jsonObject.put("code",201);
            return jsonObject;
        }
        String decrypt = Des.decrypt(Des.DesPassword, token);
        String[] split = decrypt.split("-");
        if (split.length==2){
            N25175AdminExample n25175AdminExample = new N25175AdminExample();
            n25175AdminExample.createCriteria().andAUsernameEqualTo(split[1]);
            List<N25175Admin> n25175Admins = n25175AdminMapper.selectByExample(n25175AdminExample);
            if (n25175Admins.size()>0){
                int mark=0;
                int sumMark=0;
                List<SubmitDto> subs = body.getSubs();
                for(SubmitDto submitDto:subs){
                    mark +=submitDto.getsMark();
                    sumMark += submitDto.getsScore();
                    submitDto.setsAid(n25175Admins.get(0).getaId());
                    n25175SubmitMapper.insertSelective(submitDto);
                    List<N25175Response> responses = submitDto.getResponses();
                    for (N25175Response response:responses){
                        response.setrSubmitid(submitDto.getsId());
                        n25175ResponseMapper.insertSelective(response);
                    }
                }
                N25175Admin admin = n25175Admins.get(0);
                admin.setaSum(mark+"/"+sumMark);
                n25175AdminMapper.updateByPrimaryKeySelective(admin);
                jsonObject.put("code",200);
                jsonObject.put("mark",mark);
                jsonObject.put("sum",sumMark);
                N25175Param markToPrice = paramService.getParamByString("markToPrice");
                Integer integer = markToPrice.getpValue()*mark;
                jsonObject.put("money",integer);

            }else{
                jsonObject.put("code",201);
            }
        }else{
            jsonObject.put("code",201);
        }
        return jsonObject;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<N25175Submit> getRecord(Integer id) {
        N25175SubmitExample n25175SubmitExample = new N25175SubmitExample();
        n25175SubmitExample.createCriteria().andSAidEqualTo(id);
        List<N25175Submit> n25175Submits = n25175SubmitMapper.selectByExample(n25175SubmitExample);
        return n25175Submits;
    }
}
