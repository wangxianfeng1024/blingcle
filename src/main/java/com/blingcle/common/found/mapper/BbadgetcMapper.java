package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bbadgetc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BbadgetcMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bbadgetc record);

    int insertSelective(Bbadgetc record);

    Bbadgetc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bbadgetc record);

    int updateByPrimaryKey(Bbadgetc record);
}