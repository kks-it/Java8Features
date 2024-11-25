package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// find the maximum number in the given list

public class A6_Reduce2 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 5, 9, 3, 25, 23, 8, 12, 5);
		
		Optional<Integer> max = nums.stream().reduce((a, b) -> Math.max(a, b));
		
		Integer max1 = nums.stream().reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));
		
		max.ifPresent(System.out::println);
		
		System.out.println("Maximum number in the list is: " + max1);
		
	}
}

// Note: In case we are not providing the identity(initial value), the return type would be Optional
