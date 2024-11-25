package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Convert list of strings such that all the words containing " "(empty space) will be added as two 
// seperate words

// Sample input: ("New Delhi", "Washigton DC", "Ankara", "London")
// Sample output: ("New",  "Delhi", "Washigton",  "DC", "Ankara", "London")

public class A4_flatMap2 {
	public static void main(String[] args) {
		List<String> capitals = List.of("New Delhi", "Washigton DC", "Ankara", "London");
		
		List<String> flattened = capitals.stream().flatMap(capital -> Arrays.stream(capital.split(" "))).collect(Collectors.toList());
		
		flattened.stream().forEach(System.out::println);
	}
}
