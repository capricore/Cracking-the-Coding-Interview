package DynamicProgramming;

import java.util.Scanner;

public class StairCase {
	
	static int stairCase(int[] num, int n){
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (num[n] != 0) {
			return num[n];
		}
		num[n] = stairCase(num, n-1) + stairCase(num, n-2) + stairCase(num, n-3);
		return num[n];
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int[] num = new int[n+1];
		System.out.println(stairCase(num, n));
		cin.close();
	}
}
