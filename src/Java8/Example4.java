package Java8;

import java.util.Arrays;
import java.util.List;

public class Example4 {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// System.out.println(getUsingJava7(values));
		System.out.println(getUsingJava8WithSepFunction(values));
	}

	// double the first even number in the list and it should be greater then 3
	// o/p should be 4 * 2 = 8
	private static Integer getUsingJava7(List<Integer> values) {
		int result = 0;
		for (Integer value : values) {
			if (value > 3 && value % 2 == 0) {
				result = value * 2;
				break;
			}
		}
		return result;
	}

	// lets do same thing using java8
	// some times it throws null pointer exception
	private static Integer getUsingJava8(List<Integer> values) {
		// return values.stream().filter(e -> e > 3).filter(e -> e % 2 ==
		// 0).map(e -> e * 2).findFirst();
		return values.stream().filter(e -> e > 3).filter(e -> e % 2 == 0).map(e -> e * 2).findFirst().orElse(0);
	}

	// lets do some more generic way
	// so create 3 different method 1 - greater than 3, 2 - %2 ==0 , 3 - *2
	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	private static boolean isGT3(int number) {
		return number > 3;
	}
	
	private static int doubleIt(int number) {
		return number*2;
	}
	
	private static Integer getUsingJava8WithSepFunction(List<Integer> values) {
		return values.stream()
				.filter(Example4::isGT3)
				.filter(Example4::isEven)
				.map(Example4::doubleIt)
				.findFirst().orElse(0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
