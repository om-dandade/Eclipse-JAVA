package disjointSets;

public class Edge {
	WeightedNode first;
	WeightedNode second;
	int weight;
	
	Edge(WeightedNode first, WeightedNode second, int weight){
		this.first = first;
		this.second = second;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Edge: "+first.value+" -> "+second.value+", Weight = "+weight;
	}
}
