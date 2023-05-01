package com.searching.om;

public class Search {
	public static int linearSearch(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				System.out.println("Key "+key+" found at index "+i);
				return i;
			}
		}
		System.out.println("Key "+key+" not found in array");
		return -1;
	}
	
	public static int binarySearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		int mid;
		
		while(start <= end) {
			mid = (start + end)/2;
			
			if(arr[mid] == key) {
				System.out.println("Found at index "+ mid);
				return mid;
			}
			
			if(arr[mid] > key) {
				end = mid - 1;
			}
			if(arr[mid] < key) {
				start = mid + 1;
			}
		}
		
		System.out.println("Not found!!");
		return -1;
	}
}
