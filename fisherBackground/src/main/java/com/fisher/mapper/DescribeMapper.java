package com.fisher.mapper;

import com.fisher.pojo.Describe;

public interface DescribeMapper {
    int deleteByPrimaryKey(Integer describeId);

    int insert(Describe record);

    int insertSelective(Describe record);

    Describe selectByPrimaryKey(Integer describeId);

    int updateByPrimaryKeySelective(Describe record);

    int updateByPrimaryKeyWithBLOBs(Describe record);

    int updateByPrimaryKey(Describe record);

    Describe selectByMerchandiseKey(int merchandiseId);
}