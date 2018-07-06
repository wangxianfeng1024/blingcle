package com.blingcle.common.found.other.service;

import com.blingcle.common.found.pojo.Label;

import java.util.List;

/**
 * Created by 王显锋 on 2018/7/5.
 */
public interface LabelService {

    List<Label> queryAllLabel();

    int insertLabel(Label label);
}
