package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Buserfriendtd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuserfriendtdMapper {
    int insert(Buserfriendtd record);

    int insertSelective(Buserfriendtd record);
}