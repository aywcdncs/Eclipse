package com.qakj.crm.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Goods {
    private Integer id;

    private String goodsNumber;

    private String goodsName;

    private Integer goodsPrice;

    private String goodsSuppname;

    private String goodsAddress;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JSONField(format="yyyy-MM-dd")
    private Date goodsDate;

    private String goodsSuppernumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(String goodsNumber) {
        this.goodsNumber = goodsNumber == null ? null : goodsNumber.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsSuppname() {
        return goodsSuppname;
    }

    public void setGoodsSuppname(String goodsSuppname) {
        this.goodsSuppname = goodsSuppname == null ? null : goodsSuppname.trim();
    }

    public String getGoodsAddress() {
        return goodsAddress;
    }

    public void setGoodsAddress(String goodsAddress) {
        this.goodsAddress = goodsAddress == null ? null : goodsAddress.trim();
    }

    public Date getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(Date goodsDate) {
        this.goodsDate = goodsDate;
    }

    public String getGoodsSuppernumber() {
        return goodsSuppernumber;
    }

    public void setGoodsSuppernumber(String goodsSuppernumber) {
        this.goodsSuppernumber = goodsSuppernumber == null ? null : goodsSuppernumber.trim();
    }
}