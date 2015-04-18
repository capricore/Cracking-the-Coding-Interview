package LinkedList;

import java.util.LinkedList;

public class RemoveDuplicate {
	LinkedList<Integer> removeDuplicate(LinkedList<Integer> l){
		LinkedList<Integer> result = new LinkedList<>();
		for (int i = 0; i < l.size(); i++) {
			if (result.contains(l.get(i))) {
				continue;
			}else {
				result.add(l.get(i));
			}
		}
		return result;
	}
	
	public static void main(String[] args) {

		LinkedList<Integer>	 linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(2);
		linkedList.add(3);
		System.out.println(new RemoveDuplicate().removeDuplicate(linkedList));
	}
}
