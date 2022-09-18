package com.pritechcode.springbasics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pritechcode.springbasics.springbasics.cdi.CdiDAO;

@SpringBootApplication
public class CdiApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(CdiApplication.class, args);

        CdiDAO cdiDAO = applicationContext.getBean(CdiDAO.class);

		LOGGER.info("{} dao-{}", cdiDAO, cdiDAO.getConnection());

	}
}
