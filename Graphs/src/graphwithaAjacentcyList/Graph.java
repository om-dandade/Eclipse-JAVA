package graphwithaAjacentcyList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	ArrayList<GraphNode> nodeList;
	
	Graph(ArrayList<GraphNode> nodeList){
		this.nodeList = nodeList;
	}
	
	public void addUndirectedEdge(int i, int j) {
		GraphNode first = nodeList.get(i);
		GraphNode second = nodeList.get(j);
		
		first.connections.add(second);
		second.connections.add(first);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(GraphNode vert: nodeList) {
			sb.append(vert.value+": ");
			for(GraphNode connection: vert.connections) {
				sb.append(connection.value+"-> ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	//Bfs for each node
	private void bfsVisit(GraphNode node) {
		LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(node);
		node.isVisited = true;
		
		while(!queue.isEmpty()) {
			GraphNode curNode = queue.poll();
			System.out.print(curNode.value+" ");
			
			for(GraphNode neb: node.connections) {
				if(!neb.isVisited) {
					queue.add(neb);
					neb.isVisited = true;
				}
			}
		}
	}
	
	public void bfs() {
		for(GraphNode node: nodeList) {
			if(!node.isVisited) bfsVisit(node);
		}
	}
	
	//DFS per node
	private void dfsVisit(GraphNode node) {
		Stack<GraphNode> stack = new Stack<GraphNode>();
		stack.push(node);
		node.isVisited = true;
		
		while(!stack.isEmpty()) {
			GraphNode curNode = stack.pop();
			System.out.print(curNode.value+" ");
			
			for(GraphNode neb: curNode.connections) {
				if(!neb.isVisited) {
					stack.push(neb);
					neb.isVisited = true;
				}
			}
		}
	}
	
	public void dfs() {
		for(GraphNode node: nodeList) {
			if(!node.isVisited)dfsVisit(node);
		}
	}
}
