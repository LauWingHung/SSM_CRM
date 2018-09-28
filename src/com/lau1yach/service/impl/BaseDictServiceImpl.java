package com.lau1yach.service.impl;

import com.lau1yach.entity.BaseDict;
import com.lau1yach.mapper.BaseDictMapper;
import com.lau1yach.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lyhpl
 * @Title: BaseDictServiceImpl
 * @ProjectName SSM_CRM
 * @Description: TODO
 * @date 9/28/2018  11:33 AM
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    private BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> getBaseDictByCode(String code) {
        return baseDictMapper.getBaseDictByCode(code);
    }
}
