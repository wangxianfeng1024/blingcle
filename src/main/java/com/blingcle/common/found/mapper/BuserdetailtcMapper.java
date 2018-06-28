package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Buserdetailtc;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BuserdetailtcMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(Buserdetailtc record);

    int insertSelective(Buserdetailtc record);

    Buserdetailtc selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(Buserdetailtc record);

    int updateByPrimaryKey(Buserdetailtc record);
}