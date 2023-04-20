package donno;

import java.util.ArrayList;

public class TreeNode {
	String data;
	ArrayList<TreeNode> children;
	
	public TreeNode(String data) {
		this.data = data;
		children = new ArrayList<TreeNode>();
	}
	
	public void addChild(TreeNode nd) {
		children.add(nd);
	}
	
	public String print(int level) {
		String str = "  ".repeat(level)+data+"\n";
		for(TreeNode nd: children) {
			str += nd.print(level+1);
		}
		return str;
	}
}
