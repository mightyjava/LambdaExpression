package Java8;

import java.util.Arrays;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		//printUsingJava7(values);
		printUsingJava8(values);
	}
	
	private static void printUsingJava8(List<Integer> values) {
		System.out.println("Java 8 using lambda expression");
		System.out.println("type 1");
		values.forEach(value -> {
			System.out.println(value);
		});
		
		System.out.println("type 2");
		values.forEach(System.out::println); 
	}

	private static void printUsingJava7(List<Integer> values) {
		System.out.println("Java 7 Type 1 using simple for loop");
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}

		System.out.println("Java 7 Type 2 using for each loop");
		for (Integer value : values) {
			System.out.println(value);
		}
	}
}
