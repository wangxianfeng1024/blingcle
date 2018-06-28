package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bvideoviewtd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BvideoviewtdMapper {
    int insert(Bvideoviewtd record);

    int insertSelective(Bvideoviewtd record);
}