package com.example.demo.util;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.SearchVO;
import com.example.demo.dao.entity.CmosDemoEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.nio.charset.Charset;
import java.util.List;

public class HttpUtils {

    private String url = "https://restapi.amap.com/v3/place/text?key=aac0ead5fe627bc1bb99bd519b12705a&keywords=移动营业厅&types=070603";
    private String KEY = "199d41d640720d2df09a294d875a2a55";
    private String TYPES = "070603";
    private String keywords = "移动营业厅";

    private final Logger logger = LoggerFactory.getLogger( this.getClass() );

    public String test(String city) throws Exception {
        HttpClient httpClient = HttpClients.createDefault();

        if ( !StringUtils.isEmpty( city ) ){
           url = url+ "&city="+city.trim() ;
        }
        HttpGet get = new HttpGet( url );
        HttpResponse response = httpClient.execute( get );
        if ( response != null ) {
           return EntityUtils.toString(response.getEntity()) ;
            /*String res = EntityUtils.toString( response.getEntity() );
            JSONObject json = JSONObject.parseObject( res ) ;
            Object pois = json.get( "pois" );
            List<SearchVO> searchVOS = JSONObject.parseArray(pois.toString(), SearchVO.class);
            for (SearchVO searchVO : searchVOS){
                CmosDemoEntity cmosDemoEntity = BeanContrvort.contrvort(searchVO);
                logger.info("列表为：[{}]" , searchVO.toString());
                logger.info("-------\n");
            }*/
        }
        return null ;
    }

    public void test2() throws Exception {
        HttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet( "https://restapi.amap.com/v3/place/text?key=d17b7a747e9982a562b2c2007bcbe3c5&keywords=移动营业厅&city=晋中市&types=070603" );
        HttpResponse execute = httpClient.execute( get );
        if ( execute != null ) {
            logger.info( "返回结果：[{}]", EntityUtils.toString( execute.getEntity(), Charset.forName( "utf-8" ) ) );
        }
    }

    public static void main(String[] args) throws Exception {

        HttpUtils httpUtils = new HttpUtils() ;
        httpUtils.test( "汝南县" );
        //httpUtils.test2();
    }
}
