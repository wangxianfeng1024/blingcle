package com.blingcle.common.found.bvideo.controller;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.core.utils.JsonUtil;
import com.blingcle.common.found.bvideo.service.impl.VideoService;
import com.blingcle.common.found.vo.VideoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 王显锋 on 2018/7/5.
 */
@RestController
@RequestMapping("/VideoController")
public class VideoController {
    private static Logger logger = LoggerFactory.getLogger(VideoController.class);
    @Autowired
    private VideoService videoService;

    @PostMapping(value = "/insertVideo")
    public  Object insertVideo(@RequestBody BaseList<VideoVo> baseList) throws BusinessException {
        VideoVo videoVo = baseList.getFormbean();
        videoVo.setUserid(baseList.getId());
        videoService.insertVideo(videoVo);
        return JsonUtil.success(videoVo);
    }

}
