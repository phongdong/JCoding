package com.bot.j8assignments;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
Assume a person class: With Name and age as paramters/attributes
new Person("Max", 18),
new Person("Peter", 23),
new Person("Pamela", 23),
new Person("David", 12));

Create methods using stream apis to do the following:

1. Print names starting with letter "P"
2.Group by age:   
		// age 18: [Max]
        // age 23:[Peter, Pamela]
        // age 12:[David]
		
3.averageAge

4.     // IntSummaryStatistics{count=4, sum=76, min=12, average=19,000000, max=23}

5.Output:  // MAX | PETER | PAMELA | DAVID

6.

*/

class Person {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	
	@Override 
	public String toString() { 
		return String.format("%s", name); 
	}
}


public class J8Assignment3 {
	
	static void printNameStartsWith(List<Person> persons, String startsWith) {
		if (!persons.isEmpty())
			persons
			 	.stream()
			 	.filter(s ->s.getName().startsWith(startsWith))
			 	.forEach(System.out::println);	
	}
	
	static Map<Integer, List<Person>> groupByAge(List<Person> persons) {
		if (!persons.isEmpty())
			return persons
			 	.stream()
			 	.collect(Collectors.groupingBy(Person::getAge));
		return null;
	}
	
	static double averageAge(List<Person> persons) {
		if (!persons.isEmpty())
			 return persons
			 	.stream()
			 	.collect(Collectors.averagingInt(Person::getAge));
		return 0.0;
	}
	
	static long countPersons(List<Person> persons) {
		if (!persons.isEmpty())
			return  persons.stream()
			.collect(Collectors.counting());
		return (long) 0.0;
	}
	
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("Max", 18),
				new Person("Peter", 23),
				new Person("Pamela", 23),
				new Person("David", 12)
		);
		//1. Print names starting with letter "P"
		System.out.println("Names starting with letter \"P\":");
		printNameStartsWith(persons,"P");
		
		//2.Group by age
		System.out.println("\nGroup By Age: " + groupByAge(persons));
		
		//3.averageAge
		System.out.println("\nAverage Age: " + averageAge(persons));
		
		//4.IntSummaryStatistics
		IntSummaryStatistics stats = persons.stream().mapToInt((x)->x.getAge()).summaryStatistics();
		System.out.println("\nIntSummaryStatistics{count="+stats.getCount()+", sum="+stats.getSum()
							+", min="+stats.getMin()+", average="+stats.getAverage()+", max="+stats.getMax()+"}");
		
		//5. MAX | PETER | PAMELA | DAVID
		String outPut = persons.stream()
				.map(Person::getName)
				.map(String::toUpperCase)
				.collect(Collectors.joining(" | "));
		System.out.println("\n" + outPut);

	}

}
