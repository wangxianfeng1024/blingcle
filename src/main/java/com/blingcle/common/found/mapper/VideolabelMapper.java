package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Videolabel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VideolabelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Videolabel record);

    int insertSelective(Videolabel record);

    Videolabel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Videolabel record);

    int updateByPrimaryKey(Videolabel record);
}