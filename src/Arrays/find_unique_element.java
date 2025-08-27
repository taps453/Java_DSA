package Arrays;

import java.util.HashSet;

public class find_unique_element {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,5,5,5,6,7};
//		unique_element(arr);
		unique_element1(arr);
	}
	
	public static void unique_element(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();	
		for(int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
	}
	
	public static void unique_element1(int[] arr) {
		int n = arr.length;
		int[] new_arr = new int[n];
		
		for(int i : arr) {
			
		}
		
		for(int x : new_arr) {
			System.out.print(x + " ");
		}
	}
}
