package  Java8.FunctionalProgramming.Stream;

import java.util.List;

public class Z1_Exercise {
	public static void main(String[] args) {
		List<Integer> nums = List.of(3, 4, 7, 6, 8, 2, 1, 9);
		
		double average = nums.stream().mapToInt(e -> e).average().getAsDouble();
		
		System.out.println("average of nums is: " + average);
	}
}
