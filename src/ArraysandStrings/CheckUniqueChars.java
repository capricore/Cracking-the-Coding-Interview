package ArraysandStrings;

import java.util.Scanner;

public class CheckUniqueChars {
	private static Scanner scanner;

	boolean checkUniqueChars(String string){
		int check = 0;
		for (int i = 0; i < string.length(); i++) {
			int c = string.charAt(i) - 'a';
			if ((check & (1 << c)) > 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String string = scanner.next();
		System.err.println(new CheckUniqueChars().checkUniqueChars(string));
	}
}
