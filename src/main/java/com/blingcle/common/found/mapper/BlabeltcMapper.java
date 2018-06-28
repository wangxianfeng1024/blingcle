package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Blabeltc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlabeltcMapper {
    int deleteByPrimaryKey(Long labelid);

    int insert(Blabeltc record);

    int insertSelective(Blabeltc record);

    Blabeltc selectByPrimaryKey(Long labelid);

    int updateByPrimaryKeySelective(Blabeltc record);

    int updateByPrimaryKey(Blabeltc record);
    List<Blabeltc> queryall();
}