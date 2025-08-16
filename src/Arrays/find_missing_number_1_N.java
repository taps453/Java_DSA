package Arrays;

public class find_missing_number_1_N {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6};
		System.out.println(missing_number(arr));
		System.out.println(missing_number1(arr));
	}
	
	public static int missing_number(int[] arr) {
		int n = arr.length + 1;
		int sum = 0;
		int sum1 = (n * (n + 1)) / 2;
		for(int x : arr) {
			sum += x;
		}
		return sum1-sum;
	}
	
	public static int missing_number1(int[] arr) {
		int n = arr.length + 1;
		int[] hash = new int[n + 1];
		
		for(int i = 0; i < n-1; i++) {
			hash[arr[i]]++;
		}
		for(int i = 1; i <= n; i++) {
			if(hash[i] == 0) {
				return i;
			}
		}
		return -1;
	}
}
