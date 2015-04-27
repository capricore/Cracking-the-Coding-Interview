package DynamicProgramming;

public class PathsWithOffLimits {
	public static void main(String[] args) {
		char[][] input = {{'O','O','O'},{'O','X','O'},{'O','O','O'}};
		int n = input.length;
		int m = input[0].length;
		int[] re = new int[m];
		for(int i = 0; i < n; i++){
			re[0] = input[i][0] == 'X' ? 0 : 1;
			for(int j = 1; j < m; j++){
				if (input[i][j] != 'X') {
					re[j] +=  re[j-1] ;
				}else {
					re[j] = 0;
				}
			}
		}
		System.out.println(re[m-1]);
	}
}
