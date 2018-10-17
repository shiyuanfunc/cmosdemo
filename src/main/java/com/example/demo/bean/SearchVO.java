package com.example.demo.bean;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchVO {


    /**
     * id : B0FFIYDW1M
     * parent : []
     * name : 中国移动社区服务站(古塔街道店)
     * type : 生活服务;电讯营业厅;中国移动营业厅
     * typecode : 070603
     * biz_type : []
     * address : 古塔路40号附近
     * location : 114.359487,32.996395
     * tel : []
     * distance : []
     * biz_ext : {"rating":[],"cost":[]}
     * pname : 河南省
     * cityname : 驻马店市
     * adname : 汝南县
     * importance : []
     * shopid : []
     * shopinfo : 0
     * poiweight : []
     * photos : []
     */

    private String id;
    private String name;
    private String type;
    private String typecode;
    private String address;
    private String location;
    private Object biz_ext;
    private String pname;
    private String cityname;
    private String adname;
    private String shopinfo;
    private List<?> parent;
    private List<?> biz_type;
    private List<?> tel;
    private List<?> distance;
    private List<?> importance;
    private List<?> shopid;
    private List<?> poiweight;
    private List<?> photos;

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

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
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

    public Object getBiz_ext() {
        return biz_ext;
    }

    public void setBiz_ext(Object biz_ext) {
        this.biz_ext = biz_ext;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
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

    public List<?> getParent() {
        return parent;
    }

    public void setParent(List<?> parent) {
        this.parent = parent;
    }

    public List<?> getBiz_type() {
        return biz_type;
    }

    public void setBiz_type(List<?> biz_type) {
        this.biz_type = biz_type;
    }

    public List<?> getTel() {
        return tel;
    }

    public void setTel(List<?> tel) {
        this.tel = tel;
    }

    public List<?> getDistance() {
        return distance;
    }

    public void setDistance(List<?> distance) {
        this.distance = distance;
    }

    public List<?> getImportance() {
        return importance;
    }

    public void setImportance(List<?> importance) {
        this.importance = importance;
    }

    public List<?> getShopid() {
        return shopid;
    }

    public void setShopid(List<?> shopid) {
        this.shopid = shopid;
    }

    public List<?> getPoiweight() {
        return poiweight;
    }

    public void setPoiweight(List<?> poiweight) {
        this.poiweight = poiweight;
    }

    public List<?> getPhotos() {
        return photos;
    }

    public void setPhotos(List<?> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "SearchVO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", typecode='" + typecode + '\'' +
                ", address='" + address + '\'' +
                ", location='" + location + '\'' +
                ", biz_ext=" + biz_ext +
                ", pname='" + pname + '\'' +
                ", cityname='" + cityname + '\'' +
                ", adname='" + adname + '\'' +
                ", shopinfo='" + shopinfo + '\'' +
                ", parent=" + parent +
                ", biz_type=" + biz_type +
                ", tel=" + tel +
                ", distance=" + distance +
                ", importance=" + importance +
                ", shopid=" + shopid +
                ", poiweight=" + poiweight +
                ", photos=" + photos +
                '}';
    }
}
