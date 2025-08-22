package Arrays;

public class maximum_sum_subarray {

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4}; // output = 6
		int[] arr1 = {2, 3, -8, 7, -1, 2, 3}; // output = 11
		System.out.println(max_sum(arr));
		System.out.println(max_sum1(arr1));
	}
	
	public static int max_sum(int[] arr) {
		int n = arr.length;
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
	
	public static int max_sum1(int[] arr){
		
		int cur_sum = arr[0], total_sum = arr[0];
		for(int i = 1; i < arr.length; i++) {
			cur_sum = Math.max(cur_sum + arr[i] , arr[i]);
			total_sum = Math.max(total_sum, cur_sum);
		}
		return total_sum;
		
	}
}
