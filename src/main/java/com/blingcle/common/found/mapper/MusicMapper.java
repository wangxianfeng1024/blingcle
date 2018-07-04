package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Music;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicMapper {
    int deleteByPrimaryKey(Long musicid);

    int insert(Music record);

    int insertSelective(Music record);

    Music selectByPrimaryKey(Long musicid);

    int updateByPrimaryKeySelective(Music record);

    int updateByPrimaryKey(Music record);
}