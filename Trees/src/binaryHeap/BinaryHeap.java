package binaryHeap;

public class BinaryHeap {
	int[] arr;
	int size;
	
	BinaryHeap(int siz){
		arr  = new int[siz + 1];
		size = 0;
		System.out.println("New Binary Heap of size "+siz+ " has been created");
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == arr.length - 1;
	}
	
	public Integer peek() {
		if(isEmpty()) {
			System.out.println("heap is emtpy!!");
			return null;
		}
		return arr[1];
	}
	
	public int size() {
		return size;
	}
	
	public void levelOrder() {
		if(isEmpty()) {
			System.out.println("Tree Empty!!");
			return;
		}
		for(int i = 1; i <= size; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//heapify for insert
	public void heapifyBottomToTop(int index, String heapType) {
		if(index <= 1)return;
		
		int parent = index / 2;
		
		if(heapType == "min") {
			if(arr[parent] > arr[index]) {
				int temp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = temp;
			}
		}
		else if(heapType == "max") {
			if(arr[parent] < arr[index]) {
				int temp = arr[index];
				arr[index] = arr[parent];
				arr[parent] = temp;
			}
		}
		
		heapifyBottomToTop(parent, heapType);	
	}
	
	//insert
	public void insert(int value, String heapType) {
		if(isFull()) {
			System.out.println("Tree Overflow!!!");
			return;
		}
		
		arr[++size] = value;
		heapifyBottomToTop(size, heapType);
		System.out.println("Value "+value+" inserted to tree");
	}
	
	//heapifyforextraction
	public void heapifyTopToBottom(int index, String heapType) {
		int left = index*2;
		int right = index*2 + 1;
		int swapChild = 0;
		
		if(left > size)return;
		
		if(heapType == "min") {
			if(left == size) {
				if(arr[left] < arr[index]) {
					int temp = arr[left];
					arr[left] = arr[index];
					arr[index] = temp;
				}
				return;
			}
			
			else {
				if(arr[left] < arr[right])swapChild = left;
				else swapChild = right;
				
				if(arr[swapChild] < arr[index]) {
					int temp = arr[swapChild];
					arr[swapChild] = arr[index];
					arr[index] = temp;
				}
			}
		}
		else if(heapType == "max") {
			if(left == size) {
				if(arr[left] > arr[index]) {
					int temp = arr[left];
					arr[left] = arr[index];
					arr[index] = temp;
				}
			}
			
			else {
				if(arr[left] > arr[right])swapChild = left;
				else swapChild = right;
				
				if(arr[swapChild] < arr[index]) {
					int temp = arr[swapChild];
					arr[swapChild] = arr[index];
					arr[index] = temp;
				}
			}
		}
		
		heapifyTopToBottom(swapChild, heapType);
	}
	
	//extract
	public Integer extract(String heapType) {
		if(isEmpty()) {
			System.out.println("Tree Empty!!");
			return null;
		}
		int extraction = arr[1];
		arr[1] = arr[size--];
		
		heapifyTopToBottom(1, heapType);
		return extraction;
	}
}
