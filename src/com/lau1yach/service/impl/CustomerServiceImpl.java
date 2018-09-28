package com.lau1yach.service.impl;

import com.lau1yach.entity.Customer;
import com.lau1yach.entity.QueryVo;
import com.lau1yach.mapper.CustomerMapper;
import com.lau1yach.service.CustomerService;
import com.lau1yach.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lyhpl
 * @Title: CustomerServiceImpl
 * @ProjectName SSM_CRM
 * @Description: TODO
 * @date 9/28/2018  5:23 PM
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Page<Customer> getCustomerByQueryVo(QueryVo vo) {
//        计算分页查询从哪个记录开始
        vo.setStart((vo.getPage()-1)*vo.getRows());
//        查询总记录数
        Integer total=customerMapper.getCountByQueryVo(vo);
//        查询每页的数据列表
        List<Customer> list = customerMapper.getCustomerByQueryVo(vo);
//        包装分页数据
        Page<Customer> page= new Page<Customer>(total,vo.getPage(),vo.getRows(),list);

        return page;
    }


}
