package LinkedList;

public class StartOfLoop {
	public static void main(String[] args) {
		Node head = new Node(0);
		head.appendToTail(1);
		Node res = new Node(2);
		head.appendToTail(res);
		head.appendToTail(3);
		head.appendToTail(4);
		head.appendToTail(5);
		head.appendToTail(res);
		Node fast = head.next.next;
		Node slow = head.next;
		boolean flag = false;
		while (fast.next != null && fast.next.next != null) {
			if (fast.equals(slow)) {
				flag = true;
				break;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		if (flag) {
			slow = head;
			while (true) {
				if (slow.equals(fast)) {
					System.out.println(slow.data);
					break;
				}
				slow = slow.next;
				fast = fast.next;
			}
		}
		
	}
}
