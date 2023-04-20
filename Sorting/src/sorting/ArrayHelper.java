package sorting;

import java.util.ArrayList;

public class ArrayHelper {
	public static void printarr(int[] arr) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void printBuckets(ArrayList[] buckets) {
		for(ArrayList<Integer> list: buckets) {
			System.out.println(list.size()+" ");
			for(Integer num: list) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void sortMerg(int[] arr, int left, int middle, int right) {
		int[] tempLeftArr = new int[middle-left+2];
		int[] tempRightArr = new int[right-middle+1];
		
		for(int i = 0; i < tempLeftArr.length - 1; i++) {
			tempLeftArr[i] = arr[left + i];
		}
		
		for(int i = 0; i < tempRightArr.length - 1; i++) {
			tempRightArr[i] = arr[middle + 1 + i];
		}
		
		tempLeftArr[tempLeftArr.length - 1] = Integer.MAX_VALUE;
		tempRightArr[tempRightArr.length - 1] = Integer.MAX_VALUE;
		
		int i = 0, j = 0;
		for(int k = left; k <= right; k++) {
			if(tempLeftArr[i] < tempRightArr[j]) {
				arr[k] = tempLeftArr[i];
				i++;
			}else {
				arr[k] = tempRightArr[j];
				j++;
			}
		}
	}

	public static int pivot(int[] arr, int start, int end) {
		int i = start - 1;
		int j = start;
		
		for(; j <= end; j++) {
			if(arr[j] <= arr[end]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i;
	}
}