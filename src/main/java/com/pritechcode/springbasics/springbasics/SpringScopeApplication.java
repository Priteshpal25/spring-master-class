
package com.pritechcode.springbasics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pritechcode.springbasics.springbasics.scope.PersonDAO;


@Configuration
@ComponentScan
public class SpringScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringScopeApplication.class);
		// SpringApplication.run(SpringScopeApplication.class, args);

		PersonDAO person1 = applicationContext.getBean(PersonDAO.class);

		PersonDAO person2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", person1);
		LOGGER.info("{}", person1.getJdbcConnection());

		LOGGER.info("{}", person2);
		LOGGER.info("{}", person1.getJdbcConnection());
	}

}


/* 
 * 
 * scope of parent bean == singleton && scope of dependency == singleton
 * 		single instance for both of them
 * scope of parent bean == singleton && scope of dependency == prototype
 * 		single instance of parent as well as the dependency even when set to prototype
 * 
 * 
 * if scope of parent bean == singleton && we want to have different instance for dependency for each request of parent
 * 		we can do it by using the proxy
 * 		check jdbcConnection file for example
 */