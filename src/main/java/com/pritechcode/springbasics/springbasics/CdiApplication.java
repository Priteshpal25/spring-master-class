package com.pritechcode.springbasics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pritechcode.springbasics.springbasics.cdi.CdiDAO;

@Configuration
@ComponentScan
// ("com.pritechcode.springbasics.springbasics.cdi")
public class CdiApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(CdiApplication.class);
        // SpringApplication.run(CdiApplication.class, args);

        CdiDAO cdiDAO = applicationContext.getBean(CdiDAO.class);

		LOGGER.info("{} dao-{}", cdiDAO, cdiDAO.getConnection());

	}
}
