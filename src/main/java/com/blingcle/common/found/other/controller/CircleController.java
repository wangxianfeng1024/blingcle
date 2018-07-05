package com.blingcle.common.found.other.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.found.other.service.CircleService;
import com.blingcle.common.found.pojo.Circle;
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
 * Created by 王显锋 on 2018/7/5.
 */
@RestController
@RequestMapping("CircleController")
@SuppressWarnings("all")
public class CircleController {
    private static Logger logger = LoggerFactory.getLogger(CircleController.class);
    @Autowired
    private CircleService circleService;

    /**
     * 查询用户圈子
     * @param baseList
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/queryBcirclebyUser")
    public Map<String, Object> queryBcirclebyUser(@RequestBody BaseList<Circle> baseList) throws BusinessException {
        logger.info("查询用户圈子Controller");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<Circle> circles = circleService.queryBcirclebyUser(baseList.getId());
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data", circles);
        return resultMap;
    }

    /**
     * 查询所有圈子
     * @param baseList
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/queryAllBcircl")
    public Map<String, Object> queryAllBcircl(@RequestBody BaseList<Circle> baseList) throws BusinessException {
        logger.info("查询所有圈子Controller");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<Circle> circles = circleService.queryAllBcircle();
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data", circles);
        return resultMap;
    }
}
