package graphwithList;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Vertex> list = new ArrayList<Vertex>();
		list.add(new Vertex("A", 0));
		list.add(new Vertex("B", 1));
		list.add(new Vertex("C", 2));
		list.add(new Vertex("D", 3));
		list.add(new Vertex("E", 4));
		
		Graph graph = new Graph(list);
		graph.addUndirectedEdge(0, 1);
		graph.addUndirectedEdge(0, 3);
		graph.addUndirectedEdge(0, 2);
		graph.addUndirectedEdge(2, 3);
		graph.addUndirectedEdge(1, 4);
		graph.addUndirectedEdge(3, 4);
		
		System.out.println(graph.toString());
	}
}