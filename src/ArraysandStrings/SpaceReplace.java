package ArraysandStrings;

import java.util.Scanner;

public class SpaceReplace {
	private static Scanner scanner;

	String spaceReplace(char[] s, int n){
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < n; i++) {
			if (s[i] == ' ') {
				stringBuffer.append("%20");
			}else {
				stringBuffer.append(s[i]);
			}
		}
		return stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		char[] s = string.toCharArray();
		int n = scanner.nextInt();
		System.out.println(new SpaceReplace().spaceReplace(s, n));
	}
}	
