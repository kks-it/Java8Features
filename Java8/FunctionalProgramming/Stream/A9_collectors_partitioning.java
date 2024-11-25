package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// partitioning is special version of grouping, to divide the stream into two parts by using a predicate
// every partitioning can be achieved by grouping also

public class A9_collectors_partitioning {
	public static void main(String[] args) {
		Integer[] nums = { 2, 6, 3, 5, 7, 4, 6, 18, 37, 29, 78 };

		Map<Boolean, List<Integer>> partitioned = Arrays.stream(nums).collect(
				Collectors.partitioningBy(a -> a % 2 == 0));

		System.out.println(partitioned);
	}
}
