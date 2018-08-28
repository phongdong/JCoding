package com.practice.lcode;

public class Merge2SortedLinkedList {
	
	
		static Node head1, head2;
		static class Node {
			int data;
			 Node next;
			 Node (int d) {
				data = d;
				next = null;
			}
		}
		void printList(Node node) {
			while (node != null) {
				System.out.print(node.data+"->");
				node = node.next;
			}
			System.out.println("NULL");
		}
		
		Node merge2SortedLinkedList(Node first, Node second) 
		{
			Node res = null;
			while (first != null && second != null) {
				if (first.data <= second.data) {
					Node tmp = first.next;
					first.next = res;
					res = first;
					first = tmp;
					
				} else {
					Node tmp = second.next;
					second.next = res;
					res = second;
					second = tmp;
				}
			}
			while (first != null) {
				Node tmp = first.next;
				first.next = res;
				res = first;
				first = tmp;
			}
			
			while (second != null) {
				Node tmp = second.next;
				second.next = res;
				res = second;
				second = tmp;
			}
			return res;
		}
		
		Node merger2SortedLL(Node node1, Node node2) {
			if (node1 == null) return node2;
			if (node2 == null ) return node1;
			if (node1.data <= node2.data) {
				node1.next = merger2SortedLL(node1.next, node2);
				return node1;
			} else {
				node2.next = merger2SortedLL(node1, node2.next);
				return node2;
			}
		}
		
		
		
		
		
		
		 Node mergeLinkLists(Node list1, Node list2) {
			if (list1 == null) return list2;
			if (list2 == null) return list1;	
			if (list1.data <= list2.data) {
				list1.next = mergeLinkLists(list1.next, list2);
				return list1;
			} else {
				list2.next = mergeLinkLists(list2.next, list1);
				return list2;
			}
		}
		 
	static int binarySearch(int[] nums, int x, int l, int r) throws Exception{
		
		while (l <= r) {
			int mid = (l + r) / 2;
			if (nums[mid] == x) return mid;
			else if (nums[mid] < x) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		throw new Exception("there is no match");
	}

	
	
	public static void main(String[] args) {
		int[] nums = {1, 5, 8, 9, 11, 13, 15, 19, 21};
		try {
			System.out.println(binarySearch(nums,22, 0, 8));
		} catch (Exception e) {
			System.out.println("Exception message: " + e);
		}
		
		Merge2SortedLinkedList list = new Merge2SortedLinkedList();
	        Node result = null;
	 
	        /*Let us create two sorted linked lists to test
	         the above functions. Created lists shall be
	         a: 5->10->15
	         b: 2->3->20*/
	        list.head1 = new Node(5);
	        list.head1.next = new Node(10);
	        list.head1.next.next = new Node(15);
	 
	        list.head2 = new Node(2);
	        list.head2.next = new Node(3);
	        list.head2.next.next = new Node(20);
	 
	        System.out.println("List a before merge :");
	        list.printList(head1);
	        System.out.println("");
	        System.out.println("List b before merge :");
	        list.printList(head2);
	 
	        // merge two sorted linkedlist in decreasing order
	        result = list.merger2SortedLL(head1, head2);
	        System.out.println("");
	        System.out.println("Merged linked list : ");
	        list.printList(result);
	        

	}

}
