package com.example.demo.util;

import com.example.demo.bean.SearchVO;
import com.example.demo.dao.entity.CmosDemoEntity;

/**
 * @author Song Yinghui
 * @date 2018/10/17
 * @Version 1.0
 */
public class BeanContrvort {

    public static CmosDemoEntity contrvort(SearchVO searchVO){
        CmosDemoEntity cmosDemoEntity = new CmosDemoEntity() ;

        cmosDemoEntity.setId(searchVO.getId());
        cmosDemoEntity.setAddress(searchVO.getAddress());
        cmosDemoEntity.setAdname(searchVO.getAdname());
        cmosDemoEntity.setCityname(searchVO.getCityname());
        cmosDemoEntity.setLocation(searchVO.getLocation());
        cmosDemoEntity.setName(searchVO.getName());
        cmosDemoEntity.setPname(searchVO.getPname());
        cmosDemoEntity.setShopinfo(searchVO.getShopinfo());
        cmosDemoEntity.setType(searchVO.getType());
        cmosDemoEntity.setTypeCode(searchVO.getTypecode());
        return cmosDemoEntity ;
    }
}
