package com.example.demo.controller;

import com.example.demo.service.CmosDempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 *  全国范围内营业厅数据
 */

@RestController
public class CmosTest  {

    @Autowired
    private CmosDempService cmosDempService ;

    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    public Object test() throws Exception{
        return cmosDempService.findCity();
    }
}
