package com.fisher.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String openid;
    
    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "用户Id:"+userId+" 用户昵称:"+ userName+" 用户openId:"+openid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }
}