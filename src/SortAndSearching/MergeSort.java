package SortAndSearching;

import java.util.Arrays;

public class MergeSort {
	static void mergesort(int[] array){
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length-1);
	}
	
	static void mergesort(int[] array, int[] helper, int low, int high){
		if (low < high) {
			int middle = (low+high)/2;
			mergesort(array, helper, low, middle);
			mergesort(array, helper, middle+1, high);
			merge(array, helper, low, middle, high);
		}
		
	}
	
	static void merge(int[] array, int[] helper, int low, int middle, int high){
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		int current = low;
		int left = low;
		int right = middle+1;
		while (left <= middle && right <= high) {
			if (helper[left] < helper[right]) {
				array[current++] = helper[left++];
			}else {
				array[current++] = helper[right++];
			}
		}
		if (left <= middle) {
			for (int i = left; i < middle+1; i++) {
				array[current++] = helper[i];
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {5,2,4,6,1,8,3};
		mergesort(array);
		System.out.println(Arrays.toString(array));
	}

}
