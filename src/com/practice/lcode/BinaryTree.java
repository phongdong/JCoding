package com.practice.lcode;



public class BinaryTree {
	static class Node {
		int key;
		Node left, right;
		Node(int d) {
			key = d;
			left = null;
			right = null;
		}
	}
	Node root;
	BinaryTree() {
		root = null;
	}
	void inOrder(Node node) {
		if (node == null) return;
		inOrder(node.left);
		System.out.print(node.key+" ");
		inOrder(node.right);
	}
	void postOrder(Node node) {
		if(node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.key+" ");
	}
	void preOrder(Node node) {
		if (node == null) return;
		System.out.print(node.key+" ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("Preorder traversal of binary tree is ");
        tree.preOrder(tree.root);
 
        System.out.println("\nInorder traversal of binary tree is ");
        tree.inOrder(tree.root);
 
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postOrder(tree.root);

	}

}
