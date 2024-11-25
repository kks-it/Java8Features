package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Exercise 10: Find the Second Largest Number
//Task: Given a list of integers, find the second largest number using stream operations.


public class C6_Exercise {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 1, 9, 7, 3, 9, 8);
		
		Optional<Integer> secondMax = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
		
		secondMax.ifPresent(System.out::println);
	}
}
