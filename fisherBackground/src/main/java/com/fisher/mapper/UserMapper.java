package com.fisher.mapper;

import org.apache.ibatis.annotations.Update;

import com.fisher.pojo.User;
import com.fisher.utils.Aspect.UpdateCharset;

public interface UserMapper {
    
    @Update("set names utf8mb4")
    void setCharsetToUtf8mb4();
    
    int deleteByPrimaryKey(Integer userId);
    @UpdateCharset
    int insert(User record);
    @UpdateCharset
    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByOpenid(String openId);
}