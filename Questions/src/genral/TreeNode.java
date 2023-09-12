package genral;


public class TreeNode {
	public int data;      
	public TreeNode left;    
	public TreeNode right; 
	public TreeNode parent;
	public int size = 0;
	
	public void print() {
		printTree("");
	}
	
	public void printTree(String spacing) {
		
		System.out.println(spacing+"├──"+data);
		
		if(left != null)left.printTree(spacing+"│  ");
		if(right != null)right.printTree(spacing+"│  ");
	}

	public TreeNode(int d) {
		data = d;
		size = 1;
	}

    public int height(){
        int lefth = left != null ? left.height() : 0;
        int righth = right != null ? right.height() : 0;
        
        return 1 + Math.max(lefth, righth);
    }
	
	public static TreeNode createMinimalBST(int[] nums) {
     return toBST(nums, 0, nums.length - 1);
    }

    public static TreeNode toBST(int[] nums, int start, int end){
        if(start > end)return null;
        int mid = (start + end) / 2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums, start, mid - 1);
        root.right = toBST(nums, mid + 1, end);
        
        return root;
    }
} 
