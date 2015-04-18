package LinkedList;


class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
	void appendToTail(int data){
		Node end = new Node(data);
		Node n = this;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
}

public class KthToLast {
	Node kthToLast(Node head, int k){
		Node slow = head;
		Node fast = head;
		for (int i = 0; i < k-1; i++) {
			fast = fast.next;
		}
		
		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		System.out.println(new KthToLast().kthToLast(head, 1).data);
	}
}
