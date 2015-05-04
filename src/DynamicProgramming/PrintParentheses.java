package DynamicProgramming;

import java.util.ArrayList;

public class PrintParentheses {
	
	static void dfs(ArrayList<String> result, int left, int right, int count, char[] s){
		if (left < 0 || left > right) {
			return;
		}
		if (left == 0 && right == 0) {
			String string = String.copyValueOf(s);
			result.add(string);
		}else {
			if (left > 0) {
				s[count] = '(';
				dfs(result, left-1, right, count+1, s);
			}
			if (right > left) {
				s[count] = ')';
				dfs(result, left, right-1, count+1, s);
			}
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> result = new ArrayList<>();
		char[] str = new char[6];
		dfs(result, 3, 3, 0, str);
		for (String string : result) {
			System.out.println(string);
		}
	}

}
