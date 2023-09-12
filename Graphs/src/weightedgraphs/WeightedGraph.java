package weightedgraphs;

import java.util.*;

public class WeightedGraph {
	ArrayList<WeightedNode> nodeList;
	
	WeightedGraph(ArrayList<WeightedNode> list){
		nodeList = list;
	}
	
	public void addWeightedEdge(int i, int j, int weight) {
		WeightedNode first = nodeList.get(i);
		WeightedNode second = nodeList.get(j);
		
		first.connections.add(second);
		first.weights.put(second, weight);
	}
	
	public void printPath(WeightedNode node) {
		if(node.parent != null) {
			printPath(node.parent);
		}
		System.out.print(node.value+" ");
	}
	
	public void dijkstra(WeightedNode node) {
		node.distance = 0;
		PriorityQueue<WeightedNode> queue = new PriorityQueue();
		queue.addAll(nodeList);
		
		while(!queue.isEmpty()) {
			WeightedNode curNode = queue.poll();
			
			for(WeightedNode con: curNode.connections) {
				if(queue.contains(con)) {
					if(con.distance > curNode.distance + curNode.weights.get(con)) {
						con.distance = curNode.distance + curNode.weights.get(con);
						con.parent = curNode;
						queue.remove(con);
						queue.add(con);
					}
				}
			}
		}
		
		for(WeightedNode nd: nodeList) {
			System.out.print(node.value+" -> "+nd.value+" distance: "+nd.distance
					+" shortes path : ");
			printPath(nd);
			System.out.println();
		}
	}
	
	public void bellmanFord(WeightedNode sourceNode) {
		sourceNode.distance = 0;
		
		for(int i = 0; i < nodeList.size(); i++) {
			for(WeightedNode curNode: nodeList) {
				for(WeightedNode con: curNode.connections) {
					if(con.distance > curNode.distance + curNode.weights.get(con)) {
						con.distance = (curNode.distance + curNode.weights.get(con));
						con.parent = curNode;
					}
				}
			}
		}
		
		System.out.println("Checking for negetive cycles....");
		for(WeightedNode curNode: nodeList) {
			for(WeightedNode con: curNode.connections) {
				if(con.distance > curNode.distance + curNode.weights.get(con)) {
					System.out.println("Negetive Cycle found !!");
					System.out.println("Current distance to "+con.value+" is "+con.distance);
					System.out.println("New Distance is "+ (curNode.distance + curNode.weights.get(con)));
					return;
				}
			}
		}
		
		System.out.println("Printing shortest paths using Bellman Ford algorithm :");
		for(WeightedNode node: nodeList) {
			System.out.print(sourceNode.value+" -> "+node.value+" Dist : "+node.distance+" Path: ");
			printPath(node);
			System.out.println();
		}
	}
}
