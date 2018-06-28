package com.blingcle.common.found.service.impl;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.found.mapper.BcircletcMapper;
import com.blingcle.common.found.pojo.Bcircletc;
import com.blingcle.common.found.service.Bcircletcservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

/**
 * Created by 王显锋 on 2018/6/27.
 */
@Service
@SuppressWarnings("all")
public class BcircletcserviceImpl implements Bcircletcservice {
    private static Logger logger = LoggerFactory.getLogger(BcircletcserviceImpl.class);
    @Autowired
    private BcircletcMapper bcircletcMapper;


    @Override
    @Transactional
    public List<Bcircletc> queryall(Long id)throws BusinessException {
        logger.info("查询圈子ServiceImpl");
       return bcircletcMapper.queryall();
    }
}
