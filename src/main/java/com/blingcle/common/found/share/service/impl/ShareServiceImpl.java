package com.blingcle.common.found.share.service.impl;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.found.mapper.ShareMapper;
import com.blingcle.common.found.pojo.Share;
import com.blingcle.common.found.share.service.ShareService;
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
public class ShareServiceImpl implements ShareService {
    private static Logger logger = LoggerFactory.getLogger(ShareServiceImpl.class);

    @Autowired
    private ShareMapper shareMapper;

    @Override
    @Transactional
    public int insertShare(Share share) throws BusinessException {
        logger.info("视频分享记录ServiceImpl");
        return shareMapper.insert(defaultvul(share));
    }

    /**
     * 设置默认值
     *
     * @param share
     * @return
     * @throws BusinessException
     */
    protected Share defaultvul(Share share) throws BusinessException {
        share.setIsvalid(true);
        share.setVersion(0);
        share.setSharetime(new Date());
        return share;
    }
}
