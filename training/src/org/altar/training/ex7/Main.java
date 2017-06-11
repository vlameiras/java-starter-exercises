package org.altar.training.ex7;

public class Main {
	public static void main(String[] args) {
		int x = 4;
		int y = 5;
		int res = multiply(x, y);
		
		System.out.printf("%d x %d = %d", x, y, res);
	}

	public static int multiply(int a, int b) {
		int res = 0;
		while (b > 0) {
			if (b % 2 != 0) {
				res += a;
			}
			a = a << 1;
			b = b >> 1;
			System.out.println(a);
			System.out.println(b);
		}
		return res;
	}
}
