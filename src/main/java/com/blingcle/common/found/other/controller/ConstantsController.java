package com.blingcle.common.found.other.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.found.other.service.ConstantsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 王显锋 on 2018/7/7.
 */
@RestController
@RequestMapping("ConstantsController")
@SuppressWarnings("all")
public class ConstantsController {
    private static Logger logger = LoggerFactory.getLogger(ConstantsController.class);
    @Autowired
    private ConstantsService constantsService;

    /**
     * 更新系统参数map
     * @param
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/updateSystemparameter")
    public Map<String, Object> updateSystemparameter() throws BusinessException {
        logger.info("更新系统参数mapController");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Map map = constantsService.bulidmapforSystem();
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data", map);
        return resultMap;
    }

}
