package Arrays;

import java.util.HashSet;

public class two_sum {

	public static void main(String[] args) {
		int[] arr = {2,3,1,6,7,5,4};
		int target = 12;
//		sum_2(arr,target);
//		sum_two(arr, target);
		two_sum_Hashset(arr, target);
	}
	
	public static void sum_2(int[] arr,int target) {
		int n = arr.length;
		int left = 0,right = n-1;
		boolean found = false;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				System.out.println("Numbers are - " + arr[left] + " "+ arr[right]);
				System.out.println("Indexs are - " + left + " " + right);
				found = true;
				left++;
				right--;
			}
			else if( sum < target) {
				left++;
			}else {
				right--;
			}
		}
		if(!found) {
			System.out.println("Not found");
		}
	}
	
	//brute force
	public static void sum_two(int[] arr, int target) {
		for(int i = 0; i < arr.length - 1; i++) {
			int num = target - arr[i];
			for(int j = i+1 ;j < arr.length; j++) {
				if(arr[j] == num) {
					System.out.println(arr[i] +"  "+arr[j]);
				}
			}
		}
	}
	
	public static void two_sum_Hashset(int[] arr, int target){
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int x : arr) {
			int num = target - x;
			if(hs.contains(num)) {
				System.out.println(num + " "+ x);
			}
			hs.add(x);
		}
	}
}
