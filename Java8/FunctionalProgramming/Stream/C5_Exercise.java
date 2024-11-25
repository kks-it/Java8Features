package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.IntSummaryStatistics;

//Exercise 8: Calculate Summary Statistics
//Task: Given a list of integers, calculate summary statistics (count, sum, min, average, max) for the list.


public class C5_Exercise {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25);
		
		IntSummaryStatistics summary = numbers.stream().mapToInt(a -> a).summaryStatistics();
		
		System.out.println(summary);
	}
}
