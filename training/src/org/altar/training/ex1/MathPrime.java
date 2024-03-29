package org.altar.training.ex1;

import java.util.ArrayList;
import java.util.List;

public class MathPrime {
	public static void main(String[] args) {
		List<Integer> primes = getPrimes(1, 5000);
		for(Integer prime : primes){
			System.out.println("This is a prime number " + prime);
		}
	}

	private static List<Integer> getPrimes(int min, int max){
		List <Integer> list = new ArrayList<>();

		for(int i = min; i <= max; i++){
			if(isPrime(i)){
				list.add(i);
			}
		}
		return list;
	}
	
	public static boolean isPrime(int num) {
	    for (int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
