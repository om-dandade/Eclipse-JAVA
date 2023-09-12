package disjointSets;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<WeightedNode> list = new ArrayList<WeightedNode>();
		list.add(new WeightedNode("A"));
		list.add(new WeightedNode("B"));
		list.add(new WeightedNode("C"));
		list.add(new WeightedNode("D"));
		list.add(new WeightedNode("E"));
		
		Krushkal graph = new Krushkal(list);
		
		graph.addWeightedUndirectedEdge(0, 1, 5);
		graph.addWeightedUndirectedEdge(0, 2, 13);
		graph.addWeightedUndirectedEdge(0, 4, 15);
		graph.addWeightedUndirectedEdge(1, 2, 10);
		graph.addWeightedUndirectedEdge(1, 3, 8);
		graph.addWeightedUndirectedEdge(2, 3, 6);
		graph.addWeightedUndirectedEdge(2, 4, 20);
		
		System.out.println("Initiating Krushkal");
		graph.krushkal();
	}
}
