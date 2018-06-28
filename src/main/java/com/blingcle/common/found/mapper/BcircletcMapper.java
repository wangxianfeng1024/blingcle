package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bcircletc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BcircletcMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bcircletc record);

    int insertSelective(Bcircletc record);

    Bcircletc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bcircletc record);

    int updateByPrimaryKey(Bcircletc record);

    List<Bcircletc> queryall();
}