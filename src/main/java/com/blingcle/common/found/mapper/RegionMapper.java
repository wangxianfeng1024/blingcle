package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Region;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKeyWithBLOBs(Region record);

    int updateByPrimaryKey(Region record);
}