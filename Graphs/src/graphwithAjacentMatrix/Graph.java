package graphwithAjacentMatrix;
import java.util.ArrayList;

public class Graph {
	ArrayList<Vertex> vertexs;
	int[][] matrix;
	
	Graph(ArrayList<Vertex> vertexs){
		this.vertexs = vertexs;
		matrix = new int[vertexs.size()][vertexs.size()];
	}
	
	public void addUndirectedEdge(int i, int j) {
		matrix[i][j] = 1;
		matrix[j][i] = 1;
	}
	
	@Override
	public String toString() {
	    StringBuilder s = new StringBuilder();
	    s.append("   ");
	    for (int i = 0; i < vertexs.size(); i++) {
	      s.append(vertexs.get(i).value + " ");
	    }
	    s.append("\n");
	    for (int i = 0; i < vertexs.size(); i++) {
	      s.append(vertexs.get(i).value + ": ");
	      for (int j : matrix[i]) {
	        s.append((j) + " ");
	      }
	      s.append("\n");
	    }
	    return s.toString();
	  }
}
