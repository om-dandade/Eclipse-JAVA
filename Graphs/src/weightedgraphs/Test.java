package weightedgraphs;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		ArrayList<WeightedNode> list = new ArrayList<WeightedNode>();
		
		list.add(new WeightedNode("A", 0));
		list.add(new WeightedNode("B", 1));
		list.add(new WeightedNode("C", 2));
		list.add(new WeightedNode("D", 3));
		list.add(new WeightedNode("E", 4));
		list.add(new WeightedNode("F", 5));
		list.add(new WeightedNode("G", 6));
		
		WeightedGraph graph = new WeightedGraph(list);
		
		graph.addWeightedEdge(0, 1, 2);
		graph.addWeightedEdge(0, 2, 5);
		graph.addWeightedEdge(1, 2, 6);
		graph.addWeightedEdge(1, 3, 1);
		graph.addWeightedEdge(4, 1, -6);
		graph.addWeightedEdge(2, 5, 8);
		graph.addWeightedEdge(3, 4, 2);
		graph.addWeightedEdge(4, 6, 9);
		graph.addWeightedEdge(5, 6, 7);
		
		graph.dijkstra(list.get(0));
	}
}
