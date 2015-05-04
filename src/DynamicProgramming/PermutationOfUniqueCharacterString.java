package DynamicProgramming;

import java.util.ArrayList;

public class PermutationOfUniqueCharacterString {
	
	static void dfs(String s, int index, int n,ArrayList<String> result){
		if (index == n) {
			result.add(s);
		}
		for (int i = index; i < s.length(); i++) {
			s = swap(s,i,index);
			dfs(s, index+1, n,result);
			s = swap(s,i,index);
		}
	}
	
	static String swap(String s, int x, int y){
		StringBuffer stringBuffer = new StringBuffer(s);
		char c = stringBuffer.charAt(x);
		stringBuffer.setCharAt(x, stringBuffer.charAt(y));
		stringBuffer.setCharAt(y, c);
		return stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		String string = "abc";
		ArrayList<String> result = new ArrayList<String>();
		dfs(string, 0, 3, result);
		for (String string2 : result) {
			System.out.println(string2);
		}
	}

}
