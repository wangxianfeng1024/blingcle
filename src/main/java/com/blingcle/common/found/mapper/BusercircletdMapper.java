package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Busercircletd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusercircletdMapper {
    int insert(Busercircletd record);

    int insertSelective(Busercircletd record);
}