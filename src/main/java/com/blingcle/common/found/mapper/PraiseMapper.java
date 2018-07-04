package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Praise;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PraiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Praise record);

    int insertSelective(Praise record);

    Praise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Praise record);

    int updateByPrimaryKey(Praise record);
}