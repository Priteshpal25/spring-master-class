package com.pritechcode.springbasics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pritechcode.springbasics.componentscan.ComponentDOA;

// @SpringBootApplication
@Configuration
@ComponentScan("com.pritechcode.springbasics.componentscan")
public class SpringBasicComponentScanApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicComponentScanApplication.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringBasicComponentScanApplication.class);
        // SpringApplication.run(SpringBasicComponentScanApplication.class, args);

        ComponentDOA componentDOA = applicationContext.getBean(ComponentDOA.class);

		LOGGER.info("{}", componentDOA);
		LOGGER.info("{}", componentDOA.getJdbcConnection());

        applicationContext.close();
		// LOGGER.info("{}", person2);
		// LOGGER.info("{}", person1.getJdbcConnection());
	}
}
