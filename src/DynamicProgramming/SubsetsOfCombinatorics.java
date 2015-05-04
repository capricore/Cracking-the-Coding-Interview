package DynamicProgramming;

import java.util.ArrayList;

public class SubsetsOfCombinatorics {
	
	static ArrayList<Integer> convertIntToSet(int n, ArrayList<Integer> set){
		int index = 0;
		ArrayList<Integer> subset = new ArrayList<>();
		for (int i = n; i > 0; i >>= 1) {
			if ((i & 1) == 1) {
				subset.add(set.get(index));
			}
			index++;
		}
		return subset;
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> set = new ArrayList<>();
		set.add(1);
		set.add(2);
		set.add(3);
		int max = 1 << set.size();
		for (int i = 0; i < max; i++) {
			ArrayList<Integer> subset = convertIntToSet(i,set);
			result.add(subset);
		}
		for (ArrayList<Integer> arrayList : result) {
			System.out.println(arrayList);
		}
	}

}
