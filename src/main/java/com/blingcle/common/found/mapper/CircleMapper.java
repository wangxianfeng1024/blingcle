package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Circle;

public interface CircleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Circle record);

    int insertSelective(Circle record);

    Circle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Circle record);

    int updateByPrimaryKey(Circle record);
}