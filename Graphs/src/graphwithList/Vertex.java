package graphwithList;
import java.util.ArrayList;

public class Vertex {
	String value;
	int index;
	
	ArrayList<Vertex> connections;
	
	Vertex(String value, int index){
		this.value = value;
		this.index = index;
		
		connections = new ArrayList<Vertex>();
	}
}
