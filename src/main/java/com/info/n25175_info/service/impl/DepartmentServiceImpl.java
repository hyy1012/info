package com.info.n25175_info.service.impl;

import com.info.n25175_info.dao.N25175OrganMapper;
import com.info.n25175_info.dto.OrganDto;
import com.info.n25175_info.entity.N25175Organ;
import com.info.n25175_info.entity.N25175OrganExample;
import com.info.n25175_info.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Name:com.info.n25175_info.service.impl DepartmentServiceImpl
 * ==========================
 * Author: 陈佳峰
 * Date: 2020/1/7 0007 14:50
 * Description: DepartmentServiceImpl
 * ==========================
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private N25175OrganMapper n25175OrganMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<N25175Organ> getAll(Integer pid) {
        N25175OrganExample n25175OrganExample = new N25175OrganExample();
        N25175OrganExample.Criteria criteria = n25175OrganExample.createCriteria();
        if (pid != null) {
            criteria.andNPidEqualTo(pid);
        } else {
            criteria.andNPidIsNull();
        }
        List<N25175Organ> n25175Organs = n25175OrganMapper.selectByExample(n25175OrganExample);
        return n25175Organs;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<N25175Organ> getDepart() {
        N25175OrganExample n25175OrganExample = new N25175OrganExample();
        n25175OrganExample.createCriteria().andNPidIsNotNull();
        List<N25175Organ> n25175Organs = n25175OrganMapper.selectByExample(n25175OrganExample);
        return n25175Organs;
    }

    @Override
    public OrganDto getOrganDto(OrganDto organDto, N25175Organ organ) {
        N25175OrganExample n25175OrganExample = new N25175OrganExample();
        n25175OrganExample.createCriteria().andNPidEqualTo(organ.getnId());
        List<N25175Organ> n25175Organs = n25175OrganMapper.selectByExample(n25175OrganExample);
        List<OrganDto> list = null;
        if (n25175Organs.size() > 0){
            list = new ArrayList<>();
            for (N25175Organ n25175Organ : n25175Organs){
                OrganDto child = new OrganDto();
                child.setId(n25175Organ.getnId());
                child.setTitle(n25175Organ.getnName());
                list.add(child);
                getOrganDto(child, n25175Organ);
            }
        }
        organDto.setId(organ.getnId());
        organDto.setTitle(organ.getnName());
        organDto.setChildren(list);
        return organDto;
    }

    @Override
    @Transactional
    public boolean add(N25175Organ organ) {
        /*if (organ.getnPid() != null) {
            N25175Organ organ1 = n25175OrganMapper.selectByPrimaryKey(organ.getnPid());
            if (organ1.getnPid() != null) {
                return false;
            }
        }*/
        int insertSelective = n25175OrganMapper.insertSelective(organ);
        if (insertSelective > 0)
            return true;
        else
            return false;
    }


    @Override
    @Transactional
    public boolean edit(N25175Organ organ) {
        int i = n25175OrganMapper.updateByPrimaryKeySelective(organ);
        if (i > 0)
            return true;
        else
            return false;
    }

    @Override
    @Transactional
    public boolean delete(Integer id) {
        N25175OrganExample n25175OrganExample = new N25175OrganExample();
        n25175OrganExample.createCriteria().andNPidEqualTo(id);
        List<N25175Organ> n25175Organs = n25175OrganMapper.selectByExample(n25175OrganExample);
        if (n25175Organs.size() > 0) {
            return false;
        } else {
            n25175OrganMapper.deleteByPrimaryKey(id);
            return true;
        }
    }

}
