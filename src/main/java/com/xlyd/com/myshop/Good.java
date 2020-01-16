package com.xlyd.com.myshop;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

public class Good implements Serializable {
    //  序号
    private Integer id;
    //  产品类型
    private String type;
    //  产品图片名称
    private String picture;
    // 产品图片文件
    private MultipartFile picFile;
    //  产品名称
    private String pname;
    //  产品规格
    private String spec;
    //  进货总量
    private Integer totalNumber;
    //  进货单价
    private Double price;
    //  进货总价
    private Double totalPrice;
    //  运费
    private Double fee;
    //  售价
    private Double sellPrice;
    //  促销价
    private Double salePrice;
    //  优惠活动
    private String activities;
    //  剩余库存
    private Integer stock;
    //  备注
    private String remarks;
    //  仓库
    private String storehouse;

    public Good() {
    }

    public Good(Integer id, String type, String picture, MultipartFile picFile, String pname, String spec, Integer totalNumber, Double price, Double totalPrice, Double fee, Double sellPrice, Double salePrice, String activities, Integer stock, String remarks, String storehouse) {
        this.id = id;
        this.type = type;
        this.picture = picture;
        this.picFile = picFile;
        this.pname = pname;
        this.spec = spec;
        this.totalNumber = totalNumber;
        this.price = price;
        this.totalPrice = totalPrice;
        this.fee = fee;
        this.sellPrice = sellPrice;
        this.salePrice = salePrice;
        this.activities = activities;
        this.stock = stock;
        this.remarks = remarks;
        this.storehouse = storehouse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStorehouse() {
        return storehouse;
    }

    public void setStorehouse(String storehouse) {
        this.storehouse = storehouse;
    }

    public MultipartFile getPicFile() {
        return picFile;
    }

    public void setPicFile(MultipartFile picFile) {
        this.picFile = picFile;
    }
}
