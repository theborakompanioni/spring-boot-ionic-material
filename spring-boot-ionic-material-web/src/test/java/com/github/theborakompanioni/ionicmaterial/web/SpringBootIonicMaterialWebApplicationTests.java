package com.github.theborakompanioni.ionicmaterial.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootIonicMaterialWebApplication.class)
@WebIntegrationTest("server.port:0")
public class SpringBootIonicMaterialWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
