package org.altar.training.ex2;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] myInts = {1, 4, 5, 3, -5, 9};
		Utils.sortArray(myInts, OrderEnum.DESCENDING);
		
		System.out.println(Arrays.toString(myInts));
	}
}
