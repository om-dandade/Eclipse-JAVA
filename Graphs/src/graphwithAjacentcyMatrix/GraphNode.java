package graphwithAjacentcyMatrix;

public class GraphNode {
	String value;
	int index;
	boolean isVisited = false;
	
	GraphNode(String value, int index){
		this.value = value;
		this.index = index;
	}
}
