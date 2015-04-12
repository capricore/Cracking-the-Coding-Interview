package ArraysandStrings;

import java.util.Arrays;

public class SetZero {
	void setZero(int[][] matrix){
		int n = matrix.length;
		int m = matrix[0].length;
		boolean row_has_zero = false, column_has_zero = false;
		for (int i = 0; i < n; i++) {
			if (matrix[i][0] == 0) {
				row_has_zero = true;
				break;
			}
		}
		
		for (int i = 0; i < m; i++) {
			if (matrix[0][i] == 0) {
				column_has_zero = true;
				break;
			}
		}

		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		if (row_has_zero) {
			for (int i = 0; i < n; i++) {
				matrix[i][0] = 0;
			}
		}
		if (column_has_zero) {
			for (int i = 0; i < m; i++) {
				matrix[0][i] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,0,1},{1,1,0},{1,1,1}};
		new SetZero().setZero(matrix);
		for (int[] is : matrix) {
			System.out.println(Arrays.toString(is));
		}
	}
}
