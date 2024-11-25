package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Exercise 2: Average Length of Strings
//Task: Given a list of strings, calculate the average length of the strings.

public class B9_Exercise {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
		
		OptionalDouble average = words.stream().mapToInt(String::length).average();
		
		average.ifPresent(System.out::println);
	}
}
