package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Bvideolabeltd;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BvideolabeltdMapper {
    int insert(Bvideolabeltd record);

    int insertSelective(Bvideolabeltd record);

    int batch(List<Bvideolabeltd> bvideolabeltds);
}