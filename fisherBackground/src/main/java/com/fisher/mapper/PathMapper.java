package com.fisher.mapper;

import java.util.List;

import com.fisher.pojo.Path;

public interface PathMapper {
    int deleteByPrimaryKey(Integer pathId);

    int insert(Path record);

    int insertSelective(Path record);

    Path selectByPrimaryKey(Integer pathId);

    int updateByPrimaryKeySelective(Path record);

    int updateByPrimaryKey(Path record);

    List<Path> selectByImageKey(Integer imageId);
    
    List<String> selectString(int imageId);

}