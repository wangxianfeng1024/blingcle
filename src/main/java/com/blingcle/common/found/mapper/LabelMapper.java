package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Label;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LabelMapper {
    int deleteByPrimaryKey(Long labelid);

    int insert(Label record);

    int insertSelective(Label record);

    Label selectByPrimaryKey(Long labelid);

    int updateByPrimaryKeySelective(Label record);

    int updateByPrimaryKey(Label record);

    List<Label> queryallLabel();
}