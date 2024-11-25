package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// typically we can use Collectors to transform a stream into a collection like List, Set, Map
public class A7_collect1 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "mango", "banana", "mango", "blueberry", "apple", "orange");
		
		Set<String> uniqueFruits = fruits.stream().collect(Collectors.toSet());
		
		System.out.println(uniqueFruits);
		
		Map<String, Integer> map = uniqueFruits.stream().collect(Collectors.toMap(word -> word, String::length));
		
		System.out.println(map);
		//Note: Collectors will throw an IllegalStateException if it encouters duplicate keys if merger
		// function is not provided. that's why we used 'uniqueFruits' in above example
		
		
		// merger function can be provided as third argument to resolve duplicate conflicts
		List<Person> people = Arrays.asList(new Person("Krishna", 26),
					new Person("Hitesh", 25),
					new Person("Rajesh", 34), 
					new Person("Roshan", 27),
					new Person("Krishna", 27),
					new Person("Hitesh", 26));
		
		Map<String, Integer> map2 = people.stream()
				.collect(Collectors.toMap(
						Person::getName, 
						Person::getAge,
						(oldVaue, newValue) -> newValue
						));
		
		System.out.println(map2);


	}

}
