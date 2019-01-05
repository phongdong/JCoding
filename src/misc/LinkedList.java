package misc;

import java.util.HashSet;


public class LinkedList {
	static Node head;
	
	static class Node {
		int data;
		Node next;
		boolean visited = false;
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	static boolean isLoop() {
		Node slow = head;
		Node fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}
	
	static void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	static boolean detectLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		while (h != null) {
			if(s.contains(h)) {
				return true;
			}
			s.add(h);
			h = h.next;
		}
		return false;
	}
	static boolean detectLoop3(Node h) {
		while (h != null) {
			if (h.visited) return true;
			h.visited = true;
			h = h.next;
		}
		return false;
	}
	
	static boolean detectLoop2() {
		Node slow_p = head;
		Node fast_p = head;
		while (slow_p != null && fast_p != null && fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if (slow_p == fast_p)
				return true;
		}
		return false;
	}
	
	static void printList(Node node) {
		while (node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);

		// Creating a loop for testing
		head.next.next.next.next.next = head.next.next;
		// list.detectAndRemoveLoop(head);
		// System.out.println("Linked List after removing loop : ");
		list.printList(head);
	}
}
