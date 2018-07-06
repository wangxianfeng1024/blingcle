package com.blingcle.common.found.other.service.impl;

import com.blingcle.common.found.mapper.LabelMapper;
import com.blingcle.common.found.other.service.LabelService;
import com.blingcle.common.found.pojo.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

/**
 * Created by 王显锋 on 2018/7/5.
 */
@Service
public class LabelServiceImpl implements LabelService {
    private static Logger logger = LoggerFactory.getLogger(LabelServiceImpl.class);
    @Autowired
    private LabelMapper labelMapper;

    @Override
    @Transactional
    public List<Label> queryAllLabel() {
        logger.info("查询所有标签ServiceImpl");
        return labelMapper.queryAllLabel();
    }

    @Override
    @Transactional
    public int insertLabel(Label label) {
      return   labelMapper.insert(defaultval(label));
    }

    protected Label defaultval(Label label){
        label.setIsvalid(true);
        label.setVersion(0);
        label.setCrtatetime(new Date());

        return label;
    }
}
