package binaryHeap;

public class HeapSort {
	public static void sort(int[] arr) {
		BinaryHeap heap = new BinaryHeap(arr.length);
		
		for(int num: arr) {
			heap.insert(num, "min");
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = heap.extract("min");
		}
	}
}
