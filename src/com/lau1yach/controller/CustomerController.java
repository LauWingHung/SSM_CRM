package com.lau1yach.controller;

import com.lau1yach.entity.BaseDict;
import com.lau1yach.service.BaseDictService;
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

    @RequestMapping("list")
    public String list(Model model){
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
        return "customer";
    }
}
