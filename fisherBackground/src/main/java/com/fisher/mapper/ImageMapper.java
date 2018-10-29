package com.fisher.mapper;

import org.apache.ibatis.annotations.Update;

import com.fisher.pojo.Image;

public interface ImageMapper {

    int deleteByPrimaryKey(Integer imageId);

    int insert(Image record);

    int insertSelective(Image record);

    Image selectByPrimaryKey(Integer imageId);
    
    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);

    Image selectByMerchandiseKey(Integer merchandiseId);
}