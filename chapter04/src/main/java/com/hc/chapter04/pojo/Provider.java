package com.hc.chapter04.pojo;

public class Provider {
    private Integer pId;//供应商id

    private String pName;//供应商名称

    private String pInfo;//供应商简介

    private String linkman;//供应商联系人

    private Long pPhone;//供应商联系电话

    private String pAddress;//供应商地址

    private Integer pFax;//供应商传真

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpInfo() {
        return pInfo;
    }

    public void setpInfo(String pInfo) {
        this.pInfo = pInfo == null ? null : pInfo.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public Long getpPhone() {
        return pPhone;
    }

    public void setpPhone(Long pPhone) {
        this.pPhone = pPhone;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress == null ? null : pAddress.trim();
    }

    public Integer getpFax() {
        return pFax;
    }

    public void setpFax(Integer pFax) {
        this.pFax = pFax;
    }
}