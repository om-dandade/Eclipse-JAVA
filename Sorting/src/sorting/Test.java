package sorting;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 3, 6, 2, 9, 2, 10};
		ArrayHelper.printarr(arr);
		
		Sort.quickSort(arr);
		ArrayHelper.printarr(arr);
	}
}
