package avlTree;

public class Test {
	public static void main(String[] args) {
		AVL tree = new AVL();
		tree.levelOrder(tree.root);
		
		tree.insert2(25);
		tree.insert2(40);
		tree.insert2(30);
		tree.insert2(10);
		tree.insert2(20);
		tree.insert2(50);
		
		tree.preOrder(tree.root);
	}
}
