package com.blingcle.common.core.service.impl;


import com.blingcle.common.core.service.ConstantsService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by wangxianfeng on 2017/8/22.
 */
@Service
public class ConstantsServiceImpl implements ConstantsService {
    private static final Logger logger = Logger.getLogger(ConstantsServiceImpl.class);

//    @Autowired
//    private BsystemparametertcMapper bsystemparametertcMapper;

//    public Map bulidAccountMap( ) {
//        String types="07";//07：登陆同时在线数配置
//        List<BackInfor> lists =constantsDAO.bulidBackMap(types);
//        Map map= new HashMap();
//        for(BackInfor back:lists){
//            Map map1= new HashMap();
//            map1.put("id",back.getId());
//            map1.put("interfaceType",back.getInterfaceType());
//            for(BackInforDetail backdet:back.getDetails()){
//                map1.put(backdet.getKey(),backdet.getValue());
//            }
//            map.put(back.getChannelId(),map1);
//        }
//        logger.info("bulidAccountMap 方法已取到map值："+map.size());
//        return map;
//    }


//    @Override
//    public Map bulidmapforSystem() {
//        List<Bsystemparametertc> lists = bsystemparametertcMapper.queryall();
//        Map map = new HashMap();
//        for (Bsystemparametertc dTc : lists) {
//            map.put(dTc.getName(), dTc.getValue());
//        }
//        logger.info("mapforSystem 方法已取到map值：" + map.size());
//        return map;
//    }
}
