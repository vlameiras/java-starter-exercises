package org.altar.training.ex4;

import java.util.Arrays;

public class MathMinMax {
	public static void main(String[] args) {
		Integer [] myIntArray = new Integer[]{0, 5, 2, 11};
		Arrays.sort(myIntArray);

		//Output smallest 
		System.out.println(myIntArray[0]);

		//Output largest
		System.out.println(myIntArray[myIntArray.length - 1]);
	}
}