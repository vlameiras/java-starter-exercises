package org.altar.training.ex3;

public class MathFactorial {
	public static void main(String[] args) {
		System.out.println(factorial(16));
	}
	
	private static int factorial(int num){
		if(num == 1){
			return num;
		}

		return num *= factorial(--num);
	}
}
