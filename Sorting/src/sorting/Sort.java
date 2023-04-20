package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int actIter = 0; actIter < arr.length - 1 - i; actIter++) {
				if(arr[actIter] > arr[actIter + 1]) {
					int temp = arr[actIter];
					arr[actIter] = arr[actIter + 1];
					arr[actIter + 1] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j])minIndex = j;
			}
			
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	
	public static void insertionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int prevEnd = i - 1;
			while(prevEnd >= 0 && arr[prevEnd] > arr[prevEnd + 1]) {
				int temp = arr[prevEnd];
				arr[prevEnd] = arr[prevEnd + 1];
				arr[prevEnd + 1] = temp;
				prevEnd--;
			}
		}
	}
	
	public static void bucketSort(int[] arr) {
		int noOfBuckets = (int)Math.round(Math.sqrt(arr.length));
		int maxValue = Integer.MIN_VALUE;
		for(int num: arr) {
			if(num > maxValue)maxValue = num;
		}
		
		ArrayList[] buckets = new ArrayList[noOfBuckets];
		for(int i = 0; i < noOfBuckets; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
		
		for(int num: arr) {
			int bucketNo = (int)Math.ceil(num * (noOfBuckets / maxValue));
			buckets[bucketNo].add(num);
		}
		
		System.out.println("Printing buckets before sorting");
		ArrayHelper.printBuckets(buckets);
		
		for(ArrayList<Integer> list: buckets) {
			Collections.sort(list);
		}
		
		System.out.println("Printing buckets after sorting");
		ArrayHelper.printBuckets(buckets);
		
		int index = 0;
		for(ArrayList<Integer> list: buckets) {
			for(Integer num: list) {
				arr[index] = num;
				index++;
			}
		}
		
	}
	
	public static void mergeSort(int[] arr) {
		Sort.mergeRecur(arr, 0, arr.length - 1);
	}

	public static void mergeRecur(int[] arr, int left, int right) {
		if(left < right) {
			int middle = (left + right)/2;
			mergeRecur(arr, left, middle);
			mergeRecur(arr, middle+1, right);
			ArrayHelper.sortMerg(arr, left, middle, right);
		}
		
	}
	
	public static void quickSort(int[] arr) {
		quickRecur(arr, 0, arr.length - 1);
	}

	public static void quickRecur(int[] arr, int start, int end) {
		if(start < end) {
			int newPivot = ArrayHelper.pivot(arr, start, end);
			quickRecur(arr, start, newPivot - 1);
			quickRecur(arr, newPivot + 1, end);
		}
	}
}
