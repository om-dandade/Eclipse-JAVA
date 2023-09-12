package genral;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Comparator<String> comp = new Comparator<>() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
		
		String[] arr = {"daf", "asdf", "asfdasf", "d", "ds"};
		Arrays.sort(arr, comp);
		
		for(String str: arr) {
			System.out.print(str +" ");
		}
	}
	
	public static void print(List<List<Integer>> list){
	    for(List<Integer> ele: list){
	        System.out.println(ele.get(0)+" "+ele.get(1));
	    }
	}
}