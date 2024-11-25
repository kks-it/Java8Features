package  Java8.FunctionalProgramming.Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A8_collectors_grouping {
	public static void main(String[] args) {
		List<String> cities = List.of("New Delhi", "San Diago", "Washington DC", "London", 
								"New York", "San Francisco", "Sydney");
		
		Map<String, List<String>> grouped = cities.stream().collect(
												Collectors.groupingBy(city -> city.split(" ")[0]));
		
		System.out.println(grouped);
		
		Map<Character, List<String>> grouped2 = cities.stream().collect(
													Collectors.groupingBy(city -> city.charAt(0)));
		
		System.out.println(grouped2);
	}
}
