package genral;

import java.util.Arrays;

public class Genral {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 5, 2, 10, 6};
		String[] days = {"Mond", "Tuedd", "Wed"};
		
		Arrays.sort(arr, (a, b) -> Integer.compare(a, b));
		//Arrays.sort(days, (a, b) -> Integer.compare(a.length(), b.length()));
		
		for(int val: arr)System.out.print(val+" ");
	}
}

