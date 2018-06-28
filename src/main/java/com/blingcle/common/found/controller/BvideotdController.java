package com.blingcle.common.found.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.found.pojo.Bvideotd;
import com.blingcle.common.found.service.Bvideotdservice;
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
 * Created by 王显锋 on 2018/6/27.
 */
@RestController
@RequestMapping("/BvideotdController")
@SuppressWarnings("all")
public class BvideotdController {
    private static Logger logger= LoggerFactory.getLogger(BvideotdController.class);
    @Autowired
    private Bvideotdservice bvideotdservice;

    /**
     * 视频发布接口
     * @param baseList
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/addBvideotd")
    public Map<String,Object> addBvideotd(@RequestBody BaseList<Bvideotd> baseList)throws BusinessException {
        logger.info("发布视频Controller");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Bvideotd bvideotd =  baseList.getFormbean();
        bvideotd.setUserid(baseList.getId());
        bvideotd=  bvideotdservice.insertBvideotd(bvideotd);
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        resultMap.put("data",bvideotd);
        return resultMap;
    }

}
