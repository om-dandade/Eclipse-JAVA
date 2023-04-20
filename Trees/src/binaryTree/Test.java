package binaryTree;

public class Test {
	public static void main(String[] args) {
		BinaryNode n1 = new BinaryNode("N1");
		BinaryNode n2 = new BinaryNode("N2");
		BinaryNode n3 = new BinaryNode("N3");
		BinaryNode n4 = new BinaryNode("N4");
		BinaryNode n5 = new BinaryNode("N5");
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		
		BinaryTree tree = new BinaryTree();
		tree.root = n1;
		
		tree.preOrderTraversal(n1);
		tree.insert("N6");
		tree.insert("N6");
		tree.preOrderTraversal(n1);
		tree.deleteDeepestNode();
		tree.preOrderTraversal(n1);
		
	}
}
