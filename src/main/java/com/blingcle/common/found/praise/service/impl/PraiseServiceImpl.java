package com.blingcle.common.found.praise.service.impl;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.found.mapper.PraiseMapper;
import com.blingcle.common.found.pojo.Praise;
import com.blingcle.common.found.praise.service.PraiseService;
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
public class PraiseServiceImpl implements PraiseService {
    private static Logger logger = LoggerFactory.getLogger(PraiseServiceImpl.class);
    @Autowired
    private PraiseMapper praiseMapper;

    @Override
    @Transactional
    public int insertPraise(Praise praise) throws BusinessException {
        logger.info("视频点赞记录ServiceImpl");
        return praiseMapper.insert(defaultvul(praise));
    }

    /**
     * 设置默认值
     *
     * @param praise
     * @return
     * @throws BusinessException
     */
    protected Praise defaultvul(Praise praise) throws BusinessException {
        praise.setIsvalid(true);
        praise.setVersion(0);
        praise.setCreatetime(new Date());
        return praise;
    }
}
