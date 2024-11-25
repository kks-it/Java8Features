package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B1_filter {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Krishna", 26),
				new Person("Ishu", 15),
				new Person("Rajesh", 34), 
				new Person("Roshan", 27),
				new Person("Rohan", 12),
				new Person("Mayank", 11));
		
		List<Person> adults = people.parallelStream()
									.filter(p -> p.getAge() >= 18)
									.collect(Collectors.toList());
		
		System.out.println(adults);
	}
}
