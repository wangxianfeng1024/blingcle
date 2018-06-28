package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bsharetd;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BsharetdMapper {
    int insert(Bsharetd record);

    int insertSelective(Bsharetd record);
}