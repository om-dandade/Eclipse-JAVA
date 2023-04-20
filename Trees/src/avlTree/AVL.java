package avlTree;

import java.util.LinkedList;
import java.util.Queue;
public class AVL {
	BinaryNode root;
	
	AVL(){
		root = null;
	}
	
	//Preorder Traversal
	public void preOrder(BinaryNode root) {
		if(root == null)return;
		
		System.out.print(root.value+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//Inorder Traversal
	public void inOrder(BinaryNode root) {
		if(root == null)return;
		
		inOrder(root.left);
		System.out.print(root.value + " ");
		inOrder(root.right);
	}
	
	//Postorder Traversal
	public void postOrder(BinaryNode root) {
		if(root == null)return;
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.value + " ");
	}
	
	//levelOrder Traversal
	public void levelOrder(BinaryNode root) {
		if(root == null) {
			System.out.println("Tree empty!!");
			return;
		}
		Queue<BinaryNode> que = new LinkedList<BinaryNode>();
		que.add(root);
		
		while(!que.isEmpty()) {
			BinaryNode presentNode = que.remove();
			System.out.print(presentNode.value + " ");
			if(presentNode.left != null) {
				que.add(presentNode.left);
			}
			if(presentNode.right != null) {
				que.add(presentNode.right);
			}
		}
	}
	
	//search
	public boolean search(BinaryNode root, int key) {
		if(root == null) {
			System.out.println("reached the end, Could'nt found the key!");
			return false;
		}
		if(root.value == key) {
			System.out.println("key Found, it exists in tree");
			return true;
		}
		if(root.value < key) {
			return search(root.left, key);
		}
		return search(root.right, key);
	}
	
	public int getHeigth(BinaryNode root) {
		if(root == null)return 0;
		return root.height;
	}
	
	private BinaryNode rotateRight(BinaryNode disbalancedNode) {
		BinaryNode newRoot = disbalancedNode.left;
		disbalancedNode.left = disbalancedNode.left.right;
		newRoot.right = disbalancedNode;
		disbalancedNode.height = 1 + Math.max(getHeigth(disbalancedNode.left), getHeigth(disbalancedNode.right));
		newRoot.height = 1 + Math.max(getHeigth(newRoot.left), getHeigth(newRoot.right));
		return newRoot;
	}
	
	private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
		BinaryNode newRoot = disbalancedNode.right;
		disbalancedNode.right = disbalancedNode.right.left;
		newRoot.left = disbalancedNode;
		disbalancedNode.height = 1 + Math.max(getHeigth(disbalancedNode.left), getHeigth(disbalancedNode.right));
		newRoot.height = 1 + Math.max(getHeigth(newRoot.left), getHeigth(newRoot.right));
		return newRoot;
	}
	
	private int getBalance(BinaryNode node) {
		if(node == null)return 0;
		return getHeigth(node.left) - getHeigth(node.right);
	}
	
	public BinaryNode insert(BinaryNode node, int key) {
		if(node == null)return new BinaryNode(key);
		
		if(key < node.value) 
			node.left = insert(node.left, key);
		else if(key > node.value)
			node.right = insert(node.right, key);
		else return node;
		
		//genral insertion complete.... headed for balncing the tree
		//updating height of current root/inserted node;
		
		node.height = Math.max(getHeigth(node.left), getHeigth(node.right)) + 1;
		
		int balance = getBalance(node);
		
		//checking condition so that i can apply opertion;
		
		//LL
		if(balance > 1 && key < node.left.value) {
			return rotateRight(node);
		}
		
		//LR
		if(balance > 1 && key > node.left.value) {
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		}
		//RR
		if(balance < -1 && key > node.right.value) {
			return rotateLeft(node);
		}
		
		//RL
		if(balance < -1 && key < node.right.value) {
			node.right = rotateRight(node.right);
			return rotateLeft(node);
		}
		
		return node;
	}
	
	public void insert2(int val) {
		root = insert(root, val);
	}
}
