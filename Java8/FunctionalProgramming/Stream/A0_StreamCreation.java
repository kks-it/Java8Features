package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A0_StreamCreation {

	public static void main(String[] args) {
		
		// from collection
		List<String> list = Arrays.asList("Krishna", "Himanshu", "Hitesh", "Rajesh");		
		Stream<String> streamFromCollection = list.stream();
		streamFromCollection.forEach(System.out::println);
		
		// from Array
		Integer[] nums = { 1, 2, 5, 3, 9, 5};
		Stream<Integer> streamFromArray = Arrays.stream(nums);
		streamFromArray.forEach(System.out::println);
		
		// from stream interface
		Stream<String> streamFromStreamInterface = Stream.of("He", "She", "it", "they");
		streamFromStreamInterface.forEach(System.out::println);

	}

}
