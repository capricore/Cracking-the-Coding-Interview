package LinkedList;

public class DeleteMiddle {
	void deleteMiddle(Node n){
		Node temp = n;
		while (temp.next != null) {
			temp.data = temp.next.data;
			if (temp.next.next == null) {
				temp.next = null;
				break;
			}
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		Node n = head.next;
		head.next.next = new Node(3);
		new DeleteMiddle().deleteMiddle(n);
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
}
