package weightedgraphs;

import java.util.*;

public class WeightedNode implements Comparable<WeightedNode>{
	String value;
	int index;
	WeightedNode parent;
	int distance = Integer.MAX_VALUE;
	boolean isVisited = false;
	
	List<WeightedNode> connections = new ArrayList<>();
	Map<WeightedNode, Integer> weights = new HashMap<>();
	
	WeightedNode(String value, int index){
		this.value = value;
		this.index = index;
	}
	
	@Override
	public int compareTo(WeightedNode second) {
		return this.distance - second.distance;
	}
}
