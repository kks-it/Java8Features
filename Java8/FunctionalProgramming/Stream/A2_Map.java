package  Java8.FunctionalProgramming.Stream;

import java.util.List;
import java.util.stream.Collectors;

// Question: Extract name of each person from the list of Person objects

public class A2_Map {
	public static void main(String[] args) {
		List<Person> people = List.of(new Person("Krishna", 26), new Person("Himanshu", 27), new Person("Hitesh", 25));
		
		List<String> peopleNames = people.stream().map(Person::getName).collect(Collectors.toList());
		
		peopleNames.stream().forEach(System.out::println);
	}
}

class Person{
	private String name;
	private int age;
	
	Person(){};
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	
	public  void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "{ name = " + this.name + ", age = " + this.age + " }";
	}
}
