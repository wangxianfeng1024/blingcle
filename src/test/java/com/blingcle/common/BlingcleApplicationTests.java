package com.blingcle.common;

import com.blingcle.common.found.mapper.BusertcMapper;
import com.blingcle.common.found.pojo.Busertc;
import com.blingcle.common.found.service.Busertcservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlingcleApplicationTests {
@Autowired
private BusertcMapper busertcMapper;
@Autowired
private Busertcservice busertcservice;
	@Test
	public void contextLoads() {

//		Busertc busertc=busertcMapper.queryBusertcDatail((long)8);
		Busertc busertc=busertcservice.queryBusertcDatail((long)8);
		System.out.println(busertc);
	}

}
