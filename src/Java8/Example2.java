package Java8;

import java.util.Arrays;
import java.util.List;

public class Example2 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		doubleTheValueAndSumJava7(values);
		doubleTheValueAndSumJava8(values);
	}

	// double and sum
	// 2+4+6+8+10..... = sum(all)
	private static void doubleTheValueAndSumJava7(List<Integer> values) {
		System.out.println("Double and sum using java 7");
		int sum = 0;
		for (Integer value : values) {
			sum += value * 2;
		}
		System.out.println(sum);
	}

	// have very useful feature stream
	private static void doubleTheValueAndSumJava8(List<Integer> values) {
		System.out.println("Double and sum using java 8");
		System.out.println(values.stream()
				.map(e -> e * 2)
				.reduce(0, (c, e) -> c + e));
	}
}
