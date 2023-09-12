package disjointSets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Krushkal {
	ArrayList<WeightedNode> nodeList;
	ArrayList<Edge> edgeList;
	
	Krushkal(ArrayList<WeightedNode> nodeList){
		this.nodeList = nodeList;
		edgeList = new ArrayList<Edge>();
	}
	
	public void addWeightedUndirectedEdge(int one, int two, int weight) {
		WeightedNode first = nodeList.get(one);
		WeightedNode second = nodeList.get(two);
		
		Edge edge = new Edge(first, second, weight);
		edgeList.add(edge);
		
		first.connections.add(second);
		second.connections.add(first);
		
		first.weights.put(second, weight);
		second.weights.put(first, weight);
	}
	
	public void krushkal() {
		int cost = 0;
		Comparator<Edge> comparator = new Comparator<Edge>() {
			@Override
			public int compare(Edge one, Edge two) {
				return one.weight - two.weight;
			}
		};
		
		Collections.sort(edgeList, comparator);
		
		DisjointSet.makeSet(nodeList);
		
		for(Edge edge: edgeList) {
			if(!(edge.first.set == edge.second.set)) {
				DisjointSet.union(edge.first, edge.second);
				System.out.println("Taken "+ edge);
				cost += edge.weight;
			}
		}
		
		System.out.println("\n Total cost of MST is "+cost);
	}
}
