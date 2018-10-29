package com.fisher.pojo;

public class CartMessage {
    private Integer merchandiseId;

    private Integer cartId;

    private Integer merchandiseNums;

    private String puttime;

    public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getMerchandiseNums() {
        return merchandiseNums;
    }

    public void setMerchandiseNums(Integer merchandiseNums) {
        this.merchandiseNums = merchandiseNums;
    }

    public String getPuttime() {
        return puttime;
    }

    public void setPuttime(String puttime) {
        this.puttime = puttime == null ? null : puttime.trim();
    }
}