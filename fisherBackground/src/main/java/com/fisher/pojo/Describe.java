package com.fisher.pojo;

public class Describe {
    private Integer describeId;

    private Integer merchandiseId;

    private String describeText;

    public Integer getDescribeId() {
        return describeId;
    }

    public void setDescribeId(Integer describeId) {
        this.describeId = describeId;
    }

    public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public String getDescribeText() {
        return describeText;
    }

    public void setDescribeText(String describeText) {
        this.describeText = describeText == null ? null : describeText.trim();
    }
}