package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Usercircle;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsercircleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Usercircle record);

    int insertSelective(Usercircle record);

    Usercircle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Usercircle record);

    int updateByPrimaryKey(Usercircle record);
}