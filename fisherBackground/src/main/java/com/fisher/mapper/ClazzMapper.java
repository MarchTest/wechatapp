package com.fisher.mapper;

import java.util.List;

import com.fisher.pojo.Clazz;

public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    Clazz selectByPrimaryKey(Integer clazzId);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
    
    List<Clazz> getAllClazz();
}