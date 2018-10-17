package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.SearchVO;
import com.example.demo.dao.CmosDemoDao;
import com.example.demo.dao.entity.CmosDemoEntity;
import com.example.demo.service.CmosDempService;
import com.example.demo.util.BeanContrvort;
import com.example.demo.util.HttpUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Song Yinghui
 * @date 2018/10/17
 * @Version 1.0
 */
@Service
public class CmosDemoServiceImpl implements CmosDempService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private CmosDemoDao cmosDemoDao ;
    @Override
    public List<Map<String , Object>> findCity() throws Exception {
        List<Map<String, Object>> findcity = cmosDemoDao.findcity();
        List<String> list = new ArrayList<>();

        for (Map<String, Object> s : findcity) {
            list.add(s.get("text").toString());
        }
        for (String str : list) {
            HttpUtils httpUtils = new HttpUtils();
            String text = httpUtils.test(str);
            JSONObject json = JSONObject.parseObject(text);
            Object pois = json.get("pois");
            List<SearchVO> searchVOS = JSONObject.parseArray(pois.toString(), SearchVO.class);
            for (SearchVO searchVO : searchVOS) {
                CmosDemoEntity cmosDemoEntity = BeanContrvort.contrvort(searchVO);
                cmosDemoDao.insertCmosDemo(cmosDemoEntity);
            }
        }
        return findcity;
    }
}
