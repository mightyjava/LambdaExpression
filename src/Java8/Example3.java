package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example3 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Using Java7");
		System.out.println("All - " + sumOfAll(values));
		System.out.println("Even - " + sumOfEven(values));
		System.out.println("Odd - " + sumOfOdd(values));

		System.out.println("Using Java8 - type 1");
		System.out.println("All - " + sumOfValuesType1(values, e -> true));
		System.out.println("Even - " + sumOfValuesType1(values, e -> e % 2 == 0));
		System.out.println("Odd - " + sumOfValuesType1(values, e -> e % 2 != 0));
		
		System.out.println("Using Java8 - type 2");
		System.out.println("All - " + sumOfValuesType2(values, e -> true));
		System.out.println("Even - " + sumOfValuesType2(values, e -> e % 2 == 0));
		System.out.println("Odd - " + sumOfValuesType2(values, e -> e % 2 != 0));
	}

	// Instead of 3 will create only one method and use predicate
	private static Integer sumOfValuesType1(List<Integer> values, Predicate<Integer> selector) {
		int sum = 0;
		for (Integer value : values) {
			if (selector.test(value)) {
				sum += value;
			}
		}
		return sum;
	}

	private static Integer sumOfValuesType2(List<Integer> values, Predicate<Integer> selector) {
		return values.stream().filter(selector).reduce(0, (c, e) -> c + e);
	}

	private static Integer sumOfAll(List<Integer> values) {
		int sum = 0;
		for (Integer value : values) {
			sum += value;
		}
		return sum;
	}

	// Even %2 == 0
	private static Integer sumOfEven(List<Integer> values) {
		int sum = 0;
		for (Integer value : values) {
			if (value % 2 == 0)
				sum += value;
		}
		return sum;
	}

	// odd %2 !=0
	private static Integer sumOfOdd(List<Integer> values) {
		int sum = 0;
		for (Integer value : values) {
			if (value % 2 != 0)
				sum += value;
		}
		return sum;
	}
}
