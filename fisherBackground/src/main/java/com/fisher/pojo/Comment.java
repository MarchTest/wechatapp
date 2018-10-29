package com.fisher.pojo;

public class Comment {
    private Integer commentId;

    private Integer merchandiseId;

    private Integer userId;

    private String commentLevel;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Integer merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCommentLevel() {
        return commentLevel;
    }

    public void setCommentLevel(String commentLevel) {
        this.commentLevel = commentLevel == null ? null : commentLevel.trim();
    }
}