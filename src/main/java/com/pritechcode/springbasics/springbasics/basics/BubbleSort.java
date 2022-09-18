package com.pritechcode.springbasics.springbasics.basics;

// import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm {
    public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}

/* 
 * 
 * Autowring Using primary annotation
 */
// @Component
// // @Primary
// public class BubbleSort implements SortAlgorithm {
//     public int[] sort(int[] numbers) {
// 		// Logic for Bubble Sort
// 		return numbers;
// 	}
// }

/* Autowiring using @Qualifier Annotation */
// @Component
// @Qualifier('bubble')
// public class BubbleSort implements SortAlgorithm {
//     public int[] sort(int[] numbers) {
// 		// Logic for Bubble Sort
// 		return numbers;
// 	}
// }
