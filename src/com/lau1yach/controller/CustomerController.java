package com.lau1yach.controller;

import com.lau1yach.entity.BaseDict;
import com.lau1yach.entity.Customer;
import com.lau1yach.entity.QueryVo;
import com.lau1yach.service.BaseDictService;
import com.lau1yach.service.CustomerService;
import com.lau1yach.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author lyhpl
 * @Title: CustomerController
 * @ProjectName SSM_CRM
 * @Description: TODO
 * @date 9/28/2018  10:35 AM
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private BaseDictService baseDictService;
    @Autowired
    private CustomerService customerService;

    @RequestMapping("list")
    public String list(Model model, QueryVo vo){
//        查询来源
        List<BaseDict> fromType=baseDictService.getBaseDictByCode("002");
//        查询行业
        List<BaseDict> industryType=baseDictService.getBaseDictByCode("001");
//        查询级别
        List<BaseDict> levelType=baseDictService.getBaseDictByCode("006");
//        设置数据模型返回
        model.addAttribute("fromType",fromType);
        model.addAttribute("industryType",industryType);
        model.addAttribute("levelType",levelType);
//        根据查询条件分页查询用户列表
        Page<Customer> page = customerService.getCustomerByQueryVo(vo);
//        设置分页数据返回
        model.addAttribute("page",page);
        return "customer";
    }
}
