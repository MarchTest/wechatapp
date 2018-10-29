package com.fisher.mapper;

import com.fisher.pojo.CartMessage;

public interface CartMessageMapper {
    int insert(CartMessage record);

    int insertSelective(CartMessage record);
}