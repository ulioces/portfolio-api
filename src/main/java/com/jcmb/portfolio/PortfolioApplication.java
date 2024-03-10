package com.jcmb.portfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

	//private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
	
	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

}
