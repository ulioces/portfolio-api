package com.jcmb.portfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jcmb.portfolio.service.DataService;

@SpringBootApplication
public class PortfolioApplication implements CommandLineRunner {

	// private static final Logger logger =
	private static final Logger logger = LoggerFactory.getLogger(PortfolioApplication.class);
	  
	@Autowired
	DataService dataService;

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

	@Override
	public void run(String... arg0) {
		dataService.findAll().forEach(c -> logger.info(c.toString()));
	}
}
