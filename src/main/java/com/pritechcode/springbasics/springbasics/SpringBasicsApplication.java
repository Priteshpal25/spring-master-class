package com.pritechcode.springbasics.springbasics;


// import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pritechcode.springbasics.springbasics.basics.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringBasicsApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =  
			new AnnotationConfigApplicationContext(SpringBasicsApplication.class);
		// SpringApplication.run(SpringBasicsApplication.class, args);

		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		int result = 
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
		applicationContext.close();
	}

}
