/*
 *  Check whether the given binary tree is a mirror image
 */

class Node {
	
	int key;
	Node left, right;
	Node(int item) {
		key = item;
	}
}

public class MirrorImage {
	Node root;
	
	boolean isMirror(Node node1, Node node2) {
		if (node1 == null && node2 == null)
			return true;
		if (node1 != null && node2 != null && node1.key == node2.key) {
			return (isMirror(node1.left, node2.right) 
					&& isMirror(node1.right, node2.left));
		}
		return false;
	}
	
	boolean isSymmetric(Node node) {
		return isMirror(root, root);
	}
}


