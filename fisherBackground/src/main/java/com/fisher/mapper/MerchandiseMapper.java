package com.fisher.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
//import org.junit.runners.Parameterized.Parameters;

import com.fisher.pojo.Merchandise;

public interface MerchandiseMapper {
    int deleteByPrimaryKey(Integer merchandiseId);

    int insert(Merchandise record);

    int insertSelective(Merchandise record);

    Merchandise selectByPrimaryKey(Integer merchandiseId);

    int updateByPrimaryKeySelective(Merchandise record);

    int updateByPrimaryKey(Merchandise record);
    
    List<Merchandise> selectByPrice(@Param("low")double lower, @Param("high")double higher);
  
    List<Merchandise> selectBykeyWords(Merchandise merchandise);
    
    List<Merchandise> selectByPromotionKey(int promotion);

	List<Merchandise> selectByClazzId(int clazzId);
}