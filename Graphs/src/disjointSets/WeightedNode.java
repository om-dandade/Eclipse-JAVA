package disjointSets;

import java.util.*;

public class WeightedNode implements Comparable<WeightedNode>{
	String value;
	WeightedNode parent;
	int distance = Integer.MAX_VALUE;
	boolean isVisited = false;
	DisjointSet set = null;
	
	List<WeightedNode> connections = new ArrayList<>();
	Map<WeightedNode, Integer> weights = new HashMap<>();
	
	WeightedNode(String value){
		this.value = value;
	}
	
	@Override
	public int compareTo(WeightedNode second) {
		return this.distance - second.distance;
	}
}
