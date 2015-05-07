package DynamicProgramming;

import java.util.ArrayList;

public class CountCent {
	
	static int makeChange(int n, int[] denoms, int index, int[][] map, ArrayList<Integer> path){
		if (map[n][index] != 0) {
			return map[n][index];
		}
		if (index >= denoms.length -1) {
			System.out.println(path);
			return 1;
		}
		int way = 0;
		int denomAmount = denoms[index];
		for (int i = 0; i * denomAmount < n; i++) {
			int amountRemaining = n - i*denomAmount;
			path.add(denomAmount);
			way += makeChange(amountRemaining, denoms, index+1, map,path);
			path.remove(path.size()-1);
		}
		map[n][index] = way;
		return way;
	}
	
	public static void main(String[] args) {
		int[] denoms = {25,10,5,1};
		int[][] map = new int[101][denoms.length];
		ArrayList<Integer> path = new ArrayList<>();
		System.out.println(makeChange(6,denoms,0,map,path));
	}
}
