package com.blingcle.common.found.other.service;

import com.blingcle.common.found.pojo.Circle;

import java.util.List;

/**
 * Created by 王显锋 on 2018/7/5.
 */
public interface CircleService {

    List<Circle> queryBcirclebyUser(Long id);

    List<Circle> queryAllBcircle();
}
