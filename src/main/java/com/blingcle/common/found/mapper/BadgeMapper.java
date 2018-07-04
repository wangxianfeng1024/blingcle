package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Badge;

public interface BadgeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Badge record);

    int insertSelective(Badge record);

    Badge selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Badge record);

    int updateByPrimaryKey(Badge record);
}