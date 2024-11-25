package  Java8.FunctionalProgramming.Stream;

import java.util.ArrayList;
import java.util.List;

public class B6_parallelStreams {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i < 10_000_000; i++)
			nums.add(i);
		
		long startTime = System.nanoTime();
		long sum = nums.stream()
				.filter(n -> n % 2 == 0)
				.map(num -> Math.pow(num, 3))
				.mapToInt(Double  	::intValue)
				.sum();
		
		long endTime = System.nanoTime();
		
		System.out.println("Sum: " + sum + ", Time taken by sequential pocessing: " + (endTime - startTime)/1_000_00 + " ms");
	
		
		long startTime1 = System.nanoTime();
		long sum1 = nums.parallelStream()
				.filter(n -> n % 2 == 0)
				.mapToInt(Integer::intValue)
				.sum();
		
		long endTime1 = System.nanoTime();
		System.out.println("Sum: " + sum1 + ", Time taken by parellel pocessing: " + (endTime1 - startTime1)/1_000_00 + " ms");
		
				
	}
}




