package MathmaticsAndProbability;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class KthOfPrimeFactor {
	static long findKth(int k){
		LinkedList<Long> list3 = new LinkedList<>();
		list3.add((long) 3);
		LinkedList<Long> list5 = new LinkedList<>();
		list5.add((long) 5);
		LinkedList<Long> list7 = new LinkedList<>();
		list7.add((long) 7);
		Comparator<LinkedList<Long>> comparator = new Comparator<LinkedList<Long>>() {
			public int compare(LinkedList<Long> l1, LinkedList<Long> l2) {
				if (l1.get(0) < l2.get(0)) {
					return -1;
				}else {
					return 1;
				}
			}
		};
		PriorityQueue<LinkedList<Long>>	heap = new PriorityQueue<>(3,comparator);
		heap.add(list3);
		heap.add(list5);
		heap.add(list7);
		int count = 1;
		long result = 1;
		for (int i = 0; i < k; i++) {
			LinkedList<Long> temp = heap.poll();
			count ++;
			if (count == k) {
				result = temp.get(0);
				break;
			}
			if (temp.get(0) == list3.get(0)) {
				list3.add(list3.get(0)*3);
				list5.add(list3.get(0)*5);
				list7.add(list3.get(0)*7);
				list3.poll();
				heap.add(list3);
			}else if(temp.get(0) == list5.get(0)){
				list5.add(list5.get(0)*5);
				list7.add(list5.get(0)*7);
				list5.poll();
				heap.add(list5);
			}else {
				list7.add(list7.get(0)*7);
				list7.poll();
				heap.add(list7);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(findKth(6));
	}
}
