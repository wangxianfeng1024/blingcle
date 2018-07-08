package com.blingcle.common.found.videoview.controller;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.core.utils.JsonUtil;
import com.blingcle.common.found.pojo.Videoview;
import com.blingcle.common.found.praise.controller.PraiseController;
import com.blingcle.common.found.videoview.service.VideoviewService;
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
@RequestMapping("/VideoviewController")
@SuppressWarnings("all")
public class VideoviewController {
    private static Logger logger = LoggerFactory.getLogger(PraiseController.class);
    @Autowired
    private VideoviewService videoviewService;

    /**
     * 视频观看记录
     * @param busertc
     * @return
     * @throws BusinessException
     */
    @PostMapping(value = "/insertVideoview")
    public  Object insertVideoview(@RequestBody BaseList<Videoview> baseList) throws BusinessException {
        logger.info("视频观看记录Controller");
        Videoview videoview = baseList.getFormbean();
        videoview.setUserid(baseList.getId());
        videoviewService.insertPraise(videoview);
        return JsonUtil.success();
    }
}
