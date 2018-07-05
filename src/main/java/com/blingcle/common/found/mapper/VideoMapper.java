package com.blingcle.common.found.mapper;

import com.blingcle.common.found.vo.VideoVo;
import com.blingcle.common.found.pojo.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VideoVo videoVo);

    int insertSelective(Video record);

    Video selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Video record);

    int updateByPrimaryKey(Video record);

    List<VideoVo> findByUserid(Long id);

    List<VideoVo> findByPraiseid(Long id);
}