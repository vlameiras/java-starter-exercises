package org.altar.training.ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class FibonacciSolution {

	// Please note the limitation of int being only 32-bit
	public static void main(String[] args) {
		int max = 10;
		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < max; i++) {
			intList.add(fibonacci(i + 1));
		}

		intList.stream().forEach(System.out::println);

		OptionalDouble average = intList.stream().mapToDouble(Integer::doubleValue).average();

		if (average.isPresent()) {
			System.out.printf("Average is %.2f", average.getAsDouble());
		}
	}

	public static int fibonacci(int f) {
		if (f == 1 || f == 2) {
			return 1;
		}

		return fibonacci(f - 1) + fibonacci(f - 2);
	}
}
