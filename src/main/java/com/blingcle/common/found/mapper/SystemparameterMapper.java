package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Systemparameter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SystemparameterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Systemparameter record);

    int insertSelective(Systemparameter record);

    Systemparameter selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Systemparameter record);

    int updateByPrimaryKey(Systemparameter record);

    List<Systemparameter> queryall();
}