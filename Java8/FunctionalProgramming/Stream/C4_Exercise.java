package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Exercise 7: Calculate the Product of All Even Numbers
//Task: Given a list of integers, calculate the product of all even numbers.


public class C4_Exercise {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		Optional<Integer> product = numbers.stream().filter(a -> a %2 ==0 ).reduce((a, b) -> a * b);
		
		product.ifPresent(System.out::print);
	}
}
