package com.fisher.pojo;

public class Path {
    private Integer pathId;

    private Integer imageId;

    private String pathValue;

    private String pathName;

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getPathValue() {
        return pathValue;
    }

    public void setPathValue(String pathValue) {
        this.pathValue = pathValue == null ? null : pathValue.trim();
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName == null ? null : pathName.trim();
    }
}