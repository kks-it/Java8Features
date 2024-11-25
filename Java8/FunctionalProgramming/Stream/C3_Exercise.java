package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;

//Exercise 6: Concatenate Strings with a Certain Length
//Task: Given a list of strings, concatenate all strings that have a length greater than 3.

public class C3_Exercise {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("one", "two", "three", "four", "five");
		
		String concatenatedString = words.stream()
				.filter(str -> str.length() > 3)
				.reduce("", (s1, s2) -> s1 + s2);
		
		System.out.println(concatenatedString);
	}
}
