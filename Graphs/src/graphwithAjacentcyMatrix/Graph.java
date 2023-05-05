package graphwithAjacentcyMatrix;
import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
	ArrayList<GraphNode> nodeList;
	int[][] matrix;
	
	Graph(ArrayList<GraphNode> nodeList){
		this.nodeList = nodeList;
		matrix = new int[nodeList.size()][nodeList.size()];
	}
	
	public void addUndirectedEdge(int i, int j) {
		matrix[i][j] = 1;
		matrix[j][i] = 1;
	}
	
	@Override
	public String toString() {
	    StringBuilder s = new StringBuilder();
	    s.append("   ");
	    for (int i = 0; i < nodeList.size(); i++) {
	      s.append(nodeList.get(i).value + " ");
	    }
	    s.append("\n");
	    for (int i = 0; i < nodeList.size(); i++) {
	      s.append(nodeList.get(i).value + ": ");
	      for (int j : matrix[i]) {
	        s.append((j) + " ");
	      }
	      s.append("\n");
	    }
	    return s.toString();
	  }
	
	//healper
	public ArrayList<GraphNode> getNeibers(GraphNode node){
		ArrayList<GraphNode> neibers = new ArrayList<GraphNode>();
		int nodeIndex = node.index;
		for(int i = 0; i < matrix.length; i++) {
			if(matrix[nodeIndex][i] == 1)neibers.add(nodeList.get(i));
		}
		
		return neibers;
	}
	
	//Bfs for node
	private void bfsVisit(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(node);
		node.isVisited = true;
		
		while(!queue.isEmpty()) {
			GraphNode curNode = queue.poll();
			System.out.print(curNode.value+" ");
			
			ArrayList<GraphNode> neibers = getNeibers(curNode);
			for(GraphNode neb: neibers) {
				if(!neb.isVisited) {
					queue.add(neb);
					neb.isVisited = true;
				}
			}
		}
	}
	
	public void bfs() {
		for(GraphNode node: nodeList) {
			if(!node.isVisited)bfsVisit(node);
		}
	}
}
