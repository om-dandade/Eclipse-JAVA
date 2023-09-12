package disjointSets;

import java.util.ArrayList;

public class DisjointSet {
	ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();
	
	public static void makeSet(ArrayList<WeightedNode> nodeList) {
		for(WeightedNode node: nodeList) {
			DisjointSet set = new DisjointSet();
			set.nodeList.add(node);
			node.set = set;
		}
	}
	
	public static DisjointSet findSet(WeightedNode node) {
		return node.set;
	}
	
	public static DisjointSet union(WeightedNode node1, WeightedNode node2) {
		if(node1.set == node2.set)return null;
		
		if(node1.set.nodeList.size() > node2.set.nodeList.size()) {
			return unionInternal(node1, node2);
		}
		else return unionInternal(node2, node1);
	}
	
	private static DisjointSet unionInternal(WeightedNode node1, WeightedNode node2) {
		for(WeightedNode node: node2.set.nodeList) {
			node1.set.nodeList.add(node);
			node.set = node1.set;
		}
		
		return node1.set;
	}
	
	public void printSet() {
		System.out.print("All node Under this set: ");
		for(WeightedNode node: nodeList) {
			System.out.print(node.value+" ");
		}
	}
}
