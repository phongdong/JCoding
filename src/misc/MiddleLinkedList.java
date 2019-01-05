package misc;

public class MiddleLinkedList {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}
		
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
		
	void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.println("NULL");
	}
	
	void printMiddle() {
		Node slow_p = head;
		Node fast_p = head;
		if (head != null) {
			while (fast_p != null && fast_p.next != null) {
				slow_p = slow_p.next;
				fast_p = fast_p.next.next;
			}
			System.out.println("the middle element is: " + slow_p.data );
		}
	}
	
	void detectLoop() {
		Node slow_node = head;
		Node fast_node = head;
		while (slow_node != null && fast_node != null && fast_node.next != null) {
			slow_node = slow_node.next;
			fast_node = fast_node.next.next;
			if (slow_node.data == fast_node.data) {
				System.out.println("Loop happens at: " + slow_node.data);
				return;
			}
		}
		System.out.println("no loop detected.");
	}
	
	void detectLoop2() {
		
	}
	
	public static void main(String[] args) {
//		misc.MiddleLinkedList ll = new misc.MiddleLinkedList();
//		for (int i = 5; i > 0; --i) {
//			ll.push(i);
//			ll.printList();
//			ll.printMiddle();
//		}
		
		MiddleLinkedList ll2 = new MiddleLinkedList();
		ll2.head = new Node(50);
		ll2.head.next = new Node(40);
		ll2.head.next.next = new Node(30);
		ll2.head.next.next.next = new Node(20);
		ll2.head.next.next.next.next = new Node(10);
		ll2.printList();
		
		head.next.next.next.next.next = head.next.next;
		ll2.detectLoop();
		
		
	}
}
