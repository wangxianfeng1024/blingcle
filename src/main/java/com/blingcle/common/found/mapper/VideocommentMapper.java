package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Videocomment;

public interface VideocommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Videocomment record);

    int insertSelective(Videocomment record);

    Videocomment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Videocomment record);

    int updateByPrimaryKey(Videocomment record);
}