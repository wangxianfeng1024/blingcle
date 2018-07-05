package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Region;
import com.blingcle.common.found.vo.RegionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RegionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Region record);

    int insertSelective(Region record);

    Region selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Region record);

    int updateByPrimaryKeyWithBLOBs(Region record);

    int updateByPrimaryKey(Region record);

    List<RegionVo> queryrRegion(Integer id);
}