package com.hc.chapter04.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private Integer aId;//商品编号

    private String gName;//商品名称

    private String gInfo;//商品描述


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createtime;//账单时间

    private Integer pId;//供应商编号

    private Integer ispay;//是否付款，1付款，2未付款

    private BigDecimal money;//账单报价

    private String unit;//单位

    private Integer num;//数量

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getgInfo() {
        return gInfo;
    }

    public void setgInfo(String gInfo) {
        this.gInfo = gInfo == null ? null : gInfo.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getIspay() {
        return ispay;
    }

    public void setIspay(Integer ispay) {
        this.ispay = ispay;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}