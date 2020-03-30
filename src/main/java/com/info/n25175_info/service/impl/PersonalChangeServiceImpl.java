package com.info.n25175_info.service.impl;

import com.info.n25175_info.dao.N25175OrganMapper;
import com.info.n25175_info.dao.N25175PersonnelChangeMapper;
import com.info.n25175_info.dao.N25175PostMapper;
import com.info.n25175_info.entity.N25175Organ;
import com.info.n25175_info.entity.N25175PersonnelChange;
import com.info.n25175_info.entity.N25175PersonnelChangeExample;
import com.info.n25175_info.entity.N25175Post;
import com.info.n25175_info.service.PersonalChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Class Name:com.info.n25175_info.service.impl PersonalChangeServiceImpl
 * ==========================
 * Author: 陈佳峰
 * Date: 2020/1/8 0008 10:18
 * Description: PersonalChangeServiceImpl
 * ==========================
 */
@Service
public class PersonalChangeServiceImpl implements PersonalChangeService {

    @Autowired
    private N25175PersonnelChangeMapper n25175PersonnelChangeMapper;

    @Autowired
    private N25175PostMapper n25175PostMapper;

    @Autowired
    private N25175OrganMapper n25175OrganMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    // s1 实习2未审核 3 试用 4正式员工 5副主管 6副经理 7副总经理 8总经理  9 离职
    //1 离职 2转正 3晋升 4降职 5转岗 6复职 7入职
    //p岗位变动
    public boolean addRecord(String name, Integer s1, Integer s2, Integer p1, Integer p2, Integer o1, Integer o2) {

        if (s1!=null&&s2!=null&&s1.intValue()!=s2.intValue()){
            String status1 = getStatus(s1);
            String status2 = getStatus(s2);
            N25175PersonnelChange change = new N25175PersonnelChange();
            change.setPcName(name);
            if (s2==9){
                change.setPcType(1);
                change.setPcContent("从"+status1+"离职");
            }else if (s1.intValue()==1||s1.intValue()==3){
                 if (s2!=2&&s2!=1&&s2!=3){
                     change.setPcType(2);
                     change.setPcContent("从"+status1+"转正为"+status2);
                 }
            }else if (s1.intValue()==2){
                if (s2!=9){
                    change.setPcType(7);
                    change.setPcContent("入职为"+status2);
                }
            }else if (s1.intValue()==9){
                 change.setPcType(6);
                 change.setPcContent("复职为"+status2);
            }else{
                if (s1.intValue()>s2.intValue()){
                    change.setPcType(4);
                    change.setPcContent("从"+status1+"降职为"+status2);
                }else{
                    change.setPcType(3);
                    change.setPcContent("从"+status1+"晋升为"+status2);
                }
            }
            if (change.getPcType()!=null){
                n25175PersonnelChangeMapper.insertSelective(change);
            }
        }

        if (p1!=null&&p2!=null&&p1.intValue()!=p2.intValue()){
            String post1 = getPost(p1);
            String post2 = getPost(p2);
            N25175PersonnelChange change = new N25175PersonnelChange();
            change.setPcName(name);
            change.setPcType(5);
            change.setPcContent("从"+post1+"转岗为"+post2);
            n25175PersonnelChangeMapper.insertSelective(change);
        }

        if (o2!=null){
            if (o1!=null){
                if (o1.intValue()!=o2.intValue()){
                    String depart1 = getDepart(o1);
                    String depart2 = getDepart(o2);
                    N25175PersonnelChange change = new N25175PersonnelChange();
                    change.setPcName(name);
                    change.setPcType(8);
                    change.setPcContent("从"+depart1+"转到"+depart2);
                    n25175PersonnelChangeMapper.insertSelective(change);
                }
            }else {
                String depart2 = getDepart(o2);
                N25175PersonnelChange change = new N25175PersonnelChange();
                change.setPcName(name);
                change.setPcType(8);
                change.setPcContent("入职到"+depart2);
                n25175PersonnelChangeMapper.insertSelective(change);
            }
        }

        return false;
    }


    // s1 实习2未审核 3 试用 4正式员工 5副主管 6副经理 7副总经理 8总经理  9 离职
    private String getStatus(Integer s){
        String content = "未知状态";
        if (s==1){
            content = "实习";
        }else if(s==2){
            content = "未审核";
        }else if(s==3){
            content = "试用";
        }else if(s==4){
            content = "正式员工";
        }else if(s==5){
            content = "副主管";
        }else if(s==6){
            content = "副经理";
        }else if(s==7){
            content = "副总经理";
        }else if(s==8){
            content = "总经理";
        }else if(s==9){
            content = "离职";
        }
        return content;
    }

    private String getPost(Integer p){
        N25175Post n25175Post = n25175PostMapper.selectByPrimaryKey(p);
        String post = "未知职位";
        if (n25175Post!=null){
            post=n25175Post.getNpName();
        }
        return post;
    }

    private String getDepart(Integer p){
        N25175Organ n25175Organ = n25175OrganMapper.selectByPrimaryKey(p);
        String organ = "未知部门";
        if (n25175Organ!=null){
            organ = n25175Organ.getnName();
        }
        return organ;
    }


    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<N25175PersonnelChange> getRecord(String name) {
        N25175PersonnelChangeExample n25175PersonnelChangeExample = new N25175PersonnelChangeExample();
        n25175PersonnelChangeExample.setOrderByClause("pc_date DESC");
        N25175PersonnelChangeExample.Criteria criteria = n25175PersonnelChangeExample.createCriteria();
        if (name!=null&&!name.equals("")){
            criteria.andPcNameLike("%"+name+"%");
        }
        List<N25175PersonnelChange> n25175PersonnelChanges = n25175PersonnelChangeMapper.selectByExample(n25175PersonnelChangeExample);
        return n25175PersonnelChanges;
    }

}
