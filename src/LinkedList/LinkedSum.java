package LinkedList;

import java.util.Stack;

public class LinkedSum {
	Node linkedSum(Node n1, Node n2){
		Stack<Integer> s1 = new Stack<>();
		Node head = new Node(0);
		boolean carryBit = false;
		while (n1 != null) {
			s1.add(n1.data);
			n1 = n1.next;
		}
		Stack<Integer> s2 = new Stack<>();
		while (n2 != null) {
			s2.add(n2.data);
			n2 = n2.next;
		}
		int temp = 0;
		Stack<Integer> result = new Stack<>();
		while (!s1.isEmpty() && !s2.isEmpty()) {
			if (carryBit) {
				if (s1.peek() + s2.peek() + 1 >= 10) {
					carryBit = true;
					temp = s1.pop() + s2.pop() - 10 + 1;
					result.add(temp);
				}else {
					carryBit = false;
					temp = s1.pop() + s2.pop() + 1;
					result.add(temp);
				}
			}else {
				if (s1.peek() + s2.peek() >= 10) {
					carryBit = true;
					temp = s1.pop() + s2.pop() - 10;
					result.add(temp);
				}else {
					carryBit = false;
					temp = s1.pop() + s2.pop();
					result.add(temp);
				}
			}
		}
		
		if (s1.isEmpty()) {
			while (!s2.isEmpty()) {
				if (carryBit) {
					if (s2.peek()+1 >= 10) {
						result.add(s2.pop()+1);
					}else {
						carryBit = false;
						result.add(s2.pop());
					}
				}
			}
		}
		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				if (carryBit) {
					if (s1.peek()+1 >= 10) {
						result.add(s1.pop()+1);
					}else {
						carryBit = false;
						result.add(s1.pop());
					}
				}
			}
		}
		while (!result.isEmpty()) {
			head.appendToTail(result.pop());
		}
		return head.next;
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(6);
		n1.appendToTail(1);
		n1.appendToTail(7);
		Node n2 = new Node(2);
		n2.appendToTail(9);
		n2.appendToTail(5);
		LinkedSum linkedSum = new LinkedSum();
		Node head = linkedSum.linkedSum(n1, n2);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
