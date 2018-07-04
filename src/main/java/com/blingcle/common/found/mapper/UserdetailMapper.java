package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Userdetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserdetailMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(Userdetail record);

    int insertSelective(Userdetail record);

    Userdetail selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(Userdetail record);

    int updateByPrimaryKey(Userdetail record);
}