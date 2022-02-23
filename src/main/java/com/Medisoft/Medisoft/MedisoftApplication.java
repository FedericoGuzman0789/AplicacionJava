package com.Medisoft.Medisoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaRepositories
@SpringBootApplication
@ServletComponentScan
@EnableAsync
@EnableScheduling
public class MedisoftApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedisoftApplication.class, args);
	}

}
