package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;

// Question: Convert list of list of strings into a single list of strings
import java.util.List;
import java.util.stream.Collectors;

public class A3_flatMap1 {

	public static void main(String[] args) {
		List<List<String>> departmentSubjects = Arrays.asList(
				Arrays.asList("Physics", "Chemistry", "Maths"),
				Arrays.asList("Accounts", "Business studies"),
				Arrays.asList("History", "Geography", "Political Science")
				);
		
		List<String> subjects = departmentSubjects.stream().flatMap(List::stream).collect(Collectors.toList());
		
		subjects.stream().forEach(System.out::println);
	}

}
