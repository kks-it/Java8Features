package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

//Exercise 3: Longest String in a List
//Task: Find the longest string in a given list of strings.

public class C1_Exercise {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
		
		Optional<String> longestString = words.stream()
				.max(Comparator.comparingInt(String::length));
		
//		Optional<String> longestString = words.stream()
//		.collect(Collectors.maxBy((str1, str2) -> Integer.compare(str1.length(), str2.length())));
		
		longestString.ifPresent(System.out::println);
		
		List<Integer> numbers = Arrays.asList(12, 3, 45, 7, 19, 24);
		OptionalInt max = numbers.stream().mapToInt(n -> n).max();
		OptionalInt min = numbers.stream().mapToInt(n -> n).min();
		System.out.println("max: " + max.getAsInt() + " min: " + min.getAsInt());
	}
}
