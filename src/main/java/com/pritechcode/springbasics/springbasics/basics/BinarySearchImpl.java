package com.pritechcode.springbasics.springbasics.basics;

// import javax.annotation.PostConstruct;
// import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SortAlgorithm bubbleSort;
    /* Precedence
     * between @primary and name @primary will have the precedence
     */
    /* 
     *   Autowiring using name
     *     @Autowired
            private SortAlgorithm bubbleSort;
    */
	/* 
     * Autowiring using qualifier
     *  @Autowired
     *  @Qualifier('bubble') OR @Qualifier('quick')
     *  private SortAlgorithm sortAlgorithm;
     */
	public int binarySearch(int[] numbers, int numberToSearchFor) {

		bubbleSort.sort(numbers);
		System.out.println(bubbleSort);
		// Search the array
		return 3;
	}

    // @PostConstruct
    // public void postConstruct(){
    //     logger.info("postConstruct");
    // }

    // @PreDestroy
    // public void preDestroy(){
    //     logger.info("preDestroy");
    // }
}
