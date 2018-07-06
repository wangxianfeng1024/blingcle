package com.blingcle.common.found.share.controller;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.found.pojo.Share;
import com.blingcle.common.found.share.service.ShareService;
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
@RequestMapping("/Sharecontroller")
@SuppressWarnings("all")
public class Sharecontroller {
    private static Logger logger = LoggerFactory.getLogger(Sharecontroller.class);

    @Autowired
    private ShareService shareService;

    /**
     * 视频分享记录
     *
     * @param busertc
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/insertShare")
    public Map<String, Object> insertShare(@RequestBody BaseList<Share> baseList) throws BusinessException {
        logger.info("视频分享记录Controller");
        Map<String, Object> resultMap = new HashMap<String, Object>();
        Share share = baseList.getFormbean();
        share.setUserid(baseList.getId());
        shareService.insertShare(share);
        resultMap.put("status", Constants.RETURN_STATUS_CODE_SUCCESS);
        return resultMap;
    }

}
