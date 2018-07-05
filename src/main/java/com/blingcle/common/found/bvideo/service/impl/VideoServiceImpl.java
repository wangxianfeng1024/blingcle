package com.blingcle.common.found.bvideo.service.impl;

import com.blingcle.common.found.vo.VideoVo;
import com.blingcle.common.found.bvideo.service.VideoService;
import com.blingcle.common.found.mapper.VideoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by 王显锋 on 2018/7/5.
 */
@Service
public class VideoServiceImpl implements VideoService {
    private static Logger logger = LoggerFactory.getLogger(VideoServiceImpl.class);
    @Autowired
    private VideoMapper videoMapper;

    @Override
    @Transactional
    public int insertVideo(VideoVo videoVo) {

        return videoMapper.insert(dafaultval(videoVo));
    }

    protected VideoVo dafaultval(VideoVo videoVo){
        videoVo.setCreatedate(new Date());
        videoVo.setIsvalid(true);
        videoVo.setStatus(0);
        return videoVo;
    }
}
