package com.practice.lcode;

class Node {
	int data;
	Node left, right;
	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BST {
	Node root;
	Node previous;
	
	boolean isBST() {
		previous = null;
		return isBST(root); 
	}
	
	boolean isBST(Node node) {
		if (node != null) {
			if (!isBST(node.left))
				return false;
			if(previous != null && node.data <= previous.data)
				return false;
			previous = node;
			return isBST(node.right);
		}
		return true;
	}
	
	public static void main(String[] args) {
		BST tree = new BST();
		 tree.root = new Node(4);
	        tree.root.left = new Node(2);
//	        tree.root.right = new Node(5);
//	        tree.root.left.left = new Node(1);
//	        tree.root.left.right = new Node(3);
	 
	        if (tree.isBST())
	            System.out.println("IS BST");
	        else
	            System.out.println("Not a BST");
	}
}





//class Node {
//	int data;
//	Node left, right = null;
//	Node(int d) {
//		data = d;
//	}
//}
//
//public class BST {
//	
//	Node root;
//	
//	boolean isBalanced(Node node) {
//		int lh;
//		int rh;
//		if (node == null) return true;
//		lh = height(node.left);
//		rh = height(node.right);
//		
//		if ((Math.abs(lh - rh) <= 1) 
//				&& isBalanced(node.left)
//				&& isBalanced(node.right)
//			) 
//			return true;
//		return false;
//	}
//	
//	int height(Node node) {
//		if (node == null)
//			return 0;
//		return 1 + Math.max(height(node.left), height(node.right));
//	}
//
//	public static void main(String[] args) {
//		BST tree = new BST();
//		tree.root = new Node(1);
//		tree.root.left = new Node(2);
//		tree.root.right = new Node(3);
//		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(5);
//		tree.root.right.left = new Node(8);
//		
//		System.out.println(tree.isBalanced(tree.root));
//
//	}
//
//}

//class Node {
//	int key;
//	Node left, right;
//	Node (int item) {
//		key = item;
//		left = right = null;
//	}
//}
//
//public class BST {
//	Node root;
//	BST() {
//		root = null;
//	}
//	
//	void insert(int key) {
//		root = insertRec(root, key);
//	}
//	
//	Node search(Node root, int key) {
//		if (root == null || root.key == key) return root;
//		if (root.key > key) {
//			return search(root.left, key);
//		}
//		return search(root.right, key);
//	}
//	
//	Node insertRec(Node root, int key) {
//		if (root == null) {
//			root = new Node(key);
//			return root;
//		}
//		if (key < root.key) {
//			root.left = insertRec(root.left, key);
//		} else if (key > root.key) {
//			root.right = insertRec(root.right, key);
//		}
//		return root;
//	}
//	
//	void printInOrder(Node node) {
//		if (node != null) {
//			printInOrder(node.left);
//			System.out.print(node.key+" ");
//			printInOrder(node.right);
//		}
//	}
//	
//	public static void main(String[] args) {
//		BST tree = new BST();
//		tree.insert(50);
//		tree.insert(30);
//		tree.insert(20);
//		tree.insert(40);
//		tree.insert(70);
//		tree.insert(60);
//		tree.insert(80);
//		
//		tree.printInOrder(tree.root);
//		System.out.println(tree.search(tree.root, 60).key);
//	}
//}
