package com.blingcle.common.core.constant;


import com.blingcle.common.core.service.ConstantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 
 * Created by wangxianfeng on 2018/02/7.
 */
@Component
public class ConstantsInitializer implements CommandLineRunner{
   
@Autowired
private ConstantsService constantsService;
    @Override
    public void run(String... args) throws Exception {
        Constants.mapforSystem = constantsService.bulidmapforSystem();
    }
}
