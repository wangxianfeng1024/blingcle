package com.blingcle.common.found.other.service.impl;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.found.mapper.CircleMapper;
import com.blingcle.common.found.other.service.CircleService;
import com.blingcle.common.found.pojo.Circle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 王显锋 on 2018/7/5.
 */
@Service
@SuppressWarnings("all")
public class CircleServiceImpl implements CircleService {
    private static Logger logger = LoggerFactory.getLogger(CircleServiceImpl.class);

    @Autowired
    private CircleMapper circleMapper;

    @Override
    @Transactional
    public List<Circle> queryBcirclebyUser(Long id) throws BusinessException {
        logger.info("查询用户圈子ServiceImpl");
        return circleMapper.queryBcirclebyUser(id);
    }


    @Override
    @Transactional
    public List<Circle> queryAllCircle() {
        logger.info("查询所有圈子ServiceImpl");
        return circleMapper.queryAllCircle();
    }
}
