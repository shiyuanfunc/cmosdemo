package com.example.demo.dao.entity;

import org.springframework.stereotype.Component;

/**
 * @author Song Yinghui
 * @date 2018/10/17
 * @Version 1.0
 */

@Component
public class CmosDemoEntity {

    private String id ;
    private String name ;
    private String type ;
    private String typeCode ;
    private String address ;
    private String location ;
    private String cityname ;
    private String pname ;
    private String adname ;
    private String shopinfo ;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    public String getShopinfo() {
        return shopinfo;
    }

    public void setShopinfo(String shopinfo) {
        this.shopinfo = shopinfo;
    }

    @Override
    public String toString() {
        return "CmosDemoEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", typeCode='" + typeCode + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", cityname='" + cityname + '\'' +
                ", pname='" + pname + '\'' +
                ", adname='" + adname + '\'' +
                ", shopinfo='" + shopinfo + '\'' +
                '}';
    }
}
