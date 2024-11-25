package  Java8.FunctionalProgramming.Stream.Assignment;

import java.util.*;
import java.util.stream.Collectors;

public class Assignment {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, Gender.MALE, "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Umesh", "Dhingra", 34, Gender.MALE, "Computer Engineering", 2018, "Delhi", 76),
                new Student(2, "Pulkit", "Singh", 56, Gender.MALE, "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, Gender.FEMALE, "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, Gender.MALE, "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, Gender.MALE, "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, Gender.MALE, "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, Gender.MALE, "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, Gender.MALE, "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, Gender.FEMALE, "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, Gender.MALE, "Instrumentation Engineering", 2017, "Mumbai", 98));

        //		1- Find list of students whose first name starts with alphabet A
        List<Student> result1 = list.stream().filter(stu -> stu.firstName().startsWith("A")).toList();
        System.out.println("\n\nresult1 " + result1);

        //		2- Group The Student By Department Names
        Map<String, List<Student>> result2 = list.stream().collect(Collectors.groupingBy(Student::department, Collectors.toList()));
        System.out.println("\n\nresult2 " + result2);

        //		3- Find the total count of student using stream
        long result3 = list.stream().count();
        System.out.println("\n\nresult3: Total no. of students - " + result3);

        //		4- Find the max age of student
//        OptionalInt result4 = list.stream().mapToInt(Student::age).max();
//        if(result4.isPresent()){
//            System.out.println("result4: Max age of students - \n\n" + result4.getAsInt());
//        }

        Optional<Student> maxAge = list.stream().max(Comparator.comparing(Student::age));
        System.out.println("\n\n\nresult--> " + maxAge.get());


        //		5- Find all departments names
        List<String> departments = list.stream().map(Student::department).distinct().toList();
        System.out.println("\n\nresult5: departments - " + departments);

        //		6- Find the count of student in each department
        Map<String, Long> result6 = list.stream().collect(Collectors.groupingBy(Student::department, Collectors.counting()));
        System.out.println("\n\nresult6: " + result6);

        //		7- Find the list of students whose age is less than 30
        List<Student> result7 = list.stream().filter(stu -> stu.age() < 30).toList();
        System.out.println("\n\nresult7:\n " + result7);

        //		8- Find the list of students whose rank is in between 50 and 100
        List<Student> result8 = list.stream().filter(stu -> stu.rank() >= 50 && stu.rank() <= 100).toList();
        System.out.println("\n\nresult8:\n " + result8);

        //		9- Find the average age of male and female students
        Map<Gender, Double> result9 = list.stream().collect(Collectors.groupingBy(Student::gender, Collectors.averagingInt(Student::age)));
        System.out.println("\n\nresult9: \n" + result9);

        //		10- Find the department who is having maximum number of students
        Map.Entry<String, Long> result10 = list.stream().collect(Collectors.groupingBy(Student::department, Collectors.counting())).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();
        System.out.println("\n\nresult10: " + result10);

        //		11- Find the Students who stays in Delhi and sort them by their names
    }
}

record Student(int id, String firstName, String lastName, int age, Gender gender, String department, int batch, String address, int rank){};

enum Gender{ MALE, FEMALE};
