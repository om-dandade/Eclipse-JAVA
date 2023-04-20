package avlTree;

public class BinaryNode {
	int value;
	
	BinaryNode left;
	BinaryNode right;
	int height;
	
	BinaryNode(int key){
		this.value = key;
		this.height = 1;
	}
	
	BinaryNode(){
		super();
	}
}
