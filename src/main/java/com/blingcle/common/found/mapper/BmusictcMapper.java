package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bmusictc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BmusictcMapper {
    int deleteByPrimaryKey(Long musicid);

    int insert(Bmusictc record);

    int insertSelective(Bmusictc record);

    Bmusictc selectByPrimaryKey(Long musicid);

    int updateByPrimaryKeySelective(Bmusictc record);

    int updateByPrimaryKey(Bmusictc record);
}