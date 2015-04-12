package ArraysandStrings;

import java.util.Arrays;

public class ImageRotate {
	void imageRotate(int[][] matrix) {
		int n = matrix.length;
		int start = 0, end = n - 1;
		for (int j = 0; j < n/2; j++) {
			for (int i = 0; i < end-start; i++) {
				int temp = matrix[start][start+i];
				matrix[start][start+i] = matrix[end-i][start];
				matrix[end-i][start] = matrix[end][end-i];
				matrix[end][end-i] = matrix[start+i][end];
				matrix[start+i][end] = temp;
			}
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		new ImageRotate().imageRotate(matrix);
		for (int[] is : matrix) {
			System.out.println(Arrays.toString(is));
		}
	}
}
