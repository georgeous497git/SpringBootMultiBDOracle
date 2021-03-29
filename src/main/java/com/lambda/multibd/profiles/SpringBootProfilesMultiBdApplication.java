package com.lambda.multibd.profiles;

import com.lambda.multibd.profiles.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootProfilesMultiBdApplication {

	private final static Logger LOG = LoggerFactory.getLogger(SpringBootProfilesMultiBdApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesMultiBdApplication.class, args);
	}

	@PostConstruct
	private void postConstructSpring() {
		Utils.imprimeVersion();
	}
}
