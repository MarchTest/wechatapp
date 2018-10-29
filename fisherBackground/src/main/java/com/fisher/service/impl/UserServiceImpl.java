package com.fisher.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisher.mapper.UserMapper;
import com.fisher.pojo.User;
import com.fisher.service.UserService;
import com.fisher.utils.Aspect.UpdateCharset;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserMapper userMapper;
    
    @Override
    public int deleteByPrimaryKey(Integer userId) {
        // TODO Auto-generated method stub
        return userMapper.deleteByPrimaryKey(userId);
    }
    @UpdateCharset
    @Override
    public int insert(User record) {
        // TODO Auto-generated method stub
        return userMapper.insert(record);
    }
    @UpdateCharset
    @Override
    public int insertSelective(User record) {
        // TODO Auto-generated method stub
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        // TODO Auto-generated method stub
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        // TODO Auto-generated method stub
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        // TODO Auto-generated method stub
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User selectByOpenid(String openId) {
        // TODO Auto-generated method stub
        return userMapper.selectByOpenid(openId);
    }
    
}
