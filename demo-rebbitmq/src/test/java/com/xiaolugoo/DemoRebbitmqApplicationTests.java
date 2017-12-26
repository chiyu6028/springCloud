package com.xiaolugoo;

import com.xiaolugoo.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoRebbitmqApplicationTests {

	Logger logger = LoggerFactory.getLogger(DemoRebbitmqApplicationTests.class);

	@Autowired
	Sender sender;

	@Test
	public void contextLoads() {
		sender.send();
	}

}
