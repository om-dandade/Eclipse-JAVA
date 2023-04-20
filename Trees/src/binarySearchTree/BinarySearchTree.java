package binarySearchTree;

public class BinarySearchTree {
	BinaryNode root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	private BinaryNode insert(BinaryNode node, int value) {
		if(node == null) {
			BinaryNode newnode = new BinaryNode();
			newnode.value = value;
			System.out.println("Node inserted Sucsefully");
			return newnode;
		}
		if(value <= node.value) {
			node.left = insert(node.left, value);
			return node;
		}
		node.right = insert(node.right, value);
		return node;
	}
	
	public void insert(int value) {
		root = insert(root, value);
	}
	
	public void preOrder(BinaryNode root) {
		if(root == null)return;
		
		System.out.print(root.value + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public BinaryNode search(BinaryNode root, int key) {
		if(root == null) {
			System.out.println("Key not found in binary tree");
			return null;
		}
		if(root.value == key) {
			System.out.println("Key found");
			return root;
		}
		if(key < root.value) {
			return search(root.left, key);
		}
		return search(root.right, key);
	}
	
	public BinaryNode deleteNode(BinaryNode root, int value) {
	    if (root == null) {
	      System.out.println("Value not found in BST");
	      return null;
	    }
	    if (value < root.value) {
	      root.left = deleteNode(root.left, value);
	    } else if (value > root.value) {
	      root.right = deleteNode(root.right, value);
	    } else {
	      if (root.left != null && root.right != null) {
	        BinaryNode temp = root;
	        BinaryNode minNodeForRight = minimumNode(temp.right);
	        root.value = minNodeForRight.value;
	        root.right = deleteNode(root.right, minNodeForRight.value);
	      } else if (root.left != null) {
	        root = root.left;
	      } else if (root.right != null) {
	        root = root.right;
	      } else {
	        root = null;
	      }
	    }

	    return root;

	  }
	
	public static BinaryNode minimumNode(BinaryNode root) {
	    if (root.left == null) {
	      return root;
	    } else {
	      return minimumNode(root.left);
	    }
	  }
	
}
