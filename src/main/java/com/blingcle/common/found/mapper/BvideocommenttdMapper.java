package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bvideocommenttd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BvideocommenttdMapper {
    int insert(Bvideocommenttd record);

    int insertSelective(Bvideocommenttd record);
}