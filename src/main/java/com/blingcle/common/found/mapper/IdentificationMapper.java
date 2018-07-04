package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Identification;

public interface IdentificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Identification record);

    int insertSelective(Identification record);

    Identification selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Identification record);

    int updateByPrimaryKey(Identification record);
}