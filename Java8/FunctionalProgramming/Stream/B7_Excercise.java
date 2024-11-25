package  Java8.FunctionalProgramming.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Question: Find average marks of each students. from the below 2-D array. can we do it using streams.
//
// Sample Input:  {{"Krishna", "24"}, {"Hemant", "20"}, {"Himanshu", "22"}, {"Krishna", "25"},
//		{"Himanshu", "25"}, {"Hemant", "22"}, {"Aman", "19"}}
//
// Sample Output: 

public class B7_Excercise {

    public static void main(String[] args) {
        String[][] studentMarks = {
                { "Krishna", "24" }, { "Hemant", "20" }, { "Himanshu", "22" }, { "Krishna", "25" },
                { "Himanshu", "25" }, { "Hemant", "22" }, { "Aman", "19" }
        };
        Map<String, Double> averageMarks = averageMarks(studentMarks);
        System.out.println(averageMarks);
        
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        
        Double average = nums.stream().collect(Collectors.averagingInt(n -> n));
        System.out.println(average);
    }

    public static Map<String, Double> averageMarks(String[][] studentMarks) {

        return Arrays.stream(studentMarks).collect(
                Collectors.groupingBy(arr -> arr[0], Collectors.averagingInt(arr -> Integer.parseInt(arr[1]))));
    }

}
