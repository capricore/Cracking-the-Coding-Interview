package SortAndSearching;

import java.util.Arrays;

public class MergeArray {
	static void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA = lastA-1;
		int indexB = lastB-1;
		int indexMerge = lastA+lastB-1;
		while (indexB >= 0) {
			if (indexA >= 0 && a[indexA] > b[indexB]) {
				a[indexMerge] = a[indexA];
				indexA--;
			}else {
				a[indexMerge] = b[indexB];
				indexB--;
			}
			indexMerge--;
		}
	}
	public static void main(String[] args) {
		int[] a = {1,4,6,0,0,0}, b = {2,5,7};
		merge(a, b,3,3);
		System.out.println(Arrays.toString(a));
	}

}
