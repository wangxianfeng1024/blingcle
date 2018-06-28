package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bvideotd;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BvideotdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bvideotd record);

    int insertSelective(Bvideotd record);

    Bvideotd selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bvideotd record);

    int updateByPrimaryKey(Bvideotd record);

    List<Bvideotd> findByUserid(Long id);

    List<Bvideotd> findByPraiseid(Long id);

}