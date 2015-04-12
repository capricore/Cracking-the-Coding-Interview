package ArraysandStrings;

import java.util.Scanner;

public class Reverse {
	String reverse(String string){
		int n = string.length();
		char[] c = string.toCharArray();
		for (int i = 0; i <= n/2; i++) {
			char temp = c[i];
			c[i] = c[n-1-i];
			c[n-1-i] = temp;
		}
		return new String(c);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		System.out.println(new Reverse().reverse(string));
	}
}
