package com.lau1yach.service;

import com.lau1yach.entity.Customer;
import com.lau1yach.entity.QueryVo;
import com.lau1yach.utils.Page;

import java.util.List;

/**
 * @author lyhpl
 * @Title: CustomerMapper
 * @ProjectName SSM_CRM
 * @Description: TODO客户信息业务逻辑接口
 * @date 9/28/2018  4:53 PM
 */
public interface CustomerService {
    //根据查询条件,分页查询用户列表

    Page<Customer> getCustomerByQueryVo(QueryVo vo);
}


