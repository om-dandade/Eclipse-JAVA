package graphwithaAjacentcyList;
import java.util.ArrayList;

public class GraphNode {
	String value;
	int index;
	boolean isVisited = false;
	
	ArrayList<GraphNode> connections;
	
	GraphNode(String value, int index){
		this.value = value;
		this.index = index;
		
		connections = new ArrayList<GraphNode>();
	}
}
