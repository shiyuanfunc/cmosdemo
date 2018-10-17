package com.example.demo.dao;

import com.example.demo.dao.entity.CmosDemoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author Song Yinghui
 * @date 2018/10/17
 * @Version 1.0
 */

@Mapper
public interface CmosDemoDao {

    int insertCmosDemo(CmosDemoEntity cmosDemoEntity) ;


    List<Map<String , Object>> findcity();
}
