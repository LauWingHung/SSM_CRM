package com.lau1yach.service;

import com.lau1yach.entity.BaseDict;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BaseDictService {

//    根据字典编码查询字典列表

    List<BaseDict> getBaseDictByCode(String code);
}
