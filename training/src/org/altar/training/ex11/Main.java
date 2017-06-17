package org.altar.training.ex11;

public class Main {

	public static void main(String[] args) {
		String pal = "12345678987654321";
		
		long init = System.nanoTime();
		System.out.println(isPalyndrome2(pal));
		long end = System.nanoTime();
		System.out.println("Execution time " + (end - init)/1000 + "ms");
		
		init = System.nanoTime();
		System.out.println(isPalyndrome(pal));
		end = System.nanoTime();
		System.out.println("Execution time " + (end - init)/1000 + "ms");
	}
	
	private static boolean isPalyndrome(String str){
		//if pair there is no middle char, else middle char is always the same
		for(int i = 0; i < str.length() / 2; i++){
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
				return false;
			}	
		}
		return true;
	}
	
	private static boolean isPalyndrome2(String str){
		StringBuilder strBuilder = new StringBuilder(str);
		
		return strBuilder.reverse().toString().equals(str);
	}
}
