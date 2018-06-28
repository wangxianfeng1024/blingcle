package com.blingcle.common.found.mapper;

import com.blingcle.common.found.pojo.Busertc;
import com.blingcle.common.found.vo.BusertcVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusertcMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BusertcVo busertcVo);

    int insertSelective(Busertc record);

    Busertc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Busertc record);

    int updateByPrimaryKey(Busertc record);

    Busertc findbyphone(BusertcVo busertcVo);

    Busertc findbyloginname(BusertcVo busertcVo);

    Busertc queryBusertcDatail(Long id);

    List<Busertc> findAttention(Long id);

    List<Busertc> findFans(Long id);
}