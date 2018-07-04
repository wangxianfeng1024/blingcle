package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Videoview;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VideoviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Videoview record);

    int insertSelective(Videoview record);

    Videoview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Videoview record);

    int updateByPrimaryKey(Videoview record);
}