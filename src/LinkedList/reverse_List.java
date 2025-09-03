package LinkedList;

public class reverse_List {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head = reverse_list(head);
		Add_operations.printList(head);
	}

	public static Node reverse_list(Node head) {
		Node cur = head;
		Node prev = null;
		Node nextNode = null;
		
		while(cur != null) {
			nextNode = cur.next;
			cur.next = prev;
			prev = cur;
			cur = nextNode;
		}
		return prev;
	}
}