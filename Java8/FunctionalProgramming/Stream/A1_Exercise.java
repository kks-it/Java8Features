package  Java8.FunctionalProgramming.Stream;

import java.util.List;
import java.util.Optional;

// Question: find sum of all numbers in a list

public class A1_Exercise {
	public static void main(String[] args) {
		
		List<Integer> nums = List.of(1, 2, 3, 87, 98, 12, 9);
		
		Optional<Integer> sum = nums.stream().reduce((a, b) -> a + b);

		System.out.println("Total sum of nums is: " + sum.get());
	}
}
