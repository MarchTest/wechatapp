package com.fisher.mapper;

import java.util.List;

import com.fisher.pojo.HomeImage;

public interface HomeImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HomeImage record);

    int insertSelective(HomeImage record);

    HomeImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomeImage record);

    int updateByPrimaryKey(HomeImage record);
    
    List<HomeImage> getAllHomeImage();
}