package misc;

public class MirrorImageDemo {
	 public static void main(String args[]) 
	    {
	       MirrorImage tree = new MirrorImage();
	       tree.root = new Node(1);
	       tree.root.left = new Node(2);
	       tree.root.right = new Node(2);
	       tree.root.left.left = new Node(3);
	       tree.root.left.right = new Node(4);
	       tree.root.right.left = new Node(4);
	       tree.root.right.right = new Node(5);
	       boolean output = tree.isSymmetric(tree.root);
	       String message = output == true ? "1" : "0";
	       System.out.println(message);
	    }
}
