package com.blingcle.common.found.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.found.pojo.Bcircletc;
import com.blingcle.common.found.pojo.Blabeltc;
import com.blingcle.common.found.service.Blabeltcservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 王显锋 on 2018/6/27.
 */
@RestController
@RequestMapping("BlabeltcController")
@SuppressWarnings("all")
public class BlabeltcController {
    private static Logger logger = LoggerFactory.getLogger(BlabeltcController.class);
    @Autowired
    private Blabeltcservice blabeltcservice;

    /**
     *查询所有标签
     * @param baseList
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/queryBlabeltc")
    public Map<String, Object> queryBlabeltc(BaseList<Blabeltc> baseList) throws BusinessException {
        logger.info("查询表签Controller");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<Blabeltc> blabeltcs = blabeltcservice.queryall(baseList.getId());
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data", blabeltcs);
        return resultMap;
    }
}
