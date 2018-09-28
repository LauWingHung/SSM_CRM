package com.lau1yach.mapper;

import com.lau1yach.entity.BaseDict;

import java.util.List;

//字典数据表持久化接口
public interface BaseDictMapper {

//    根据字典编码查询字典列表

    List<BaseDict> getBaseDictByCode(String code);
}
