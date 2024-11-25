package  Java8.FunctionalProgramming.Stream;

import java.util.List;
import java.util.stream.Collectors;

// Distinct is an intermediate operation like filter, map. Returns only unique value
// It uses equals method to evaluate the equality of objects

// Question: find distinct numbers from the list.
public class B2_distinct {
	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2, 3, 1, 4, 6, 3, 6, 9, 5);
		
		List<Integer> uniqueNums = nums.stream().distinct().collect(Collectors.toList());
		
		uniqueNums.stream().forEach(System.out::println);
	}
}
