package genral;

import java.util.Arrays;

public class Genral {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		TreeNode root = TreeNode.createMinimalBST(arr);
		root.print();
	}
}

