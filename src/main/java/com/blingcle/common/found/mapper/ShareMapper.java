package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Share;

public interface ShareMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Share record);

    int insertSelective(Share record);

    Share selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Share record);

    int updateByPrimaryKey(Share record);
}