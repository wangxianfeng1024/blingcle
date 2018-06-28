package com.blingcle.common.found.service.impl;

import com.blingcle.common.found.mapper.BlabeltcMapper;
import com.blingcle.common.found.pojo.Blabeltc;
import com.blingcle.common.found.service.Blabeltcservice;
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
public class BlabeltcserviceImpl implements Blabeltcservice {
    private static Logger logger = LoggerFactory.getLogger(BlabeltcserviceImpl.class);
    @Autowired
    private BlabeltcMapper blabeltcMapper;

    @Override
    @Transactional
    public List<Blabeltc> queryall(Long id) {
        logger.info("查询表签ServiceImpl");
        return blabeltcMapper.queryall();
    }
}
