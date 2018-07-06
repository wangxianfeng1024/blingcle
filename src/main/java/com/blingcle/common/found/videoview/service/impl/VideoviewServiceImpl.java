package com.blingcle.common.found.videoview.service.impl;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.found.mapper.VideoviewMapper;
import com.blingcle.common.found.pojo.Videoview;
import com.blingcle.common.found.videoview.service.VideoviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by 王显锋 on 2018/7/6.
 */
@SuppressWarnings("all")
@Service
public class VideoviewServiceImpl implements VideoviewService {
private static Logger logger= LoggerFactory.getLogger(VideoviewServiceImpl.class);
    @Autowired
    private VideoviewMapper videoviewMapper;

    @Override
    @Transactional
    public int insertPraise(Videoview videoview) {
        logger.info("视频点赞记录ServiceImpl");
        return videoviewMapper.insert(defaultvul(videoview));
    }

    /**
     * 设置默认值
     * @param videoview
     * @return
     * @throws BusinessException
     */
    protected Videoview defaultvul(Videoview videoview) throws BusinessException {
        videoview.setIsvalid(true);
        videoview.setVersion(0);
        videoview.setCreatetime(new Date());
        return videoview;
    }
}
