package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Userfriend;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserfriendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Userfriend record);

    int insertSelective(Userfriend record);

    Userfriend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Userfriend record);

    int updateByPrimaryKey(Userfriend record);
}