package LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class IsPalindrome {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		Node head = new Node(0);
		for (int i = 0; i < n; i++) {
			head.appendToTail(cin.nextInt());
		}
		Node fast = head.next;
		Node slow = head.next;
		Stack<Integer> stack = new Stack<>();
		while (fast != null && fast.next != null) {
			stack.push(slow.data);
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast != null) {
			slow = slow.next;
		}
		while(slow != null){
			if (stack.pop() != slow.data) {
				System.out.println("NO");
				break;
			}else {
				slow = slow.next;
			}
		}
		if (slow == null) {
			System.out.println("YES");
		}
		cin.close();
	}
}
