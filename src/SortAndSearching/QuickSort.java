package SortAndSearching;

import java.util.Arrays;

public class QuickSort {
	static void quicksort(int[] array, int left, int right){
		int index = partition2(array, left, right);
		if (left < index-1) {
			quicksort(array, left, index-1);
		}
		if (index < right) {
			quicksort(array, index, right);
		}
	}
	
	static int partition(int[] array, int left, int right){
		int pivot = array[(left+right)>>1];
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}
			while (array[right] > pivot) {
				right--;
			}
			if (left <= right) {
				swap(array,left,right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	static int partition2(int[] array, int left, int right){
		int pivot = array[right];
		int i = -1, j = 0;
		for (int k2 = j; k2 < right; k2++) {
			if (array[k2] < pivot) {
				i++;
				swap(array, i, k2);
			}
		}
		swap(array, ++i, right);
		return i;
	}
	
	static void swap(int[] array, int x, int y){
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	} 

	public static void main(String[] args) {
		int[] array = {4,2,1,3,8,6,7};
		quicksort(array, 0, 6);
		System.out.println(Arrays.toString(array));
	}
}
