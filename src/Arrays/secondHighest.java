package Arrays;

import java.util.*;

public class secondHighest {

	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1 }; // Output: 34
		int[] arr1 = {10, 5, 10}; // Output: 5
		int[] arr2 = {10, 10, 10}; // Output:
				
		System.out.println(highestsecond(arr));
		System.out.println(highestsecond(arr1));
		System.out.println(highestsecond(arr2));
		
		List<Integer> al = Arrays.asList(12, 35, 1, 10, 34, 1);
		highestsecond1(al);
	}

	public static int highestsecond(int[] arr) {
		int n = arr.length;
		int high = Integer.MIN_VALUE;
		int sec_high = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > high) {
				sec_high = high;
				high = arr[i];
			}
			if (arr[i] > sec_high && high > arr[i]) {
				sec_high = arr[i];
			}
		}
		return sec_high;
	}
	
	public static void highestsecond1(List<Integer> al) {
			int high = Integer.MIN_VALUE;
			int sec_high = Integer.MIN_VALUE;
			
			for(int x : al) {
				if(x > high) {
					sec_high = high;
					high = x;
				}
				if(x > sec_high & high > x) {
					sec_high = x;
				}
			}
			System.out.println("Second High in a List : " + sec_high);
	}
}
