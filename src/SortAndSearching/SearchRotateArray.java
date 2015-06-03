package SortAndSearching;

public class SearchRotateArray {
	static int search(int[] array,int left, int right, int x){
		int middle = (left + right) >> 1;
		if (array[middle] == x) {
			return middle;
		}
		if (right < left) {
			return -1;
		}
		if (array[left] < array[middle] ) {
			if (x >= array[left] && x <= array[right] ) {
				return search(array, left, middle-1, x);
			}else {
				return search(array, middle+1, right, x);
			}
		}else if (array[middle] < array[left]) {
			if (x >= array[middle] && x <= array[right]) {
				return search(array, middle+1, right, x);
			}else {
				return search(array, left, middle-1, x);
			}
		}else if(array[middle] == array[left]){
			if (array[middle] != array[right]) {
				return search(array, middle+1, right, x);
			}else {
				int result = search(array, left, middle-1, x);
				if (result == -1) {
					return search(array, middle+1, right, x);
				}else {
					return result;
				}
			}
		}
		return -1;
	}
}
