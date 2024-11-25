package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;

//Exercise 1: Sum of Square of Odd Numbers

public class B8_Exercise {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum = numbers.stream().filter(a -> a % 2 != 0).mapToInt(a -> a * a).sum();
		
		System.out.println("Sum of numbers list: " + sum);
	}
}
