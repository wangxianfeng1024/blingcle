package com.blingcle.common.found.service;

import com.blingcle.common.found.pojo.Busertc;
import com.blingcle.common.found.vo.BusertcVo;

/**
 * Created by 王显锋 on 2018/6/26.
 */
@SuppressWarnings("all")
public interface Busertcservice {
    Busertc register(BusertcVo busertcVo);

    Busertc login(BusertcVo busertcVo);

    Busertc updataBusertcDatail(Busertc busertc);

    Busertc  queryBusertcDatail(Long id);
}
