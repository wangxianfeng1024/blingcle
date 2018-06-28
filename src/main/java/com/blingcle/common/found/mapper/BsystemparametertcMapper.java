package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bsystemparametertc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BsystemparametertcMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bsystemparametertc record);

    int insertSelective(Bsystemparametertc record);

    Bsystemparametertc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bsystemparametertc record);

    int updateByPrimaryKey(Bsystemparametertc record);
}