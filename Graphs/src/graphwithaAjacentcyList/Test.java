package graphwithaAjacentcyList;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<GraphNode> list = new ArrayList<GraphNode>();
		GraphNode A = new GraphNode("A", 0);
		GraphNode E = new GraphNode("E", 4);
		list.add(A);
		list.add(new GraphNode("B", 1));
		list.add(new GraphNode("C", 2));
		list.add(new GraphNode("D", 3));
		list.add(E);
		list.add(new GraphNode("F", 5));
		list.add(new GraphNode("G", 6));
		list.add(new GraphNode("H", 7));
		list.add(new GraphNode("K", 8));
		
		Graph graph = new Graph(list);
		graph.addDirectedEdge(0, 2);
		graph.addDirectedEdge(1, 2);
		graph.addDirectedEdge(2, 4);
		graph.addDirectedEdge(4, 7);
		graph.addDirectedEdge(4, 5);
		graph.addDirectedEdge(5, 6);
		graph.addDirectedEdge(1, 3);
		graph.addDirectedEdge(3, 5);
		graph.addDirectedEdge(2, 8);
		graph.addDirectedEdge(8, 5);
		
		
		System.out.println(graph.toString()+"\n");
		graph.bfsShortPath(A);
	}
}