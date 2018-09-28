package com.lau1yach.mapper;

import com.lau1yach.entity.Customer;
import com.lau1yach.entity.QueryVo;

import java.util.List;

/**
 * @author lyhpl
 * @Title: CustomerMapper
 * @ProjectName SSM_CRM
 * @Description: TODO客户信息持久化接口
 * @date 9/28/2018  4:53 PM
 */
public interface CustomerMapper {
    //根据查询条件,分页查询用户列表

    List<Customer> getCustomerByQueryVo(QueryVo vo);

//    根据查询条件,查询总记录数

    Integer getCountByQueryVo(QueryVo vo);
}
