package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Exercise 5: Grouping Strings by Their Length
//Task: Group a list of strings by their length and then find the total number of strings for each length.

public class C2_Exercise {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("a", "bb", "ccc", "dd", "e", "ffff", "ggg");
		
		Map<Integer, List<String>> grouped = words.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(grouped);
	}
}
