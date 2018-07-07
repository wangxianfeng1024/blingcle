package com.blingcle.common;

import com.blingcle.common.found.other.service.RegionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlingcleApplicationTests {
    @Autowired
    private RegionService regionService;

    //    @Test
//    public void contextLoads() {
//        SendUtils.sendMessage("18337155703","123456");
////
//    }
    @Test
    public void test01() {

    }
}
