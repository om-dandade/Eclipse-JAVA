package main;

import java.util.Scanner;

public class AboveTemp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many days you want to add temprature for ? ");
		int days = sc.nextInt();
		
		int[] arr = new int[days];
		int sum = 0;
		//taking all tempareture
		for(int i = 0 ; i < days; i++) {
			System.out.println("Enter " + (i+1) + " day's temperature: " );
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("\n");
		
		//calculating all the required results
		double avg = sum/days;
		int aboveAvg = 0;
		
		for(int i =0; i < days; i++) {
			if(arr[i] > avg) {
				aboveAvg++;
			}
		}
		
		//printing results
		System.out.println("The avarage temperature is " + avg + "degree celcius");
		System.out.println("And " + aboveAvg + " days had temperature above average");
	}
}
