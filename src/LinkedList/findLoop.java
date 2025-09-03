package LinkedList;

public class findLoop {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = head.next;
		System.out.println(loopFind(head));

	}
	
	public static boolean loopFind(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}
}
