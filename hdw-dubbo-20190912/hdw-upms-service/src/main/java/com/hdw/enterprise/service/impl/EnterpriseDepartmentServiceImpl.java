package com.hdw.enterprise.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hdw.enterprise.entity.EnterpriseDepartment;
import com.hdw.enterprise.mapper.EnterpriseDepartmentMapper;
import com.hdw.enterprise.service.IEnterpriseDepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 企业部门表
 *
 * @author TuMinglong
 * @date 2018-12-11 11:36:02
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class EnterpriseDepartmentServiceImpl extends ServiceImpl<EnterpriseDepartmentMapper, EnterpriseDepartment> implements IEnterpriseDepartmentService {


    @Override
    public List<Map<String, Object>> selectTreeGrid(Map<String, Object> params) {
        return this.baseMapper.selectTreeGrid(params);
    }

    @Override
    public List<EnterpriseDepartment> selectEnterpriseDepartmentList(Map<String, Object> params) {
        return this.baseMapper.selectEnterpriseDepartmentList(params);
    }
}
