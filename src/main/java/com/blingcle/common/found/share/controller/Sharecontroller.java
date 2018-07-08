package com.blingcle.common.found.share.controller;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.core.utils.JsonUtil;
import com.blingcle.common.found.pojo.Share;
import com.blingcle.common.found.share.service.ShareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public  Object insertShare(@RequestBody BaseList<Share> baseList) throws BusinessException {
        logger.info("视频分享记录Controller");
        Share share = baseList.getFormbean();
        share.setUserid(baseList.getId());
        shareService.insertShare(share);
        return JsonUtil.success();
    }

}
