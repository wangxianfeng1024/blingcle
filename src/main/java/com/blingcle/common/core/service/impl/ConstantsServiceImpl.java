package com.blingcle.common.core.service.impl;


import com.blingcle.common.core.service.ConstantsService;
import com.blingcle.common.found.mapper.SystemparameterMapper;
import com.blingcle.common.found.pojo.Systemparameter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangxianfeng on 2017/8/22.
 */
@Service
public class ConstantsServiceImpl implements ConstantsService {
    private static final Logger logger = Logger.getLogger(ConstantsServiceImpl.class);

    @Autowired
    private SystemparameterMapper systemparameterMapper;


    @Override
    public Map bulidmapforSystem() {
        List<Systemparameter> lists = systemparameterMapper.queryall();
        Map map = new HashMap();
        for (Systemparameter dTc : lists) {
            map.put(dTc.getName(), dTc.getValue());
        }
        logger.info("mapforSystem 方法已取到map值：" + map.size());
        return map;
    }
}
