package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// concatenate all the words in a list into a single sentence(String) joined by " "(empty space)
// Sample input: ("Hello", "World", "Java", "Streams")
// Sample output: "Hello World Java Streams"
public class A5_Reduce1 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World", "Java", "Streams");
		
		String sentence = words.stream().reduce("", (str1, str2) -> str1 + " " + str2);
		
		Optional<String> sentence2 = words.stream().reduce((a, b)-> a + b);
		
		System.out.println("Sentence: "+ sentence);
		System.out.println("Combined words: " + sentence2.get());

	}

}

//Note: In case we are not providing the identity(initial value), the return type would be Optional

