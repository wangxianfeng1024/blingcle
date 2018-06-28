package com.blingcle.common.found.service.impl;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.found.mapper.BvideolabeltdMapper;
import com.blingcle.common.found.mapper.BvideotdMapper;
import com.blingcle.common.found.pojo.Bvideolabeltd;
import com.blingcle.common.found.pojo.Bvideotd;
import com.blingcle.common.found.service.Bvideotdservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 王显锋 on 2018/6/27.
 */
@SuppressWarnings("all")
@Service
public class BvideotdserviceImpl implements Bvideotdservice {
    private static Logger logger = LoggerFactory.getLogger(BusertcserviceImpl.class);
    @Autowired
    private BvideotdMapper bvideotdMapper;
    @Autowired
    private BvideolabeltdMapper bvideolabeltdMapper;


    @Override
    @Transactional
    public Bvideotd insertBvideotd(Bvideotd bvideotd) throws BusinessException {
        logger.info("发布视频ServiceImpl");
        bvideotdMapper.insert(bvideotd);
        List<Bvideolabeltd> list = bvideotd.getBvideolabeltds();
        for (Bvideolabeltd bvideolabeltd : list) {
            bvideolabeltd.setVideoid(bvideotd.getId());
        }
        bvideolabeltdMapper.batch(list);
        return bvideotd;
    }
}
