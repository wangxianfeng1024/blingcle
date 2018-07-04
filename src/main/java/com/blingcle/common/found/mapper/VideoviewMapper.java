package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Videoview;

public interface VideoviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Videoview record);

    int insertSelective(Videoview record);

    Videoview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Videoview record);

    int updateByPrimaryKey(Videoview record);
}