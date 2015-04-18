package LinkedList;

public class LinkedListPartition {
	void linkedListPartition(Node head, int x){
		Node i = head;
		Node j = null;
		while (i != null) {
			if (i.data < x) {
				if (j == null) {
					j = head;
				}else {
					j = j.next;
				}
				int temp = i.data;
				i.data = j.data;
				j.data = temp;
			}
			 i = i.next;
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node(4);
		head.next = new Node(2);
		head.next.next = new Node(1);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(1);
		new LinkedListPartition().linkedListPartition(head, 2);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
