package com.lambda.multibd.profiles;

import com.lambda.multibd.profiles.model.Edificio;
import com.lambda.multibd.profiles.repository.ApplicationRepository;
import com.lambda.multibd.profiles.repository.ConfigurationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringBootProfilesMultiBdApplicationTests {

	@Autowired
	ConfigurationRepository configurationRepository;

	@Autowired
	ApplicationRepository applicationRepository;

	@Test
	void contextLoads() {

		String qry = "select 1234 from dual";

		Edificio edificio = applicationRepository.ejecutaQuery(qry, Edificio.class, Edificio.class);
	}

	@Test
	void testEjecutaQuery() {

		String qryObtained = configurationRepository.getQuery("QRY_EDIFICIO");
		Assert.assertEquals("SELECT  * FROM EDIFICIO", qryObtained);
	}

}
