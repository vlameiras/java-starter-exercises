package org.altar.training.ex6;

public class WordCapitalizer {
	public static void main(String[] args) {
		String words = "Welcome to the jungle";
		System.out.println(wordCapitalizer(words));
	}
	
	private static String wordCapitalizer(String input){
		String[] arr = input.split(" ");
		StringBuilder strBuilder = new StringBuilder("");
		
		for(int i = 0; i< arr.length; i++){
			String str = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
			strBuilder.append(str).append(" ");
		}
		
		return strBuilder.toString().trim();
	}
}

