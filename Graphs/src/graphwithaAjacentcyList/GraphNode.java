package graphwithaAjacentcyList;
import java.util.ArrayList;

public class GraphNode {
	String value;
	int index;
	boolean isVisited = false;
	GraphNode parent;
	
	ArrayList<GraphNode> connections;
	
	GraphNode(String value, int index){
		this.value = value;
		this.index = index;
		
		connections = new ArrayList<GraphNode>();
	}
}
