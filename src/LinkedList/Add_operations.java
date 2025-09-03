package LinkedList;

public class Add_operations {
	public static void main(String[] args) {
		
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head = insertFront(head, 1);
		head = insertLast(head, 60);
		printList(head);
	}
	
	public static void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			if(temp.next != null)
				System.out.print(" -> ");
			temp = temp.next;
		}
	}
	
	public static Node insertFront(Node head, int x) {
		Node new_node = new Node(x);
		new_node.next = head;
		return new_node;
	}
	
	public static Node insertLast(Node head, int x) {
		Node new_node = new Node(x);
		Node temp = head;		
		while(temp.next != null) {
			temp = temp.next;
		}		
		temp.next = new_node;
		return head;
	}
}
