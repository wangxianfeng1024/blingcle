package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Circle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CircleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Circle record);

    int insertSelective(Circle record);

    Circle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Circle record);

    int updateByPrimaryKey(Circle record);

    List<Circle> queryBcirclebyUser(Long id);

    List<Circle> queryAllCircle();
}