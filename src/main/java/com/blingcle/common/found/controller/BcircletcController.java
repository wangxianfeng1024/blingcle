package com.blingcle.common.found.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.found.pojo.Bcircletc;
import com.blingcle.common.found.pojo.Bvideotd;
import com.blingcle.common.found.service.Bcircletcservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 王显锋 on 2018/6/27.
 */
@RestController
@RequestMapping
@SuppressWarnings("all")
public class BcircletcController {
    private static Logger logger = LoggerFactory.getLogger(BcircletcController.class);
    @Autowired
    private Bcircletcservice bcircletcservice;

    @PostMapping(value = "/queryBcircle")
    public Map<String, Object> queryBcircle(@RequestBody BaseList<Bcircletc> baseList) throws BusinessException {
        logger.info("查询圈子Controller");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<Bcircletc> bcircletcs = bcircletcservice.queryall(baseList.getId());
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data", bcircletcs);
        return resultMap;
    }
}








