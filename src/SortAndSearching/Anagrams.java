package SortAndSearching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Anagrams {
	static String sortString(String s){
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return c.toString();
	}
	
	static void anagram(String[] list){
		HashMap<String, LinkedList<String>> map = new HashMap<>();
		for (String string : list) {
			String s = sortString(string);
			if (!map.containsKey(s)) {
				map.put(s, new LinkedList<String>());
			}
			LinkedList<String> linkedList = map.get(s);
			linkedList.add(string);
		}
		int index = 0;
		for (String string : map.keySet()) {
			LinkedList<String> list2 = map.get(string);
			for (String string2 : list2) {
				list[index] = string2;
				index++;
			}
		}
	}

}
