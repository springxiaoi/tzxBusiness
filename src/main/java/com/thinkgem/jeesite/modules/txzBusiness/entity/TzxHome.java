package com.thinkgem.jeesite.modules.txzBusiness.entity;

public class TzxHome {
    private String id;

    private String imgUrl;

    private String imgStatus;

    private String imgSort;

    private String imgDesc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getImgStatus() {
        return imgStatus;
    }

    public void setImgStatus(String imgStatus) {
        this.imgStatus = imgStatus == null ? null : imgStatus.trim();
    }

    public String getImgSort() {
        return imgSort;
    }

    public void setImgSort(String imgSort) {
        this.imgSort = imgSort == null ? null : imgSort.trim();
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc == null ? null : imgDesc.trim();
    }
}