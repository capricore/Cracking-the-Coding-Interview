package DynamicProgramming;

import java.util.ArrayList;

public class Subsets {
	
	static ArrayList<ArrayList<Integer>> dp( ArrayList<Integer> path,int[] n, int index){
		ArrayList<ArrayList<Integer>> result ; 
		if (index == n.length) {
			result = new ArrayList<>();
			result.add(new ArrayList<Integer>());
		}else {
			result = dp(path, n, index+1);
			ArrayList<ArrayList<Integer>> moresubSets = new ArrayList<>();
			for (ArrayList<Integer> arrayList : result) {
				ArrayList<Integer> newsubsets = new ArrayList<>();
				newsubsets.addAll(arrayList);
				newsubsets.add(n[index]);
				moresubSets.add(newsubsets);
			}
			result.addAll(moresubSets);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] n = {1,2,3};
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> path = new ArrayList<>();
		result = dp(path, n , 0);
		for (ArrayList<Integer> arrayList : result) {
			System.out.println(arrayList);
		}
	}
}
