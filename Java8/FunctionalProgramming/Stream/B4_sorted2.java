package  Java8.FunctionalProgramming.Stream;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;


public class B4_sorted2 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
			    new Person("Alice", 23),
			    new Person("Bob", 17),
			    new Person("Charlie", 19),
			    new Person("Dwane", 23)
			);
		
		List<Person> sorted = people.stream()
				.sorted(Comparator
						.comparing(Person::getAge, Comparator.reverseOrder()).
						thenComparing(Person::getName, Comparator.reverseOrder()))
				.collect(Collectors.toList());
		
		sorted.forEach(System.out::println);
	}
}
