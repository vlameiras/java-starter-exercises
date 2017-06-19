package org.altar.training.ex9;

public class Main {
	public static void main(String[] args) {
		int x = 1;
		int y = 100;
		
		for(int i = x; i<= y; i++){
			System.out.printf("%s -> %s", i,fizzBuzz(i));
			System.out.println();
		}
	}
	
    public static String fizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }    
}
