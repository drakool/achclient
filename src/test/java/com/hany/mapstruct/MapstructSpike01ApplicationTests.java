package com.hany.mapstruct;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.hany.hibernate.bootstrap.HibernateConf;

@SpringBootTest
@ContextConfiguration(classes = { HibernateConf.class })
class MapstructSpike01ApplicationTests {

	@Test
	void contextLoads() {
	}

}
