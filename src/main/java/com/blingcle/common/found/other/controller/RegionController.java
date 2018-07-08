package com.blingcle.common.found.other.controller;

import com.blingcle.common.core.exception.BusinessException;
import com.blingcle.common.core.utils.BaseList;
import com.blingcle.common.core.utils.JsonUtil;
import com.blingcle.common.found.other.service.RegionService;
import com.blingcle.common.found.vo.RegionVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 王显锋 on 2018/7/5.
 */
@RestController
@RequestMapping("RegionController")
@SuppressWarnings("all")
public class RegionController {
    private static Logger logger = LoggerFactory.getLogger(RegionController.class);
    @Autowired
    private RegionService regionService;


    @PostMapping(value = "/queryRegion")
    public Object queryrRegion(@RequestBody BaseList<RegionVo> baseList) throws BusinessException{
        RegionVo regionVo= baseList.getFormbean();
        List<RegionVo> regionVos =regionService.queryrRegion(regionVo);
        return JsonUtil.success(regionVos);
    }

}
