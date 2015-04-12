package ArraysandStrings;

import java.util.Scanner;

public class Compression {
	String compression(String s){
		int original = s.length();
		if (original == 0 || s == null) {
			return null;
		}
		StringBuffer sb = new StringBuffer();
		int count = 1;
		char c = s.charAt(0);
		sb.append(c);
		for (int i = 1; i < original; i++) {
			if (s.charAt(i) == c) {
				count++;
			}else {
				sb.append(count);
				count = 1;
				c = s.charAt(i);
				sb.append(c);
			}
		}
		sb.append(count);
		if (sb.length() >= original) {
			return s;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		System.out.println(new Compression().compression(string));
	}
}
