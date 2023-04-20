package binaryTree;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
	BinaryNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void preOrderTraversal(BinaryNode root) {
		if(root == null)return;
		
		System.out.print(root.value+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public void inOrderTraversal(BinaryNode root) {
		if(root == null)return;
		
		inOrderTraversal(root.left);
		System.out.print(root.value+" ");
		inOrderTraversal(root.right);
	}
	
	public void postOrderTraversal(BinaryNode root) {
		if(root == null)return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.value+" ");
	}
	
	public void levelOrderTraversal(BinaryNode root) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode current = queue.remove();
			System.out.print(current.value+" ");
			
			if(current.left != null) queue.add(current.left);
			if(current.right != null) queue.add(current.right);
		}
	}
	
	public void search(String str) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode current = queue.remove();
			if(current.value.equals(queue)) {
				System.out.println(str+" found in Tree.");
				return;
			}
			
			if(current.left != null)queue.add(current.left);
			if(current.right != null)queue.add(current.right);
		}
		
		System.out.println(str+" not found in the tree!!");
	}
	
	public void insert(String value) {
		BinaryNode node = new BinaryNode(value);
		if(root == null) {
			root = node;
			System.out.println("NOde added at root.");
			return;
		}
		
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode current = queue.remove();
			if(current.left == null) {
				current.left = node;
				System.out.println("Value added successfully");
				return;
			}
			if(current.right == null) {
				current.right = node;
				System.out.println("Value added successfully");
				return;
			}
			
			queue.add(current.left);
			queue.add(current.right);
		}
	}
	
	public void deleteDeepestNode() {
		if(root == null) {
			System.out.println("Tree empty!!");
			return;
		}
		
		Queue<BinaryNode> que = new LinkedList<BinaryNode>();
		que.add(root);
		
		BinaryNode previousNode;
		BinaryNode currentNode = null;
		while(!que.isEmpty()) {
			currentNode = que.remove();
			
			if(currentNode.left == null) {
				currentNode = null;
				return;
			}else {
				previousNode = currentNode.left;
			}
			if(currentNode.right == null) {
				previousNode.left = null;
				return;
			}
			
			que.add(currentNode.left);
			que.add(currentNode.right);
		}
	}
}
