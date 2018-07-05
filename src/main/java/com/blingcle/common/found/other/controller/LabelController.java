package com.blingcle.common.found.other.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.found.other.service.LabelService;
import com.blingcle.common.found.pojo.Label;
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
@RequestMapping("LabelController")
@SuppressWarnings("all")
public class LabelController {
    private static Logger logger = LoggerFactory.getLogger(LabelController.class);
    @Autowired
    private LabelService labelService;

    /**
     *查询所有标签
     * @param baseList
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/queryallLabel")
    public Map<String, Object> queryallLabel(@RequestBody BaseList<Label> baseList) throws BusinessException {
        logger.info("查询表签Controller");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<Label> labels = labelService.queryallLabel();
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data", labels);
        return resultMap;
    }
}
