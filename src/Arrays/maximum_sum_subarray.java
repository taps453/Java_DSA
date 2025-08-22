package Arrays;

public class maximum_sum_subarray {

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; // output = 6
		int[] arr1 = {2, 3, -8, 7, -1, 2, 3}; // output = 11
		System.out.println(max_sum(arr1));
	}
	
	public static int max_sum(int[] arr) {
		int n = arr.length -1;
		int sum = arr[0];		
		for(int i = 0; i < n; i++) {
			int new_sum  = 0;
			for(int j = i; j < n; j++) {
				new_sum += arr[j];
				sum = Math.max(sum, new_sum);
			}
		}
		return sum;
	}
}
