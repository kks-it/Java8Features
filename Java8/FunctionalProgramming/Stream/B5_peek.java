package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

//The peek() method is an intermediate operation that allows you to perform an action on each element 
//of the stream as it is processed. It’s primarily used for debugging purposes or when you want to
//perform a side-effect operation without modifying the stream itself.
//
//When to Use peek():
//When you want to inspect elements in a stream as they pass through the pipeline.
//Useful for logging, debugging, or performing actions that don't alter the stream’s data.

// Use case according to me
// map and forEach also allow us to perform certain action
// However, in map it is mandatory to return something
// In forEach it is not mandatory. However, it is a terminal operation 


//Question: filter fruits that starts from 'b', print the filtered list.
// 			map filtered list to upper case. print the result.
public class B5_peek {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "blueberry",  "cherry", "date");
		
		words = words.parallelStream().filter(fruit -> fruit.startsWith("b"))
						.peek(System.out::println)
						.map(String::toUpperCase)
						.peek(fruit -> System.out.println("Mapped Fruit: " + fruit))
						.collect(Collectors.toList());
		
		System.out.println(words);
		
		
		AtomicInteger counter = new AtomicInteger();
		
		words.parallelStream().peek(word -> counter.incrementAndGet()).collect(Collectors.toList());
		System.out.println(counter.get());
	}
}
