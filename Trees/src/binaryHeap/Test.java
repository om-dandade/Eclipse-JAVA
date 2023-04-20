package binaryHeap;


public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 3, 6, 2, 9, 2, 10};
		printarr(arr);
		
		HeapSort.sort(arr);
		printarr(arr);
	}
	
	private static void printarr(int[] arr) {
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
}
