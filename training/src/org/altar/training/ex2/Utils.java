package org.altar.training.ex2;

public class Utils {
	public static void sortArray(int [] intArr, OrderEnum order){
		// Not the best way to check for null, use Optional instead
		if(order != null && order == OrderEnum.ASCENDING){
			System.out.println("ASC");
		} else { // Defaults to DESCENDING
			System.out.println("DESC");
		}
	}
}
