package com.practice.lcode;


public class RotateList {
	ListNode head;
	static class ListNode {
		ListNode next;
		int data;
		ListNode(int d) {
			data = d;
			next = null;
		}
	}
	
	 void printList(ListNode node) {
		while (node != null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.print("NULL\n");
	}
	
	ListNode rotateList(ListNode head, int k) {
		return head;
		
	}
	
	

	public static void main(String[] args) {
		RotateList list = new RotateList();
		list.head = new ListNode(1);
		list.head.next = new ListNode(2);
		list.head.next.next = new ListNode(3);
		list.head.next.next.next = new ListNode(4);
		list.head.next.next.next.next = new ListNode(5);
		
		list.printList(list.head);
		
		list.printList(list.rotateList(list.head, 2));
		
	}

}
