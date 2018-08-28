package com.bot.j8assignments;

/**
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p>
 * Input: (2 -> 4 -> 3) 
 * 		+ (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

public class J8Assignment1 {
	static Node head1, head2;
	class Node {
		int data;
		Node next;
		Node (int d) {
			data = d;
			next = null;
		}
	}
	void printList(Node node) {
		while(node != null) {
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.print("NULL");
	}
	
	void addTwoLists(Node first, Node second) {
		int sum = 0, carry = 0;
		Node prev = null;
		Node tmp = null;
		Node res = null;
		
		while (first!=null || second!=null) {
			sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);
			carry = sum >= 10 ? 1 : 0;
			sum = sum % 10;
			
			if (res == null) {
				res = new Node(sum);
			} else {
				prev.next = tmp;
			}
			prev = tmp;
			while (first != null) {
				first = first.next;
			}
			while (second != null) {
				second = second.next;
			}
		}
		if (carry > 0) {
			tmp.next = new Node(carry);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
















//public class J8Assignment1 {
//	
//	static Node head1, head2;
//	static class Node {
//		int data;
//		Node next;
//		Node (int d) {
//			this.data = d;
//			next = null;
//		}
//	}
//	
//	void printList(Node node) {
//		while(node != null) {
//			System.out.print(node.data + "->");
//			node = node.next;
//		}
//		System.out.print("NULL\n");
//	}
//	
//	static Node addList(Node ll1, Node ll2) {
//		Node res = null;
//		Node temp = null;
//		Node prev = null;
//		int sum = 0;
//		int carry = 0;
//		while (ll1 != null || ll2 != null) {
//			sum = carry + (ll1 != null ? ll1.data : 0) + (ll2 != null ? ll2.data : 0);
//			carry = (sum >= 10) ? 1 : 0;
//			sum = sum % 10;
//			
//            temp = new Node(sum);
// 
//            if (res == null) {
//                res = temp;
//            } else 
//            {
//                prev.next = temp;
//            }
// 
//            prev = temp;
// 
//            if (ll1 != null) {
//                ll1 = ll1.next;
//            }
//            if (ll2 != null) {
//            	ll2 = ll2.next;
//            }
//        }
// 
//        if (carry > 0) {
//            temp.next = new Node(carry);
//        }
// 
//        return res;
//	}
//	public static void main(String[] args) {
//		J8Assignment1 ll = new J8Assignment1();
//		ll.head1 = new Node(2);
//		ll.head1.next = new Node(4);
//		ll.head1.next.next = new Node(3);
//		ll.printList(head1);
//		
//		ll.head2 = new Node(5);
//		ll.head2.next = new Node(6);
//		ll.head2.next.next = new Node(4);
//		ll.printList(head2);
//		
//		Node rs = ll.addList(head1,head2);
//		ll.printList(rs);
//	}
//
//}
