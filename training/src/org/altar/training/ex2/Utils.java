package org.altar.training.ex2;

import java.util.Arrays;

public class Utils {
	public static void sortArray(int[] intArr, OrderEnum order) {
		// Not the best way to check for null, use Optional instead
		// Change to always Arrays.sort and only have if for DESCENDING
		if (order != null && order == OrderEnum.ASCENDING) {
			Arrays.sort(intArr);
		} else { // Defaults to DESCENDING
			// Arrays.sort(intArr, Collections.reverseOrder());
			// Only for Collections
			Arrays.sort(intArr);
			for (int i = 0; i < intArr.length / 2; i++) {
				int temp = intArr[i];
				intArr[i] = intArr[intArr.length - i - 1];
				intArr[intArr.length - i - 1] = temp;
			}
		}
	}
}
