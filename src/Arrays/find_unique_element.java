package Arrays;

import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class find_unique_element {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,5,5,5,6,7};
		
		unique_element(arr);
		unique_element1(arr);
		unique_element2(arr);
		unique_element3(arr);
	}
	
	public static void unique_element(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();	
		for(int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
	}
	
	public static void unique_element1(int[] arr) {
		List<Integer> ls = Arrays.stream(arr)
								 .distinct()
								 .boxed()
								 .collect(Collectors.toList());
		System.out.println(ls);
	}
	
	public static void unique_element2(int[] arr) {
		Arrays.sort(arr);
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if( i == 0 || arr[i] != arr[i-1]) {
				lst.add(arr[i]);
			}
		}
		System.out.println(lst);
	}
	
	public static void unique_element3(int[] arr) {
		int n = arr.length;
		ArrayList<Integer> ls = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			boolean found = false;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					found = true;
					break;
				}
			}
			if(!found) {
				ls.add(arr[i]);
			}
		}
		System.out.println(ls);
	}
}
