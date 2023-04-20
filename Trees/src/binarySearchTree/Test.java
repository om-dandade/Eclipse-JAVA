package binarySearchTree;

public class Test {
	 public static void main(String[] args) {
		 BinarySearchTree Bst = new BinarySearchTree();
		 
		 Bst.insert(70);
		 Bst.insert(60);
		 Bst.insert(7);
		 Bst.insert(50);
		 Bst.insert(90);
		 Bst.insert(95);
		 
		 Bst.preOrder(Bst.root);
		 Bst.deleteNode(Bst.root, 7);
		 Bst.preOrder(Bst.root);
		 Bst.search(Bst.root, 7);
	}
}