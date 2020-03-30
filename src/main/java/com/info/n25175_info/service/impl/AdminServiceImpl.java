package com.info.n25175_info.service.impl;

import com.info.n25175_info.dao.N25175AdminMapper;
import com.info.n25175_info.dao.N25175ResponseMapper;
import com.info.n25175_info.dao.N25175SubmitMapper;
import com.info.n25175_info.dao.N25175UserMapper;
import com.info.n25175_info.dto.AVGMoney;
import com.info.n25175_info.entity.*;
import com.info.n25175_info.service.AdminService;
import com.info.n25175_info.service.PersonalChangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.service.impl AdminServiceImpl
 * ==========================
 * Author: 陈佳峰
 * Date: 2019/12/17 0017 10:34
 * Description: AdminServiceImpl
 * ==========================
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    private Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    @Autowired
    private N25175AdminMapper n25175AdminMapper;

    @Autowired
    private N25175UserMapper n25175UserMapper;

    @Autowired
    private N25175SubmitMapper n25175SubmitMapper;

    @Autowired
    private N25175ResponseMapper n25175ResponseMapper;

    @Autowired
    private PersonalChangeService personalChangeService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<N25175Admin> selectByStatus(Integer status,Integer role,String name, HttpServletRequest request, String field, String order) {
        logger.warn("name:"+name);
        N25175Admin user = (N25175Admin) request.getSession().getAttribute("user");
        if (user==null){
            return null;
        }
        N25175AdminExample n25175AdminExample = new N25175AdminExample();
        //kai...
        if(field == null || order == null || "".equals(field) || "".equals(order))
            n25175AdminExample.setOrderByClause("a_id DESC");
        else if ("aUsername".equals(field) || "aStatus".equals(field) || "aDate".equals(field) || "aJnum".equals(field)) {
            String str = "a_" + field.charAt(1) + field.substring(2);
            n25175AdminExample.setOrderByClause(str + " " + order);
        }else if ("sex".equals(field) || "phone".equals(field) || "name".equals(field) || "post".equals(field))
            n25175AdminExample.setOrderByClause("u_" + field + " " + order);
        N25175AdminExample.Criteria criteria = n25175AdminExample.createCriteria();
        if (name!=null){
            criteria.andBy("u_name like '%"+name+"%'");
        }
        if (status!=null){
            //status 10,默认查找实习和试用的员工
            if (status==10){
                criteria.andOrStatus(1,3);
            }else if (status==11){
                List<Integer> ids = new ArrayList<>();
                ids.add(4);ids.add(5);ids.add(6);ids.add(7);ids.add(8);
                criteria.andAStatusIn(ids);
            }else if (status!=0){
                criteria.andAStatusEqualTo(status);
            }
        }else{
            criteria.andAStatusNotEqualTo(2).andAStatusNotEqualTo(9);
        }
        if (role!=null){
            criteria.andARoleEqualTo(role);
        }else{
            criteria.andARoleNotEqualToOrARoleIsNull(0);
        }
        List<N25175Admin> n25175Admins = n25175AdminMapper.selectByExample(n25175AdminExample);
        return n25175Admins;
    }

    @Override
    @Transactional
    public boolean addAdmin(N25175Admin admin, String phone, Integer sex, String name,Integer post) {
        admin.setaUsername(phone);
        admin.setaPassword("123456");
        List<N25175Admin> n25175Admins = findAdminList(admin);
        if (n25175Admins.size()>0){
            return false;
        }else{
            String sql = "select max(a_jnum) from n25175_admin";
            int i = 0;
            try {
                i = jdbcTemplate.queryForObject(sql, Integer.class);
            }catch (NullPointerException e){
            }
            admin.setaJnum(++i);
            admin.setaEdit(1);
            admin.setaDate(new Date());
            n25175AdminMapper.insertSelective(admin);
            N25175User user = new N25175User();
            user.setuAid(admin.getaId());
            user.setuPhone(phone);
            user.setuSex(sex);
            user.setuPost(post);
            user.setuName(name);
            n25175UserMapper.insertSelective(user);
            personalChangeService.addRecord(name,2,admin.getaStatus(),null,null, null, null);
            return true;
        }
    }

    /**
     * @author huangkai
     * @param admin
     * @param user
     * @return
     */
    @Override
    @Transactional
    public boolean addAdmin(N25175Admin admin, N25175User user) {
        List<N25175Admin> n25175Admins = findAdminList(admin);
        if (n25175Admins.size()>0){
            return false;
        }else{
            n25175AdminMapper.insertSelective(admin);
            user.setuAid(admin.getaId());
            n25175UserMapper.insertSelective(user);
            return true;
        }
    }

    @Override
    @Transactional
    public boolean deleteAdmin(Integer id) {
        N25175SubmitExample n25175SubmitExample = new N25175SubmitExample();
        n25175SubmitExample.createCriteria().andSAidEqualTo(id);
        List<N25175Submit> n25175Submits = n25175SubmitMapper.selectByExample(n25175SubmitExample);
        if (n25175Submits.size()>0){
               return false;
        }
        N25175UserExample n25175UserExample = new N25175UserExample();
        n25175UserExample.createCriteria().andUAidEqualTo(id);
        n25175UserMapper.deleteByExample(n25175UserExample);
  /*      n25175SubmitMapper.deleteByExample(n25175SubmitExample);
        List<Integer> list = new ArrayList<>();
        for (N25175Submit n25175Submit:n25175Submits){
            list.add(n25175Submit.getsId());
        }
        N25175ResponseExample n25175ResponseExample = new N25175ResponseExample();
        System.out.println(list);
        if (list.size()>0){
            n25175ResponseExample.createCriteria().andRSubmitidIn(list);
            n25175ResponseMapper.deleteByExample(n25175ResponseExample);
        }*/
        n25175AdminMapper.deleteByPrimaryKey(id);
        return true;
    }

    @Override
    @Transactional
    public boolean editAdmin(N25175Admin admin,String name,Integer s1,Integer p1,Integer p2,Integer o1) {
        if(admin.getaUsername()!=null){
            N25175AdminExample n25175AdminExample = new N25175AdminExample();
            n25175AdminExample.createCriteria().andAUsernameEqualTo(admin.getaUsername()).andAIdNotEqualTo(admin.getaId());
            List<N25175Admin> n25175Admins = n25175AdminMapper.selectByExample(n25175AdminExample);
            if (n25175Admins.size()>0){
                return false;
            }
        }
        if (admin.getaJnum() == null&&admin.getaStatus()!=null){
            String sql = "select max(a_jnum) from n25175_admin";
            int i = 0;
            try {
                i = jdbcTemplate.queryForObject(sql, Integer.class);
            }catch (NullPointerException e){
            }

            admin.setaJnum(++i);
        }
        int i = n25175AdminMapper.updateByPrimaryKeySelective(admin);
        N25175User user = new N25175User();
        user.setuPost(p2);
        N25175UserExample n25175UserExample = new N25175UserExample();
        n25175UserExample.createCriteria().andUAidEqualTo(admin.getaId());
        n25175UserMapper.updateByExampleSelective(user,n25175UserExample);
        personalChangeService.addRecord(name, s1, admin.getaStatus(), p1, p2, o1, admin.getaDepart());
        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean existByphone(String phone) {
        N25175AdminExample adminExample = new N25175AdminExample();
        adminExample.createCriteria().andAUsernameEqualTo(phone);
        List<N25175Admin> list = n25175AdminMapper.selectByExample(adminExample);
        return list.size()>0;
    }

    @Override
    public List<Integer> findAIdsByAStauts(Integer aStatus) {
        if (aStatus==0)
            return n25175AdminMapper.findAIdsExceptAStauts(2);
        else
            return n25175AdminMapper.findAIdsByAStauts(aStatus);
    }

    /**
     * @author huangkai
     * @param admin
     * @return
     */
    public List<N25175Admin> findAdminList(N25175Admin admin){
        N25175AdminExample n25175AdminExample = new N25175AdminExample();
        n25175AdminExample.createCriteria().andAUsernameEqualTo(admin.getaUsername());
        return n25175AdminMapper.selectByExample(n25175AdminExample);
    }

    @Override
    @Transactional
    public boolean upAdminByAId(Integer id, String name, Integer oStatus, Integer nStatus){
        int i = n25175AdminMapper.updateAStatusByAId(id, nStatus);
        personalChangeService.addRecord(name, oStatus, nStatus, null, null, null, null);
        if (i == 1)
            return true;
        else
            return false;
    }

    @Override
    @Transactional
    public boolean leaveAdminByAId(Integer id, String name, Integer oStatus){
        int i = n25175AdminMapper.updateAStatusByAId(id, 9);
        personalChangeService.addRecord(name, oStatus, 9, null, null, null, null);
        if (i == 1)
            return true;
        else
            return false;
    }

    @Override
    public List<AVGMoney> groupMoney() {

        return n25175AdminMapper.groupMoney();
    }

    @Override
    public List<Integer> findAIdsByADepart(Integer aDepart) {
        return null;
    }

}
