package com.practice1;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int key;
	Node left;
	Node right;
	Node(int val) {
		key = val;
	}
}

public class BinaryTree {
	Node root;
	
	public Node invertTree(Node root) {
		if (root == null)
			return null;
		Node right = invertTree(root.right);
		Node left = invertTree(root.left);
		root.left = right;
		root.right = left;
		return root;
	}
	
	public void inorder() {
		inorderRec(root);
	}
	
	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}
	
	public Node invertTree2(Node root) {
		if (root == null) return null;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node current = queue.poll();
			Node tmp = current.left;
			current.left = current.right;
			current.right = tmp;
			
			if (current.left != null) queue.add(current.left);
			if (current.right != null) queue.add(current.right);
		}
		return root;
	}

	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		bst.root = new Node(8);
		bst.root.left = new Node(3);
		bst.root.right = new Node(10);
		
		bst.root.left.left = new Node(1);
		bst.root.left.right = new Node(6);
		
		bst.root.right.right = new Node(14);
		
		bst.root.left.right.left = new Node(4);
		bst.root.left.right.right = new Node(7);
		
		bst.root.right.right.left = new Node(13);
		
		bst.inorder();
		System.out.println();
		bst.invertTree(bst.root);
		bst.inorder();
	}

}
