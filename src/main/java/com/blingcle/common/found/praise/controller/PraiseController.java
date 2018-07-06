package com.blingcle.common.found.praise.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.found.pojo.Praise;
import com.blingcle.common.found.praise.service.PraiseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 王显锋 on 2018/7/6.
 */
@RestController
@RequestMapping("/PraiseController")
@SuppressWarnings("all")
public class PraiseController {
    private static Logger logger = LoggerFactory.getLogger(PraiseController.class);
    @Autowired
    private PraiseService praiseService;

    /**
     * 视频点赞记录
     * @param busertc
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/insertPraise")
    public Map<String, Object> insertPraise(@RequestBody BaseList<Praise> baseList) throws BusinessException {
        logger.info("视频点赞记录Controller");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Praise praise = baseList.getFormbean();
        praise.setUserid(baseList.getId());
        praiseService.insertPraise(praise);
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        return resultMap;
    }
}
