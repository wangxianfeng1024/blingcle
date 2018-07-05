package com.blingcle.common.found.other.service.impl;

import com.blingcle.common.core.constant.Constants;
import com.blingcle.common.found.mapper.RegionMapper;
import com.blingcle.common.found.other.service.RegionService;
import com.blingcle.common.found.vo.RegionVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * Created by 王显锋 on 2018/7/5.
 */
@Service
public class RegionServiceImpl implements RegionService {
    private static Logger logger = LoggerFactory.getLogger(RegionServiceImpl.class);

    @Autowired
    private RegionMapper regionMapper;

    @Override
    public List<RegionVo> queryrRegion(RegionVo regionVo) {
        logger.info("查询地区ServiceImpl");
        if (ObjectUtils.isEmpty(regionVo.getId())) {
            regionVo.setId(Constants.REGION_PARENTID);
        }
        return regionMapper.queryrRegion(regionVo.getId());
    }
}
