package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bidentificationtc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BidentificationtcMapper {
    int insert(Bidentificationtc record);

    int insertSelective(Bidentificationtc record);
}