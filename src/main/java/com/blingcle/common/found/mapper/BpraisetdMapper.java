package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bpraisetd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BpraisetdMapper {
    int insert(Bpraisetd record);

    int insertSelective(Bpraisetd record);
}