package ArraysandStrings;

import java.util.HashMap;
import java.util.Scanner;

public class IsPermutation {
	private static Scanner scanner;

	boolean isPermutation(String a, String b){
		int n = a.length(), m = b.length();
		if (n != m) {
			return false;
		}
		HashMap<Character, Integer> toFind = new HashMap<>();
		for (int i = 0; i < m; i++) {
			char c = b.charAt(i);
			if (toFind.containsKey(c)) {
				toFind.put(c, toFind.get(c)+1);
			}else {
				toFind.put(c, 1);
			}
		}
		int count = 0;
		HashMap<Character, Integer> hasFind = new HashMap<>();
		for (int i = 0; i < n; i++) {
			char c = a.charAt(i);
			if (!toFind.containsKey(c)) {
				return false;
			}
			if (hasFind.containsKey(c)) {
				if (hasFind.get(c) < toFind.get(c)) {
					count++;
					hasFind.put(c, hasFind.get(c)+1);
				}
				else {
					return false;
				}
			}else {
				hasFind.put(c, 1);
				count++;
			}
		}
		return count == n;
	}
	
	public static void main(String[] args) {
		String a = null, b = null;
		scanner = new Scanner(System.in);
		a = scanner.next();
		b = scanner.next();
		System.out.println(new IsPermutation().isPermutation(a, b));
	}
}
