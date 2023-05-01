package graphwithList;
import java.util.ArrayList;

public class Graph {
	ArrayList<Vertex> vertexs;
	
	Graph(ArrayList<Vertex> vertexs){
		this.vertexs = vertexs;
	}
	
	public void addUndirectedEdge(int i, int j) {
		Vertex first = vertexs.get(i);
		Vertex second = vertexs.get(j);
		
		first.connections.add(second);
		second.connections.add(first);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Vertex vert: vertexs) {
			sb.append(vert.value+": ");
			for(Vertex connection: vert.connections) {
				sb.append(connection.value+"-> ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
